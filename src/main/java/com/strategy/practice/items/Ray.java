package com.strategy.practice.items;

import com.strategy.practice.Item;
import com.strategy.practice.behaviors.Acceleration;
import com.strategy.practice.behaviors.imp.SlowAcceleration;

public class Ray extends Item {

    public Ray() {
        super();
        setAcceleration(new SlowAcceleration());
    }

    @Override
    public Acceleration modify() {
        return getAcceleration();
    }
}
