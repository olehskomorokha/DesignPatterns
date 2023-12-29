/**
 * The `Subtract` class represents a subtraction operation in the mathematical expression.
 * It implements the `Expression` interface.
 *
 * @author olegs
 */
package com.lab111.labwork7;
import java.util.Map;

public class Subtract implements Expression {
    private Expression left;
    private Expression right;

    /**
     * Constructs a `Subtract` expression with the specified left and right operands.
     *
     * @param left  The left operand of the subtraction.
     * @param right The right operand of the subtraction.
     */
    public Subtract(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * Interprets the subtraction expression by evaluating the left and right operands
     * and returning the result of their subtraction.
     *
     * @param context The context containing variable values.
     * @return The result of interpreting the subtraction expression.
     */
    @Override
    public int interpret(Map<String, Integer> context) {
        return left.interpret(context) - right.interpret(context);
    }
}