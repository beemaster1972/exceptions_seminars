package gb.exceptions.task4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 Напишите метод, на вход которого подаётся двумерный строковый массив размером 3х3.
 При подаче массива другого размера необходимо бросить исключение MyArraySizeException.

 1. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
 Если в каком-то элементе массива преобразование не удалось
 (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException
 с детализацией, в какой именно ячейке лежат неверные данные.

 2. В методе main() вызвать полученный метод, обработать возможные исключения
 MyArraySizeException и MyArrayDataException и вывести результат расчета
 (сумму элементов, при условии, что подали на вход корректный массив).
 */

public class Task4 {

    static String[][] arr = new String[][]{
            {"1", "1.5", "1.5"},
            {"1", "1.5w", "1.5"},
            {"1", "1.5", "1.5q"}
    };

    public static void main(String[] args) {
        System.out.println(sum2dv2(arr));
    }


    public static double sum2dv2(String[][] arr) {
        Map<Point2d, String> errMap = new HashMap<>();
        double result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length!=arr.length) throw new MyArraySizeException();
            for (int ii = 0; ii < arr[i].length; ii++) {
                try {
                    result += Double.parseDouble(arr[i][ii]);
                } catch (NumberFormatException e){
                    errMap.put(new Point2d(i,ii),arr[i][ii]);
                }

            }

        }
        if (!errMap.isEmpty()) throw new MyArrayDataException(errMap);
        return result;
    }
    public static double sum2d(String[][] arr) {
        double result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length!=arr.length) throw new MyArraySizeException();
            for (int ii = 0; ii < arr[i].length; ii++) {
                try {
                    result += Double.parseDouble(arr[i][ii]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(i,ii);
                }

            }

        }
        return result;
    }
}