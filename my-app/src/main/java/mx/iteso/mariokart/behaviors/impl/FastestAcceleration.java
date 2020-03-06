package mx.iteso.mariokart.behaviors.impl;

import mx.iteso.mariokart.behaviors.Acceleration;

/**
 * Fastest acceleration behavior.
 */
public class FastestAcceleration implements Acceleration {
    /**
     * Execute the fastest acceleration behavior.
     */
    @Override
    public void accelerate() {
        System.out.println("Broom broom broom broom");
    }
}
