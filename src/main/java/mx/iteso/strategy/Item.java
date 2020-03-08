package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.IAcceleration;

/**
 * A item baseclass.
 */
public abstract class Item {
    /**
     * Default duration value.
     */
    private final int defualtDuration = 5;
    /**
     * The duration of the item.
     */
    private int duration = defualtDuration;

    /**
     * Gets an acceleration the acceleration.
     * @return The acceleration.
     */
    public abstract IAcceleration getAcceleration();

    /**
     * @return the duration.
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Sets the item's duration.
     * @param d the duration to set.
     */
    public void setDuration(final int d) {
        this.duration = d;
    }
}
