package com.mycompany.app.behaviors.impl;

import com.mycompany.app.behaviors.Drifting;

public class NoDrift implements Drifting {
    @Override
    public void drift() {
        System.out.println("You are driving steadily");
    }
}
