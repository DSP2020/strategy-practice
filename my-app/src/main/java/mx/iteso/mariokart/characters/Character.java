package mx.iteso.mariokart.characters;

import mx.iteso.mariokart.behaviors.Acceleration;
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
     * @param acceleration the new acceleration
     */
    protected void setAcceleration(Acceleration newAcceleration) {
        this.acceleration = newAcceleration;
    }

    /**
     * Execute the behavior of accelerate.
     */
    public void accelerate() {
        acceleration.accelerate();
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
     * @param currentItem the new item to be assigned.
     */
    public void setCurrentItem(Item newCurrentItem) {
        if (this.currentItem == null) {
            this.currentItem = newCurrentItem;
        }
    }

    /**
     * Execute the current item and set it to null.
     */
    public void executeItem() {
        if (this.currentItem != null) {
            this.currentItem.executeItem();

            this.setCurrentItem(null);
        }
    }
}
