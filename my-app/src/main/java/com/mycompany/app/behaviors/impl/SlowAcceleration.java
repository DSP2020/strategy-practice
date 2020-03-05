package com.mycompany.app.behaviors.impl;

import com.mycompany.app.behaviors.Acceleration;

public class SlowAcceleration implements Acceleration {
    @Override
    public void accelerate() {
        System.out.println("Accelerating slowly");
    }
}
