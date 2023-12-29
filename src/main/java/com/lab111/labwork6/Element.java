package com.lab111.labwork6;

/**
 * The `Element` interface represents an element in the composite structure.
 * It declares the `accept` method, allowing a visitor to visit and perform
 * operations specific to each concrete element type.
 * @author olegs
 */
public interface Element {
    /**
     * Accepts a `Visitor` and invokes the appropriate `visit` method for the
     * concrete element type, allowing the visitor to perform operations on the element.
     * @param visitor The visitor to accept.
     * @author olegs
     */
    void accept(Visitor visitor);
}