package mx.iteso.marioKart.behaviors.impl;

import mx.iteso.marioKart.behaviorsInterfaces.Aceleration;

public class Negative implements Aceleration {
    @Override
    public double calculateAceleratation(double vf, double vi, double tf, double ti) {
        return 0;
    }
}
