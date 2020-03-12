package mx.iteso.mariokart;

import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.Drifting;

/**
 * abs class.
 */
public abstract class MarioKartCharacter {
    /**
     *
     * @return actualAc
     */
    public Acceleration getActualAcceleration() {
        return actualAcceleration;
    }

    /**
     *
     * @param a .
     */
    public  MarioKartCharacter(final Acceleration a) {
        this.actualAcceleration = a;
    }

    /**
     * acel var.
     */
    private Acceleration actualAcceleration;
    /**
     * totalM var.
     */
    private int totalMeters = 0;
    /**
     * D drifting.
     */
    private Drifting drifting;

    /**
     *
     * @param a .
     */
    public void setActualAcceleration(final Acceleration a) {
        this.actualAcceleration = a;
    }

    /**
     *
     * @param totalM tM .
     */
    public void setTotalMeters(final int totalM) {
        this.totalMeters = totalM;
    }

    /**
     *
     * @return totalM .
     */
    public int getTotalMeters() {
        return totalMeters;
    }

    /**
     * void method .
     */
    public void setDrifting() {
        this.drifting = drifting;
    }

    /**
     *
     * @return .
     */
    public Drifting getDrifting() {
        return this.drifting;
    }
}
