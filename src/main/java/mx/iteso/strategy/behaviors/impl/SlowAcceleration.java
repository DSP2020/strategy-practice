package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.IAcceleration;

/**
 * A Slow Acceleration implementation.
 */
public class SlowAcceleration implements IAcceleration{

    /**
     * Prints a Zoom.
     */
    @Override
    public void accelerate() {
        System.out.println("Zoom");
    }

    
}
