package mx.iteso.mariokart;

import mx.iteso.mariokart.behaviors.Acceleration;

/**
 * A item baseclass.
 */
public abstract class Item {

    /**
     * Gets an acceleration the acceleration.
     * @return The acceleration.
     */
    public abstract Acceleration getAcceleration();
    /**
     * @return the durationTime
     */
    public abstract int getDurationTime();

    /**
     * Sets the item's duration.
     * @param timeNew the duration to set.
     */
    public abstract void setDuration(int timeNew);
}
