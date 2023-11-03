package ua.hillel.serebriakova.homeworks.homework18;

public class Main {

    public double calculateAverage(int[] array) {
        if (array.length == 0) {
            return 0.0;
        }

        double sum = 0;
        for (int value : array) {
            sum += value;
        }

        return sum / array.length;
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

