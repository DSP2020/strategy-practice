package mx.iteso.mariokart.behaviors.impl;

import mx.iteso.mariokart.behaviors.Acceleration;

public class FastAcceleration implements Acceleration {
    int accelerationValue = 20;
    public String accelerating() {
        return "Fast Acceleration";
    }

    @Override
    public int getAccelerationValue() {
        return accelerationValue;
    }
}
