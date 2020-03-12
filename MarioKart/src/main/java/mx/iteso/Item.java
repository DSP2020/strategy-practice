package mx.iteso;

import mx.iteso.behaviors.Acceleration;

public abstract class Item {
    private int duration = 1;

    public abstract Acceleration getAcceleration();

    public int getDuration() {
        return duration;
    }

    public void setDuration(final int duration1) {
        this.duration = duration1;
    }
}

