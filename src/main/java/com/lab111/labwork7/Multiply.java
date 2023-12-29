/**
 * The `Multiply` class represents a multiplication operation in the mathematical expression.
 * It implements the `Expression` interface.
 *
 * @author olegs
 */
package com.lab111.labwork7;
import java.util.Map;

public class Multiply implements Expression {
    private Expression left;
    private Expression right;

    /**
     * Constructs a `Multiply` expression with the specified left and right operands.
     *
     * @param left  The left operand of the multiplication.
     * @param right The right operand of the multiplication.
     */
    public Multiply(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * Interprets the multiplication expression by evaluating the left and right operands
     * and returning the product of their interpretations.
     *
     * @param context The context containing variable values.
     * @return The result of interpreting the multiplication expression.
     */
    @Override
    public int interpret(Map<String, Integer> context) {
        return left.interpret(context) * right.interpret(context);
    }
}