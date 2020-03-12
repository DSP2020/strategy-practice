package mx.iteso.mariokart.behaviors.impl;
import mx.iteso.mariokart.behaviors.Acceleration;

/**
 * mediumAcel class.
 */
public class MediumAcceleration implements Acceleration {
    /**
     * acelValue var.
     */
    private final int accelerationValue = 15;

    /**
     *
     * @return String
     */
    public String accelerating() {
        return "Medium Acceleration";
    }

    /**
     *
     * @return accelerationValue acelValue
     */
    @Override
    public int getAccelerationValue() {
        return accelerationValue;
    }
}
