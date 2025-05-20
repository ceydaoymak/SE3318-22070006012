package org.example;

/**
 * This class shows simple examples of using loops.
 * All methods follow Checkstyle rules.
 */
public class ExampleUsage {

    /**
     * Task 4: Counts how many even numbers are in the range 1 to 20.
     * Uses a foreach loop.
     */
    public int filterAndCountEvenNumbers() {
        int[] numbers = new int[20];
        for (int i = 0; i < 20; i++) {
            numbers[i] = i + 1;
        }

        int count = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                count++;
            }
        }

        System.out.println("Even number count: " + count);
        return count;
    }

    /**
     * Task 5: Adds the diagonal numbers of a 3x3 matrix.
     */
    public int matrixDiagonalSum() {
        int[][] matrix = {
                {5, 1, 9},
                {2, 6, 4},
                {7, 8, 3}
        };

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += matrix[i][i];
        }

        System.out.println("Matrix diagonal sum: " + sum);
        return sum;
    }

    /**
     * Extra: Prints even numbers from 1 to 10.
     */
    public void displayEvenNumbers() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("Even number: " + number);
            }
        }
    }

    /**
     * Extra: Adds all numbers in an array.
     */
    public int sumArray() {
        int[] numbers = {5, 10, 15, 20, 25};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sum of array: " + sum);
        return sum;
    }

    /**
     * Extra: Prints all values in a 3x3 matrix.
     */
    public void processMatrix() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Element at [" + i + "][" + j + "] is " + matrix[i][j]);
            }
        }
    }

    /**
     * Bad example: Declares a variable but uses it later.
     * This breaks the Checkstyle rule for variable usage distance.
     * Kept like this to show incorrect practice.
     */
    public void incorrectVariableUsage() {
        int index;
        System.out.println("Preparing to loop");
        index = 0;
        for (; index < 5; index++) {
            System.out.println(index);
        }
    }

}
