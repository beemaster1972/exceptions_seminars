package gb.exceptions;

import java.io.IOException;

/**
 Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение
 внутренней int переменной на 1. Сделайте так, чтобы с объектом такого типа
 можно было работать в блоке try-with-resources. Подумайте, что должно происходить
 при закрытии этого ресурса? Напишите метод для проверки, закрыт ли ресурс.
 При попытке вызвать add() у закрытого ресурса, должен выброситься IOException
 */
public class Counter implements AutoCloseable  {
    private int count = 0;
    private boolean closed = false;
    public int add() throws Exception{
        if (closed){
            throw new IOException("Resource closed");
        }
        return ++count;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void close() throws Exception {
        System.out.printf("Count = %d%n", count);
        System.out.println("Resource closed");
        closed = true;
    }
}

class Printer{
    public static void main(String[] args) throws Exception {
        Counter counter = new Counter();
//        System.out.println(counter.getCount());
//        counter.add();
//        System.out.println(counter.getCount());
//        counter.close();
//        counter.add();
        try (counter){
          System.out.println(counter.getCount());
          counter.add();
          System.out.println(counter.getCount());

        }
        counter.add();
    }
}