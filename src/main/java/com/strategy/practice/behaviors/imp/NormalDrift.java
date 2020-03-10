package com.strategy.practice.behaviors.imp;

import com.strategy.practice.behaviors.Drifting;

/**
 * Derrape normal.
 */
public class NormalDrift implements Drifting {
    /**
     * Derrape.
     * @return derrapa.
     */
    @Override
    public String drift() {
        return "I'm normally drifting, nothing special :v";
    }
}
