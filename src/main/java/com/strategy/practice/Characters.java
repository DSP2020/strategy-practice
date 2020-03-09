package com.strategy.practice;

import com.strategy.practice.behaviors.Acceleration;
import com.strategy.practice.behaviors.Drifting;

public abstract class Characters {

    Acceleration accelerationType;
    Item item;
    Drifting driftType;

    public abstract String accelerate();
    public abstract String itemAcceleration();
    public abstract String drift();

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

    public Drifting getDriftType() {
        return driftType;
    }

    public void setDriftType(Drifting driftType) {
        this.driftType = driftType;
    }
}
