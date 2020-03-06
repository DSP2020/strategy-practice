package mx.iteso.mariokart.items;

import mx.iteso.mariokart.Item;
import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.implementation.VeryFastAcceleration;

/**
 * Mushroom class.
 */
public class Mushroom extends Item{

    
    /**
     * Increments the acceleration to VeryFastAcceleration.
     * @return The new acceleration.
     */
    @Override
    public Acceleration getAcceleration() {
        return new VeryFastAcceleration();
    }
}