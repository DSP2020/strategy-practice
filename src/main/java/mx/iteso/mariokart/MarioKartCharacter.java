package mx.iteso.mariokart;

import mx.iteso.mariokart.behaviors.Acceleration;

public abstract class MarioKartCharacter {
    public Acceleration getActualAcceleration() {
        return actualAcceleration;
    }

    public MarioKartCharacter(Acceleration a) {
        this.actualAcceleration = a;
    }

    Acceleration actualAcceleration;
    private int totalMeters = 0;

    public void setActualAcceleration(Acceleration a) {
        this.actualAcceleration = a;
    }

    public void setTotalMeters(int totalMeters) {
        this.totalMeters = totalMeters;
    }

    public int getTotalMeters() {
        return totalMeters;
    }
}
