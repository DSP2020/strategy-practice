package com.strategy.practice.behaviors.imp;

import com.strategy.practice.behaviors.Acceleration;

public class SlowAcceleration implements Acceleration {
    @Override
    public String accelerate() {
        return "Help me, I'm slow :(";
    }
}
