package mx.iteso.mariokart.characters;

import java.util.List;

import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.Drift;
import mx.iteso.mariokart.items.Item;

/**
 * Parent class to implement a character of Mario Kart.
 */
public class Character {
    /**
     * Acceleration for the character.
     */
    private Acceleration acceleration;

    /**
     * Drifting behavior for the character.
     */
    private Drift drift;

    /**
     * Current item of the character.
     */
    private Item currentItem;

    /**
     * Get the current acceleration of the character.
     * @return Acceleration of the character
     */
    public Acceleration getAcceleration() {
        return acceleration;
    }

    /**
     * Set the acceleration of the character.
     * @param newAcceleration the new acceleration
     */
    protected void setAcceleration(final Acceleration newAcceleration) {
        this.acceleration = newAcceleration;
    }

    /**
     * Execute the behavior of accelerate.
     * @return the message of the acceleration.
     */
    public String accelerate() {
        return acceleration.accelerate();
    }

    /**
     * Get the current item.
     * @return the current item
     */
    public Item getCurrentItem() {
        return currentItem;
    }

    /**
     * Set the current item.
     * @param newCurrentItem the new item to be assigned.
     */
    public void setCurrentItem(final Item newCurrentItem) {
        if (this.currentItem == null) {
            this.currentItem = newCurrentItem;
        }
    }

    /**
     * Execute the current item and set it to null.
     * @return the list with the acceleration messages.
     */
    public List<String> executeItem() {
        if (this.currentItem != null) {
            List<String> itemMessage = this.currentItem.executeItem();

            this.setCurrentItem(null);
            return itemMessage;
        }

        return null;
    }

    /**
     * Getter for the drift.
     * @return the drift implementation of the character.
     */
    public Drift getDrift() {
        return drift;
    }

    /**
     * Setter fot the drift.
     * @param newDrift interface.
     */
    public void setDrift(final Drift newDrift) {
        this.drift = newDrift;
    }
}
