package mx.iteso.mariokart.behaviors.impl;

import mx.iteso.mariokart.behaviors.iAcceleration;

public class VeryFast implements iAcceleration {

    @Override
    public String setAcceleration() {
        return "Velocity is very fast";
    }
}
