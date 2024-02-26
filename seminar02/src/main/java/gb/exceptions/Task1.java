package gb.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        run();

    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Укажите индекс эелемента массива, " +
                "в который хотите записать значение 1");
        int index =0;
        if (scanner.hasNextInt()) index = scanner.nextInt();
        else System.out.println("Введено не число");
        try {

            arr[index] = 1;
        } catch (IndexOutOfBoundsException ie){
            System.err.println("Указан индекс за пределами массива ");
        }
//        catch (InputMismatchException e) {
//            System.err.println(e);
//        }
        finally {
            scanner.close();
        }
    }
}
