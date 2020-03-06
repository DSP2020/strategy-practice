package mx.iteso.mariokart;

import mx.iteso.mariokart.behaviors.Acceleration;

/**
 * A item baseclass.
 */
public abstract class Item {
    /**
     * The time duration of the item
     */
    private int time = 6;

    /**
     * Gets an acceleration the acceleration.
     * @return The acceleration.
     */
    abstract public Acceleration getAcceleration();
    
    /**
     * @return the durationTime
     */
    public int getDurationTime() {
        return time;
    }

    /**
     * Sets the item's duration.
     * @param timeNew the duration to set.
     */
    public void setDuration(int timeNew) {
        this.time = timeNew;
    }
}
