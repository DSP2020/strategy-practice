package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.IAcceleration;

/**
 * A Super Fast Acceleration implementation.
 */
public class SuperFastAcceleration implements IAcceleration {

    /**
     * Prints Zoom Zoom Zoom Zoom.
     */
    @Override
    public void accelerate() {
        System.out.println("Zoom Zoom Zoom Zoom");
    }

    
}
