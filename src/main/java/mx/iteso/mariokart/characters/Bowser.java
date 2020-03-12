package mx.iteso.mariokart.characters;

import mx.iteso.mariokart.MarioKartCharacter;
import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.Drifting;
import mx.iteso.mariokart.behaviors.impl.SlowAcceleration;
import mx.iteso.mariokart.behaviors.impl.YellowDrifting;

/**
 * Bowser class.
 */
public class Bowser extends MarioKartCharacter {
    /**
     * static.
     */
    static final Acceleration ACCELERATION = new SlowAcceleration();

    /**
     * super.
     */
    public Bowser() {
        super(ACCELERATION);
    }

    /**
     * drifting var.
     */
    private Drifting drifting = new YellowDrifting();
}
