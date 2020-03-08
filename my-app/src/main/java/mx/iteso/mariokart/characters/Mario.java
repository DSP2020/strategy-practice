package mx.iteso.mariokart.characters;

import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.Drift;
import mx.iteso.mariokart.behaviors.impl.FastAcceleration;
import mx.iteso.mariokart.behaviors.impl.SlowDrift;

/**
 * Class of the Mario character.
 */
public class Mario extends Character {
    /**
     * Mario character constructor.
     */
    public Mario() {
        Acceleration acceleration = new FastAcceleration();
        setAcceleration(acceleration);

        Drift drift = new SlowDrift();
        setDrift(drift);
    }
}
