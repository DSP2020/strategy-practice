package com.strategy.practice.behaviors.imp;

import com.strategy.practice.behaviors.Acceleration;

/**
 * Aceleración Normal.
 */
public class NormalAcceleration implements Acceleration {
    /**
     * Acelera.
     * @return Aceleración.
     */
    @Override
    public String accelerate() {
        return "I´m running normal";
    }
}
