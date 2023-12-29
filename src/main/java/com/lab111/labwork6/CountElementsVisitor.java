package com.lab111.labwork6;

import java.util.HashMap;
import java.util.Map;

/**
 * The `CountElementsVisitor` class is a concrete visitor that implements
 * the `Visitor` interface. It counts the number of occurrences of each element type
 * (e.g., buttons) within the visited composite structure.
 * @author olegs
 */
public class CountElementsVisitor implements Visitor {
    private Map<String, Integer> countMap = new HashMap<>();

    /**
     * Visits a `Panel` element (not implemented for counting in this example).
     * @param panel The panel to visit.
     * @author olegs
     */
    @Override
    public void visitPanel(Panel panel) {
        // Implementation not needed for this example
    }

    /**
     * Visits a `Button` element and increments the count for buttons.
     * @param button The button to visit.
     * @author olegs
     */
    @Override
    public void visitButton(Button button) {
        String buttonType = button.getClass().getSimpleName();
        countMap.put(buttonType, countMap.getOrDefault(buttonType, 0) + 1);
    }

    /**
     * Gets the count map containing the number of occurrences for each element type.
     * @return The count map.
     * @author olegs
     */
    public Map<String, Integer> getCountMap() {
        return countMap;
    }
}