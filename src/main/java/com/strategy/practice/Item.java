package com.strategy.practice;

import com.strategy.practice.behaviors.Acceleration;

public abstract class Item {
    private Acceleration acceleration;

    public abstract Acceleration modify();

    public Acceleration getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(Acceleration acceleration) {
        this.acceleration = acceleration;
    }
}
