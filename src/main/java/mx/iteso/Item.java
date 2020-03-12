package mx.iteso;

import mx.iteso.behaviors.Acceleration;
/**
 * Item class.
 */
public abstract class Item {
    /**
     * Default duration value.
     */
    private int duration = 1;

    /**
     * GET method the acceleration.
     * @return The acceleration.
     */
    public abstract Acceleration getAcceleration();
    /**
     * @return the duration.
     */
    public int getDuration() {
        return duration;
    }
    /**
     * SET method of theduration.
     * @param duration1 the duration to set.
     */
    public void setDuration(final int duration1) {
        this.duration = duration1;
    }
}

