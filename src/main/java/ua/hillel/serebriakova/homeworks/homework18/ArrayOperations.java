package ua.hillel.serebriakova.homeworks.homework18;

public class ArrayOperations {
    public double calculateAverage(int[] arr) {
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

    public boolean isSquareMatrix(int[][] matrix) {
        int rows = matrix.length;
        for (int[] row : matrix) {
            if (row.length != rows) {
                return false;
            }
        }
        return true;
    }
}
