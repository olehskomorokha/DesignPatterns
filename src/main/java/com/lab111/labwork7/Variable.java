/**
 * The `Variable` class represents a variable in the mathematical expression.
 * It implements the `Expression` interface.
 *
 * @author olegs
 */
package com.lab111.labwork7;
import java.util.Map;

public class Variable implements Expression {
    private final String name;

    /**
     * Constructs a new variable with the specified name.
     *
     * @param name The name of the variable.
     */
    public Variable(String name) {
        this.name = name;
    }

    /**
     * Interprets the variable's value based on the provided context.
     *
     * @param context The context containing variable values.
     * @return The value of the variable.
     * @throws IllegalArgumentException If the variable is not found in the context.
     */
    @Override
    public int interpret(Map<String, Integer> context) {
        if (context.containsKey(name)) {
            return context.get(name);
        } else {
            throw new IllegalArgumentException("Variable not found: " + name);
        }
    }
}