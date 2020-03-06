package mx.iteso.mariokart.behaviors.impl;

import mx.iteso.mariokart.behaviors.Acceleration;

/**
 * Fast acceleration behavior.
 */
public class FastAcceleration implements Acceleration {
    /**
     * Execute the fast acceleration behavior.
     */
    @Override
    public void accelerate() {
        System.out.println("Broom broom");
    }
}
