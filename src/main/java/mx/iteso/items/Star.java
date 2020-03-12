package mx.iteso.items;

import mx.iteso.Item;
import mx.iteso.behaviors.Acceleration;
import mx.iteso.behaviors.impl.acceleration.VeryFastAcceleration;

public class Star extends Item {
    /**
     * Modifies the acceleration to fast.
     * @return new fast acceleration;
     */
    public Acceleration getAcceleration() {
        return new VeryFastAcceleration();
    }
}
