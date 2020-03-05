package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.IAcceleration;

/**
 * A Normal Acceleration implementation
 */
public class NormalAcceleration implements IAcceleration {

    /**
     * Prints Zoom Zom.
     */
    @Override
    public void accelerate() {
        System.out.println("Zoom Zoom");
    }

    
}
