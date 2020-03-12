package mx.iteso.mariokart.characters;

import mx.iteso.mariokart.MarioKartCharacter;
import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.Drifting;
import mx.iteso.mariokart.behaviors.impl.MediumAcceleration;
import mx.iteso.mariokart.behaviors.impl.RedDrifting;

/**
 * PeachPrincess class.
 */
public class PeachPrincess extends MarioKartCharacter {
    /**
     * mediuam acel.
     */
    static final Acceleration ACCELERATION = new MediumAcceleration();

    /**
     * method.
     */
    public PeachPrincess() {
        super(ACCELERATION);
    }

    /**
     * drifting.
     */
    private Drifting drifting = new RedDrifting();
}
