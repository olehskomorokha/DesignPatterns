/**
 * The `Divide` class represents a division operation in the mathematical expression.
 * It implements the `Expression` interface.
 *
 * @author olegs
 */
package com.lab111.labwork7;
import java.util.Map;

public class Divide implements Expression {
    private Expression left;
    private Expression right;

    /**
     * Constructs a `Divide` expression with the specified left and right operands.
     *
     * @param left  The left operand of the division.
     * @param right The right operand of the division.
     */
    public Divide(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * Interprets the division expression by evaluating the left and right operands
     * and returning the result of their division. Throws an `ArithmeticException`
     * if division by zero is attempted.
     *
     * @param context The context containing variable values.
     * @return The result of interpreting the division expression.
     * @throws ArithmeticException If division by zero is attempted.
     */
    @Override
    public int interpret(Map<String, Integer> context) {
        int divisor = right.interpret(context);
        if (divisor != 0) {
            return left.interpret(context) / divisor;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }
}