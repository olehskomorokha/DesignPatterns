package com.lab111.labwork5;

/**
 * The Button class represents a graphical button and extends the Subject class.
 * It overrides the click method to simulate a button click, and the update
 * method to handle updates from subscribed objects.
 */
public class Button extends Subject {

    /**
     * Simulates a click on the button and notifies subscribers.
     */
    public void click() {
        System.out.println("Button.Click()");
        notifySubscriber();
    }

    /**
     * Handles the update received from a subscribed object.
     *
     * @param updatedObject The object that triggered the update.
     */
    public void update(Subject updatedObject) {
        System.out.println("Button received update about change in "
                + updatedObject.toString());
    }

    /**
     * Returns a string representation of the Button object.
     *
     * @return A string representation of the Button object.
     */
    public String toString() {
        return "button";
    }

}