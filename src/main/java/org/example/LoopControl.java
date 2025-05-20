package org.example;

/**
 * This class gives examples of good and bad loop usage.
 * It is used to test Checkstyle rules like:
 * - VariableDeclarationUsageDistance
 * - EmptyBlock
 * - ModifiedControlVariable
 */
public class LoopControl {

    /**
     * Task 1: Calculates the sum of squares from 1 to 10.
     * This is a correct example. The variable is used right after it's declared.
     */
    public int sumOfSquares() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares: " + sum);
        return sum;
    }

    /**
     * Task 2: Prints a triangle using stars (*).
     * The triangle has 5 lines. No empty blocks are used.
     */
    public void printTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to next line
        }
    }

    /**
     * Example of correct variable usage.
     * The variable is declared and used immediately.
     */
    public void correctVariableUsage() {
        int index = 0;
        for (; index < 5; index++) {
            System.out.println("Correct index: " + index);
        }
    }

    /**
     * This method has no empty blocks.
     * All conditions inside the loop do something.
     */
    public void avoidEmptyBlock() {
        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                System.out.println("Midpoint at: " + j);
            } else {
                System.out.println("Not midpoint at: " + j);
            }
        }
    }

    /**
     * This method breaks a Checkstyle rule.
     * It changes the loop variable inside the loop, which is not allowed.
     * This is an example of what NOT to do.
     */
    public void modifiedControlVariable() {
        for (int m = 0; m < 10; m++) {
            if (m == 5) {
                System.out.println("Adjusting loop index from " + m);
                m += 3; // Don't change loop variable inside the loop
                System.out.println("to " + m);
            }
        }
    }

    /**
     * This method shows a good loop.
     * The loop variable is NOT changed inside the loop body.
     */
    public void correctlyModifiedControlVariable() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Looping: " + i);
        }
    }
}
