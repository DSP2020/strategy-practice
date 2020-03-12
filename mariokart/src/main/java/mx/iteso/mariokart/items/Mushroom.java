package mx.iteso.mariokart.items;

import mx.iteso.mariokart.Item;
import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.implementation.VeryFastAcceleration;

/**
 * Mushroom class.
 */
public class Mushroom extends Item {

    /**
    * Variable.
    */
    private final int tIME = 6;
    /**
     * The time duration of the item.
     */
    private int time = tIME;
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
    public void setDuration(final int timeNew) {
        this.time = timeNew;
    }

    /**
     * Increments the acceleration to VeryFastAcceleration.
     * @return The new acceleration.
     */
    @Override
    public Acceleration getAcceleration() {
        return new VeryFastAcceleration();
    }
}
