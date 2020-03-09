package com.strategy.practice.behaviors.imp;

import com.strategy.practice.behaviors.Drifting;

public class LongDrift implements Drifting {
    @Override
    public String drift() {
        return "I'm really drifting, so long, so fast, so cool :B";
    }
}
