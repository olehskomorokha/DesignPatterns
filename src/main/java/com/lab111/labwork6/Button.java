package com.lab111.labwork6;

/**
 * The `Button` class represents a concrete element in the composite structure.
 * It implements the `Element` interface and provides an implementation for the `accept` method,
 * allowing a visitor to visit and perform operations specific to buttons.
 * @author olegs
 */
public class Button implements Element {
    /**
     * Accepts a `Visitor` and invokes the `visitButton` method specific to buttons.
     * @param visitor The visitor to accept.
     * @author olegs
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visitButton(this);
    }
}