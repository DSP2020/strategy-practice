package com.strategy.practice.behaviors.imp;

import com.strategy.practice.behaviors.Acceleration;

/**
 * Aceleración Rápida.
 */
public class FastAcceleration implements Acceleration {
    /**
     * Acelera.
     * @return acelera.
     */
    @Override
    public String accelerate() {
        return "I´m very very very fast";
    }
}
