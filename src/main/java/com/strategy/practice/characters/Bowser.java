package com.strategy.practice.characters;

import com.strategy.practice.Characters;
import com.strategy.practice.Item;
import com.strategy.practice.behaviors.Acceleration;
import com.strategy.practice.behaviors.imp.SlowAcceleration;

public class Bowser extends Characters {

    public Bowser() {
        super();
        setAccelerationType(new SlowAcceleration());
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
