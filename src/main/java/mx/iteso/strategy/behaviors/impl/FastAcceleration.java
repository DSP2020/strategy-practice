package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.IAcceleration;

/**
 * A Fast Acceleration implementation.
 */
public class FastAcceleration implements IAcceleration {

    /**
     * Prints Zoom Zoom Zoom.
     */
    @Override
    public void accelerate() {
        System.out.println("Zoom Zoom Zoom");
    }

    
}
