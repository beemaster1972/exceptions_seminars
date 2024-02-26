package gb.exceptions.task3;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task3 {
    public static void main(String[] args) throws NonExistedFileException{
//        try {
//            divideByZero(1, 0);
//        } catch (DivideByZeroException e){
//            System.out.println("catch");
//        }
        fileNotfound("aaa");
    }

    public static double divideByZero(int a, int b) {
//        if (b==0) throw new DivideByZeroException("Деление на ноль!");
        return (double) a/b;
    }

    public static void fileNotfound(String path) throws NonExistedFileException{
        try {
            FileReader fileReader = new FileReader(path);
        } catch (FileNotFoundException e) {
            throw new NonExistedFileException();
        }
    }
}
