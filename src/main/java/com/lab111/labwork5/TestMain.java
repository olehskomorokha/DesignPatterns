package com.lab111.labwork5;
/**
 * The Main class serves as the entry point for the application.
 * It demonstrates the usage of Button, Window, and TextLabel classes
 * in a simple scenario where button clicks and text clicks are handled
 * by a common Window subscriber.
 * @author olegs
 */
public final class TestMain {

    /**
     * Private constructor to prevent instantiation of the Main class.
     * @author olegs
     */
    private TestMain() {
        super();
    }

    /**
     * The main method initializes instances of Button, Window, and TextLabel,
     * adds subscribers to the button and text, and simulates button and text clicks.
     * @author olegs
     * @param args The command-line arguments (not used in this application).
     */
    public static void main(final String[] args) {
        // Create instances of Button, Window, and TextLabel
        Button button = new Button();
        Window window = new Window();
        TextLabel text = new TextLabel();

        // Add the window as a subscriber to the button
        button.addSubscriber(window);
        // Add the window as a subscriber to the text
        text.addSubscriber(window);

        // Simulate a button click
        button.click();
        // Simulate a text click
        text.click();
    }

}