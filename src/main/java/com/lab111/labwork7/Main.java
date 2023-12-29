/**
 * The `Main` class contains the main method to demonstrate the use of the expression
 * evaluator. It defines a mathematical expression, creates a context, and evaluates
 * the expression using the `Evaluator` class.
 *
 * @author olegs
 */
package com.lab111.labwork7;
import java.util.HashMap;
import java.util.Map;

public class Main {
    /**
     * The main method for demonstrating the use of the expression evaluator.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Define a mathematical expression
        String expression = "10 x + 2 - 9 /";
        Evaluator evaluator = new Evaluator(expression);
        // Create a context (no variables in this case)
        Map<String, Integer> context = Map.of("x",1);

        // Create an evaluator and evaluate the expression

        int result = evaluator.evaluate(context);

        // Display the result
        System.out.println("Result: " + result);
    }
}