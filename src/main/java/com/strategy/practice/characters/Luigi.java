package com.strategy.practice.characters;

import com.strategy.practice.Characters;
import com.strategy.practice.behaviors.Acceleration;
import com.strategy.practice.behaviors.imp.FastAcceleration;

public class Luigi extends Characters {

    public Luigi() {
        super();
        setAccelerationType(new FastAcceleration());
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
}
