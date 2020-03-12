package mx.iteso.mariokart.behaviors.impl;
import mx.iteso.mariokart.behaviors.Acceleration;

/**
 * slowAcel class.
 */
public class SlowAcceleration implements Acceleration {
    /**
     * var.
     */
    private final int accelerationValue = 10;

    /**
     *
     * @return string
     */
    public String accelerating() {
        return "Slow Acceleration";
    }

    /**
     *
     * @return accelerationValue acelValue
     */
    public int getAccelerationValue() {
        return accelerationValue;
    }
}
