package _DailyQuestions;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class TransposeMatrixTest {

    @Test
    public void case_1() {
        int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expected = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        int[][] actual = TransposeMatrix.transpose(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void case_2() {
        int[][] input = {{1, 2, 3}, {4, 5, 6}};
        int[][] expected = {{1, 4}, {2, 5}, {3, 6}};
        int[][] actual = TransposeMatrix.transpose(input);
        assertArrayEquals(expected, actual);
    }

}