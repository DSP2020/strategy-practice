package com.strategy.practice.behaviors.imp;

import com.strategy.practice.behaviors.Acceleration;

public class FastAcceleration implements Acceleration {
    @Override
    public String accelerate() {
        return "I´m very very very fast";
    }
}
