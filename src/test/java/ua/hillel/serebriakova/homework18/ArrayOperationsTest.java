package ua.hillel.serebriakova.homework18;

import org.junit.jupiter.api.Assertions;
import ua.hillel.serebriakova.homeworks.homework18.ArrayOperations;

import org.junit.jupiter.api.Test;

public class ArrayOperationsTest {

    @Test
    public void testCalculateAverage() {
        ArrayOperations arrayOperations = new ArrayOperations();
        int[] testArray = {5, 10, 15, 20, 25};
        double expectedAverage = 15.0;

        double actualAverage = arrayOperations.calculateAverage(testArray);
        Assertions.assertEquals(expectedAverage, actualAverage, 0.0001);
    }

    @Test
    public void testIsSquareMatrix() {
        ArrayOperations arrayOperations = new ArrayOperations();
        int[][] squareMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] nonSquareMatrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        Assertions.assertTrue(arrayOperations.isSquareMatrix(squareMatrix));
        Assertions.assertFalse(arrayOperations.isSquareMatrix(nonSquareMatrix));
    }
}


