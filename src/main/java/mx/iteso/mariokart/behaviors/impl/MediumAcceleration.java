package mx.iteso.mariokart.behaviors.impl;

import mx.iteso.mariokart.behaviors.Acceleration;

public class MediumAcceleration implements Acceleration {
    int accelerationValue = 15;
    public String accelerating() {
        return "Medium Acceleration";
    }

    @Override
    public int getAccelerationValue() {
        return accelerationValue;
    }
}
