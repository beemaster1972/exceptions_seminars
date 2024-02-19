package gb.exceptions;

public class Main {
    public static void main(String[] args) {

        System.out.println(getArrayLength(new int[]{1,2,3,4,5}, 8));
    }

    private static int getArrayLength(int[] array, int minLength){
        if (array.length < minLength){
            return -1;
        }
        else return array.length;
    }
}