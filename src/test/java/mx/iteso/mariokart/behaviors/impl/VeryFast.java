package mx.iteso.mariokart.behaviors.impl;

import mx.iteso.mariokart.behaviors.Acceleration;

public class VeryFast implements Acceleration {

    public void drive(){
        System.out.println("Driving very fast");
    }

    public void stop(){
        System.out.println("Stopping very fast");
    }

    public void drift(){
        System.out.println("Drifting very fast");
    }
}
