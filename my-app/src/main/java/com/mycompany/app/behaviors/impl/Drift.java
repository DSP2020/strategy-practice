package com.mycompany.app.behaviors.impl;

import com.mycompany.app.behaviors.Drifting;

public class Drift implements Drifting {
    @Override
    public void drift() {
        System.out.println("You are drifting!");
    }
}
