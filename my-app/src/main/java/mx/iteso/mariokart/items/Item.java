package mx.iteso.mariokart.items;

import mx.iteso.mariokart.behaviors.Acceleration;

/**
 * Parent class for all the items.
 */
public abstract class Item {
    /**
     * Acceleration when the item is executed.
     */
    protected Acceleration acceleration;

    /**
     * Get the acceleration of the item.
     * @return Acceleration interface
     */
    public Acceleration getAcceleration() {
        return acceleration;
    }

    /**
     * Set the acceleration of the item.
     * @param newAcceleration behavior
     */
    protected void setAcceleration(final Acceleration newAcceleration) {
        this.acceleration = newAcceleration;
    }

    /**
     * Abstract method to execute the item.
     */
    public abstract void executeItem();
}
