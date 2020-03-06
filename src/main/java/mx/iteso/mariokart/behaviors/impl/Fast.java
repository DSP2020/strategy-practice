package mx.iteso.mariokart.behaviors.impl;

import mx.iteso.mariokart.behaviors.iAcceleration;

public class Fast implements iAcceleration {

    @Override
    public String setAcceleration() {
        return "Velocity is fast";
    }
}
