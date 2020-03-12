package mx.iteso.items;

import mx.iteso.Item;
import mx.iteso.behaviors.Acceleration;
import mx.iteso.behaviors.impl.acceleration.VeryFastAcceleration;

public class Mushroom extends Item {
    /**
     * Modifies the acceleration to Fast.
     * @return new Fast acceleration;
     */
    public Acceleration getAcceleration() {
        return new VeryFastAcceleration();
    }
}
