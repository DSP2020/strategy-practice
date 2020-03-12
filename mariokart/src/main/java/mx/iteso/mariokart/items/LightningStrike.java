package mx.iteso.mariokart.items;

import mx.iteso.mariokart.Item;
import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.implementation.SlowAcceleration;

/**
 * Lightning Strike class.
 */
public class LightningStrike extends Item {

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
     * Decrements the acceleration to SlowAcceleration.
     * @return The new acceleration.
     */
    @Override
    public Acceleration getAcceleration() {
        return new SlowAcceleration();
    }
}
