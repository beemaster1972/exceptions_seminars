package gb.exceptions;

import java.util.Scanner;

/**
 Создайте метод doSomething(), который может быть источником одного
 из типов checked exceptions(тело самого метода прописывать не обязательно).
 Вызовите этот метод из main и обработайте в нем исключение, которое вызвал
 метод doSomething().
 */
public class Task1 {
    public void doSomething()throws Exception{
    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        try {
            task1.doSomething();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}