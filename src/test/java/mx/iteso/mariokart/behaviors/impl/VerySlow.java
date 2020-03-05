package mx.iteso.mariokart.behaviors.impl;

import mx.iteso.mariokart.behaviors.Acceleration;

public class VerySlow implements Acceleration {
    public void drive(){
        System.out.println("Driving very slowly");
    }

    public void stop(){
        System.out.println("Stopping very slowly");
    }

    public void drift(){
        System.out.println("Drifting very slowly");
    }
}
