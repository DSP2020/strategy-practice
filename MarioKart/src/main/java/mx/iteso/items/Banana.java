package mx.iteso.items;

import mx.iteso.Item;
import mx.iteso.behaviors.Acceleration;
import mx.iteso.behaviors.impl.acceleration.SlowAcceleration;

public class Banana extends Item {
    /**
     * Modifies the acceleration to slow.
     * @return new slow acceleration;
     */
    public Acceleration getAcceleration() {
        return new SlowAcceleration();
    }
}
