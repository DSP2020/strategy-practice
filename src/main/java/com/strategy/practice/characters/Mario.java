package com.strategy.practice.characters;

import com.strategy.practice.Characters;
import com.strategy.practice.behaviors.Acceleration;
import com.strategy.practice.behaviors.imp.NormalAcceleration;

public class Mario extends Characters {

    public Mario() {
        super();
        setAccelerationType(new NormalAcceleration());
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
