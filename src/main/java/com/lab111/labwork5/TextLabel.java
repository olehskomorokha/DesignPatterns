package com.lab111.labwork5;

/**
 * The TextLabel class represents a graphical text label and extends the Subject class.
 * It overrides the click method to simulate a text label click, and the update
 * method to handle updates from subscribed objects.
 */
public class TextLabel extends Subject {

    /**
     * Simulates a click on the text label and notifies subscribers.
     */
    public void click() {
        System.out.println("Text.Click()");
        notifySubscriber();
    }

    /**
     * Handles the update received from a subscribed object.
     *
     * @param updatedObject The object that triggered the update.
     */
    public void update(Subject updatedObject) {
        System.out.println("Text received update about change in "
                + updatedObject.toString());
    }

    /**
     * Returns a string representation of the TextLabel object.
     *
     * @return A string representation of the TextLabel object.
     */
    public String toString() {
        return "text";
    }

}
