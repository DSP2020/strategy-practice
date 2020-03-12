package mx.iteso.mariokart.behaviors.implementation;

import mx.iteso.mariokart.behaviors.Acceleration;

/**
 * Normal Acceleration implementation.
 */
public class NormalAcceleration implements Acceleration {

    /**
     * It return the actual acceleration.
     * @return The acceleration.
     */
    @Override
    public String accelerate() {
        String str = "Normal Acceleration";
        return str;
    }
}
