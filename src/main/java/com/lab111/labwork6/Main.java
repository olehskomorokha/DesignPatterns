package com.lab111.labwork6;
import java.util.Map;
/**
 * The `Main` class serves as the entry point for the application,
 * demonstrating the use of the Visitor pattern for counting the number of buttons
 * within a composite structure of panels and buttons.
 * @author olegs
 */
public class Main {
    /**
     * The main method creates a composite structure of panels and buttons,
     * accepts a `CountElementsVisitor` to count the number of buttons, and prints the result.
     * @param args Command line arguments (not used in this example).
     * @author olegs
     */
    public static void main(String[] args) {
        // Creating a panel
        Panel panel = new Panel();
        panel.addElement(new Button());
        panel.addElement(new Button());
        panel.addElement(new Button());
        panel.addElement(new Panel());
        panel.addElement(new Button());

        // Creating a visitor to count elements
        CountElementsVisitor countVisitor = new CountElementsVisitor();
        panel.accept(countVisitor);

        // Retrieving the count map and printing the number of buttons
        Map<String, Integer> countMap = countVisitor.getCountMap();
        System.out.println("Number of Buttons: " + countMap.getOrDefault("Button", 0));
    }
}