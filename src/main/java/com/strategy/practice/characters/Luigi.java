package com.strategy.practice.characters;

import com.strategy.practice.Characters;
import com.strategy.practice.behaviors.Acceleration;
import com.strategy.practice.behaviors.imp.FastAcceleration;
import com.strategy.practice.behaviors.imp.LongDrift;

public class Luigi extends Characters {

    public Luigi() {
        super();
        setAccelerationType(new FastAcceleration());
        setDriftType(new LongDrift());
    }

    @Override
    public String accelerate() {
        return getAccelerationType().accelerate();
    }

    @Override
    public String itemAcceleration() {
        Acceleration originalAcceleration = getAccelerationType();
        setAccelerationType(getItem().modify());
        String itemAcceleration = accelerate();
        setAccelerationType(originalAcceleration);
        return itemAcceleration;
    }

    @Override
    public String drift() {
        return getDriftType().drift();
    }
}
