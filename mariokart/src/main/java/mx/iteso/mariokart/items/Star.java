package mx.iteso.mariokart.items;

import mx.iteso.mariokart.Item;
import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.implementation.FastAcceleration;

/**
 * Star class.
 */
public class Star extends Item{

    
    /**
     * Increments the acceleration to FastAcceleration.
     * @return The new acceleration.
     */
    @Override
    public Acceleration getAcceleration() {
        return new FastAcceleration();
    }
}