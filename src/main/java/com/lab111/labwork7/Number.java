/**
 * The `Number` class represents a numeric constant in the mathematical expression.
 * It implements the `Expression` interface.
 *
 * @author olegs
 */
package com.lab111.labwork7;
import java.util.Map;

public class Number implements Expression {
    private int number;

    /**
     * Constructs a `Number` expression with the specified numeric value.
     *
     * @param number The numeric value of the constant.
     */
    public Number(int number) {
        this.number = number;
    }

    /**
     * Interprets the number expression by returning its numeric value.
     *
     * @param context The context containing variable values (not used for numbers).
     * @return The numeric value of the constant.
     */
    @Override
    public int interpret(Map<String, Integer> context) {
        return number;
    }
}