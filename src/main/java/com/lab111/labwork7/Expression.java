/**
 * The `Expression` interface represents an abstract mathematical expression
 * that can be interpreted to obtain a result.
 *
 * @author olegs
 */
package com.lab111.labwork7;
import java.util.Map;

public interface Expression {
    /**
     * Interprets the expression based on the provided context.
     *
     * @param context The context containing variable values.
     * @return The result of interpreting the expression.
     */
    int interpret(Map<String, Integer> context);
}