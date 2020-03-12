package mx.iteso.mariokart.characters;

import mx.iteso.mariokart.MarioKartCharacter;
import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.Drifting;
import mx.iteso.mariokart.behaviors.impl.BlueDrifting;
import mx.iteso.mariokart.behaviors.impl.FastAcceleration;

/**
 * DryBones class.
 */
public class DryBones extends MarioKartCharacter {
    /**
     * static method.
     */
    static final Acceleration ACCELERATION = new FastAcceleration();

    /**
     * super.
     */
    public DryBones() {
        super(ACCELERATION);
    }

    /**
     * drifting.
     */
    private Drifting drifting = new BlueDrifting();
}
