package mx.iteso.mariokart.behaviors.implementation;

import mx.iteso.mariokart.behaviors.Acceleration;

/**
 * Slow Acceleration implementation.
 */
public class SlowAcceleration implements Acceleration{

    /**
     * It return the actual acceleration.
     * @return The acceleration.
     */
    @Override
    public String accelerate() {
        String str = "Slow Acceleration";
        return str;
    }

    
}
