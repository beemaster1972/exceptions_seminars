package gb.exceptions;

/**
 * Обработайте возможные исключительные ситуации. "Битые" значения
 * в исходном массиве считайте нулями. Можно внести в код правки,
 * которые считаете необходимыми
 */
public class Task2 {
    public static void main(String[] args) {
        String[][] arr0 = new String[][]{
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"}
        };

        String[][] arr = new String[][]{
                {"1", null},
                {"1", "1", "1", "1", "1"},
                {"1", "2"},
                {"3", "3"},
                {"2", "6"}
        };
        int sum = sum2d(arr);
        System.out.println(sum);
        sum = sum2d(arr0);
        System.out.println(sum);
    }

    private static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==null){
                    throw new RuntimeException("Null!!");
                }
                if (arr[i][j].matches("\\d+")) {
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                } else System.out.println("Не число!");
            }
        }
        return sum;
    }
}

