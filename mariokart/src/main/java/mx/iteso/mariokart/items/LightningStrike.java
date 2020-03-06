package mx.iteso.mariokart.items;

import mx.iteso.mariokart.Item;
import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.implementation.SlowAcceleration;

/**
 * Lightning Strike class.
 */
public class LightningStrike extends Item{

    
    /**
     * Decrements the acceleration to SlowAcceleration.
     * @return The new acceleration.
     */
    @Override
    public Acceleration getAcceleration() {
        return new SlowAcceleration();
    }
}