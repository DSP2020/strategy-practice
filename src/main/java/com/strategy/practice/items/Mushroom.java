package com.strategy.practice.items;

import com.strategy.practice.Item;
import com.strategy.practice.behaviors.Acceleration;
import com.strategy.practice.behaviors.imp.NormalAcceleration;

public class Mushroom extends Item {
    public Mushroom() {
        super();
        setAcceleration(new NormalAcceleration());
    }

    @Override
    public Acceleration modify() {
        return getAcceleration();
    }
}
