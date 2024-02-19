package gb.exceptions;

public class SumOfMatrix {
    public static void main(String[] args) {
        int[][] ints = new int[][]{
                {1, 3, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 4}
        };
        System.out.println(sumOfMatrix(ints));

    }

    private static int sumOfMatrix(int[][] matrix){
        int result = 0;

        for (int i = 0; i < matrix.length; i++) {
        if (matrix.length != matrix[i].length) {
            throw new RuntimeException("Матрица не квадратная");
        }
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] <0 || matrix[i][j]>1){
                    System.out.println(result);
                    throw new RuntimeException("Элемент не равен 0 или 1");
                }

                result += matrix[i][j];


            }

        }
        return result;
    }
}
