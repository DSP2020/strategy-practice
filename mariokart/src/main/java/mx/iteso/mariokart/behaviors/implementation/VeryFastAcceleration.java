package mx.iteso.mariokart.behaviors.implementation;

import mx.iteso.mariokart.behaviors.Acceleration;

/**
 * Very Fast Acceleration implementation.
 */
public class VeryFastAcceleration implements Acceleration {

    /**
     * It return the actual acceleration.
     * @return The acceleration.
     */
    @Override
    public String accelerate() {
        String str = "Very Fast Acceleration";
        return str;
    }

    
}
