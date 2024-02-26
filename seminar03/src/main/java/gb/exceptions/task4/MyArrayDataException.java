package gb.exceptions.task4;

import java.util.Map;
public class MyArrayDataException extends NumberFormatException{
    public MyArrayDataException() {
        super();
    }

    public MyArrayDataException(int i,int ii) {
        super(String.format("В ячейке[%s;%s] не число",i,ii));
    }

    public MyArrayDataException(Map<Point2d,String> errMap) {
        super("Битые ячейки: " + errMap);
    }
}
