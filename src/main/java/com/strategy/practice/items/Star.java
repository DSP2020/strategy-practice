package com.strategy.practice.items;

import com.strategy.practice.Item;
import com.strategy.practice.behaviors.Acceleration;
import com.strategy.practice.behaviors.imp.FastAcceleration;

public class Star extends Item {

    public Star() {
        super();
        setAcceleration(new FastAcceleration());
    }

    @Override
    public Acceleration modify() {
        return getAcceleration();
    }
}
