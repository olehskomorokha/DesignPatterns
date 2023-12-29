package com.lab111.labwork6;
import java.util.ArrayList;
import java.util.List;

/**
 * The `Panel` class represents a composite element in the composite structure.
 * It implements the `Element` interface and maintains a list of child elements.
 * The `accept` method is implemented to allow a visitor to visit the panel and its children.
 * @author olegs
 */
public class Panel implements Element {
    private List<Element> elements = new ArrayList<>();

    /**
     * Adds a child element to the panel.
     * @param element The element to add.
     * @author olegs
     */
    public void addElement(Element element) {
        elements.add(element);
    }

    /**
     * Accepts a `Visitor` and invokes the `visitPanel` method for the panel
     * and recursively for its child elements.
     * @param visitor The visitor to accept.
     * @author olegs
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visitPanel(this);
        for (Element child : elements) {
            child.accept(visitor);
        }
    }
}