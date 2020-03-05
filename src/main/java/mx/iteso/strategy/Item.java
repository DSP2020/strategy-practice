package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.IAcceleration;

/**
 * A item baseclass.
 */
public abstract class Item {
    /**
     * The duration of the item
     */
    private int duration = 5;

    /**
     * Gets an acceleration the acceleration.
     * @return The acceleration.
     */
    abstract public IAcceleration getAcceleration();
    
    /**
     * @return the duration
     */
    public int getDuration() {
        return duration;
    }
    /**
     * Sets the item's duration.
     * @param duration the duration to set.
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }
}