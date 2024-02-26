package gb.exceptions.task4;

public class MyArraySizeException extends IndexOutOfBoundsException{
    public MyArraySizeException() {
        super("Матрица должна быть квадратной");
    }
}
