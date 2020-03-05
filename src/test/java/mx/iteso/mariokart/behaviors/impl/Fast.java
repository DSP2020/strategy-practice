package mx.iteso.mariokart.behaviors.impl;

import mx.iteso.mariokart.behaviors.Acceleration;

public class Fast implements Acceleration {
    public void drive(){
        System.out.println("Driving fast");
    }

    public void stop(){
        System.out.println("Stopping fast");
    }

    public void drift(){
        System.out.println("Drifting fast");
    }
}
