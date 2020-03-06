package com.strategy.practice;

import com.strategy.practice.behaviors.Acceleration;

public abstract class Characters {
    Acceleration accelerationType;
    Item item;

    public abstract String accelerate();
    public abstract String itemAcceleration();

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Acceleration getAccelerationType() {
        return accelerationType;
    }

    public void setAccelerationType(Acceleration accelerationType) {
        this.accelerationType = accelerationType;
    }
}
