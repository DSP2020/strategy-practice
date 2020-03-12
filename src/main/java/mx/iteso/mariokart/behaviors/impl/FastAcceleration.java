package mx.iteso.mariokart.behaviors.impl;
import mx.iteso.mariokart.behaviors.Acceleration;

/**
 * fastAcel class.
 */
public class FastAcceleration implements Acceleration {
    /**
     * acelValue var.
     */
    private final int accelerationValue = 20;

    /**
     *
     * @return String
     */
    public String accelerating() {
        return "Fast Acceleration";
    }

    /**
     *
     * @return acelValue
     */
    @Override
    public int getAccelerationValue() {
        return accelerationValue;
    }
}
