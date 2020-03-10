package com.strategy.practice.behaviors.imp;

import com.strategy.practice.behaviors.Drifting;

/**
 * Derrape corto.
 */
public class ShortDrift implements Drifting {
    /**
     * Derrapa.
     * @return derrape.
     */
    @Override
    public String drift() {
        return "I'm heavy and slow, I barely drift >:(";
    }
}
