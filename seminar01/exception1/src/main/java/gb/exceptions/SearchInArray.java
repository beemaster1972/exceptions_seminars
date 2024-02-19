package gb.exceptions;

public class SearchInArray {
    public static void main(String[] args) {
        System.out.println(searchInArray(null, 15, 10));

    }

    /**
     *
     * @param array  массив
     * @param value  искомое значение
     * @param minLength  мин. длина массива
     * @return  индекс найденного элемента или<br> -1 - длина меньше<br> -3 - null<br> -2 - не найден элемент
     */
    private static int searchInArray(int[] array, int value, int minLength) {
        if (array == null) return -3;
        if (array.length < minLength) return -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) return i;
        }
        return -2;
    }
}
