package com.strategy.practice.behaviors.imp;

import com.strategy.practice.behaviors.Drifting;

public class NormalDrift implements Drifting {
    @Override
    public String drift() {
        return "I'm normally drifting, nothing special :v";
    }
}
