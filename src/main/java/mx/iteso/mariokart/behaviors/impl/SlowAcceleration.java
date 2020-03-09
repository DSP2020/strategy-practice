package mx.iteso.mariokart.behaviors.impl;

import mx.iteso.mariokart.behaviors.Acceleration;

public class SlowAcceleration implements Acceleration {
    int accelerationValue = 10;
    public String accelerating() {
        return "Slow Acceleration";
    }

    public int getAccelerationValue() {
        return accelerationValue;
    }
}
