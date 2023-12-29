package com.lab111.labwork6;

/**
 * The `Visitor` interface declares methods for each concrete element type
 * to be visited in the composite structure.
 * @author olegs
 */
public interface Visitor {
    /**
     * Visits a `Panel` element and performs operations specific to panels.
     * @param panel The panel to visit.і
     * @author olegs
     */
    void visitPanel(Panel panel);

    /**
     * Visits a `Button` element and performs operations specific to buttons.
     * @param button The button to visit.
     * @author olegs
     */
    void visitButton(Button button);
}