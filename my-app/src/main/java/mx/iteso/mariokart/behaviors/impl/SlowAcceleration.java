package mx.iteso.mariokart.behaviors.impl;

import mx.iteso.mariokart.behaviors.Acceleration;

/**
 * Slow acceleration behavior.
 */
public class SlowAcceleration implements Acceleration {
    /**
     * Execute the slow acceleration behavior.
     */
    @Override
    public String accelerate() {
        return "Broom";
    }
}
