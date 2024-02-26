package gb.exceptions.task3;

import java.io.FileNotFoundException;

public class NonExistedFileException extends FileNotFoundException {
    public NonExistedFileException() {
        super("Файл не найден!");
    }

}
