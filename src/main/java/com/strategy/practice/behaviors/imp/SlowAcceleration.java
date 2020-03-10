package com.strategy.practice.behaviors.imp;

import com.strategy.practice.behaviors.Acceleration;

/**
 * Aceleración lenta.
 */
public class SlowAcceleration implements Acceleration {
    /**
     * Acelera.
     * @return Aceleración.
     */
    @Override
    public String accelerate() {
        return "Help me, I'm slow :(";
    }
}
