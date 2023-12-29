/**
 * The `Add` class represents an addition operation in the mathematical expression.
 * It implements the `Expression` interface.
 * This class encapsulates the addition of two expressions, allowing their interpretation
 * and obtaining the sum of their results.
 *
 * @author olegs
 */
package com.lab111.labwork7;
import java.util.Map;

public class Add implements Expression {
    private Expression left;
    private Expression right;

    /**
     * Constructs an `Add` expression with the specified left and right operands.
     *
     * @param left  The left operand of the addition.
     * @param right The right operand of the addition.
     */
    public Add(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * Interprets the addition expression by evaluating the left and right operands
     * and returning the sum of their interpretations.
     *
     * @param context The context containing variable values.
     * @return The result of interpreting the addition expression.
     */
    @Override
    public int interpret(Map<String, Integer> context) {
        return left.interpret(context) + right.interpret(context);
    }
}