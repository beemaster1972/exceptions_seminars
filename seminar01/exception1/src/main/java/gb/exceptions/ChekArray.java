package gb.exceptions;

import java.util.*;

public class ChekArray {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 3, 4, 5, 6, null, null, 7, 10, 8, null};
        checkArray(array);
    }

    private static void checkArray(Integer[] arr) {
        List<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
//                throw new RuntimeException(String.format("Элемент null по индексу %d",i));
                //System.out.println(String.format("Элемент null по индексу %d",i));
                indexes.add(i);
            }

        }
        boolean isNull = indexes.isEmpty();
        if (isNull) {
            System.out.println("В массиве нет null");
        } else throw new RuntimeException(String.format("В ячейках массива %s null", indexes));
    }
}
