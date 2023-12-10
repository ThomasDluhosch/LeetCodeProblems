package _DailyQuestions;

public class TransposeMatrix {

    public static int[][] transpose(int[][] matrix) {

        int length1 = matrix.length;
        int length2 = matrix[0].length;

        int result[][] = new int[length2][length1];

        for (int i = 0; i < length2; i++) {
            for (int j = 0; j < length1; j++) {
                result[i][j] = matrix[j][i];
            }
        }
        return result;
    }

}
