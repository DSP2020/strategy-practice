package mx.iteso.mariokart.behaviors.implementation;

import mx.iteso.mariokart.behaviors.Acceleration;

/**
 * Fast Acceleration implementation.
 */
public class FastAcceleration implements Acceleration {

    /**
     * It return the actual acceleration.
     * @return The acceleration.
     */
    @Override
    public String accelerate() {
        String str = "Fast Acceleration";
        return str;
    }


    
}
