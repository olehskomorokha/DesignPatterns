package com.lab111.labwork5;

import java.util.ArrayList;
import java.util.List;
/**
 * The Subject class represents an observable object that can have subscribers.
 * It maintains a list of subscribers, notifies them about updates, and provides
 * methods to add and remove subscribers.
 */
public class Subject {

    /**
     * List of subscribers to notify upon updates.
     */
    public List<Subject> subscribers;

    /**
     * Default constructor that initializes the list of subscribers.
     */
    public Subject() {
        super();
        subscribers = new ArrayList<Subject>();
    }

    /**
     * Notifies all subscribers about an update.
     */
    public void notifySubscriber() {
        for (Subject subscriber : subscribers) {
            subscriber.update(this);
        }
    }

    /**
     * Placeholder method for handling updates. Subclasses should override
     * this method to provide specific update behavior.
     *
     * @param updatedObject The object that triggered the update.
     */
    public void update(Subject updatedObject) {
        // Default implementation does nothing
    }

    /**
     * Adds a new subscriber to the list.
     *
     * @param subscriber The subscriber to add.
     */
    public void addSubscriber(Subject subscriber) {
        subscribers.add(subscriber);
    }

    /**
     * Removes a subscriber from the list.
     *
     * @param subscriber The subscriber to remove.
     */
    public void deleteSubscriber(Subject subscriber) {
        subscribers.remove(subscriber);
    }

}