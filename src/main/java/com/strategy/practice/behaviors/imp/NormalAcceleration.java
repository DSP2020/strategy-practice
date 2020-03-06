package com.strategy.practice.behaviors.imp;

import com.strategy.practice.behaviors.Acceleration;

public class NormalAcceleration implements Acceleration {
    @Override
    public String accelerate() {
        return "I´m running normal";
    }
}
