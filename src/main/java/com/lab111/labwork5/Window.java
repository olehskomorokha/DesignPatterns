package com.lab111.labwork5;
/**
 * The Window class represents a graphical window and extends the Subject class.
 * It overrides the click method to simulate a window click, and the update
 * method to handle updates from subscribed objects.
 */



public class Window extends Subject {

    /**
     * Simulates a click on the window and notifies subscribers.
     */
	public void click() {
		System.out.println("Window.Click()");
		notifySubscriber();
	}
    /**
     * Handles the update received from a subscribed object.
     *
     * @param updatedObject The object that triggered the update.
     */

	public void update(Subject updatedObject) {
		System.out.println("Window прийняв повідомлення про зміну "
				+ updatedObject.toString());

	}
	  /**
     * Returns a string representation of the Window object.
     *
     * @return A string representation of the Window object.
     */
	public String toString() {
		return "window";

	}
}