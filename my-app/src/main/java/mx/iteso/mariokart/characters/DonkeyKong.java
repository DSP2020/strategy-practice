package mx.iteso.mariokart.characters;

import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.Drift;
import mx.iteso.mariokart.behaviors.impl.FastDrift;
import mx.iteso.mariokart.behaviors.impl.SlowAcceleration;

/**
 * Class of the Mario character.
 */
public class DonkeyKong extends Character {
    /**
     * Mario character constructor.
     */
    public DonkeyKong() {
        Acceleration acceleration = new SlowAcceleration();
        setAcceleration(acceleration);

        Drift drift = new FastDrift();
        setDrift(drift);
    }
}
