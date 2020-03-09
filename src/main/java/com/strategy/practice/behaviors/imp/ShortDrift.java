package com.strategy.practice.behaviors.imp;

import com.strategy.practice.behaviors.Drifting;

public class ShortDrift implements Drifting {
    @Override
    public String drift() {
        return "I'm heavy and slow, I barely drift >:(";
    }
}
