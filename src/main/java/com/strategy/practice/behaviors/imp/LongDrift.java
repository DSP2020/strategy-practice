package com.strategy.practice.behaviors.imp;

import com.strategy.practice.behaviors.Drifting;

/**
 * Derrape largo.
 */
public class LongDrift implements Drifting {
    /**
     * Derrapa.
     * @return derrape.
     */
    @Override
    public String drift() {
        return "I'm really drifting, so long, so fast, so cool :B";
    }
}
