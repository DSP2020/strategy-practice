package mx.iteso.mariokart.behaviors.impls;

import mx.iteso.mariokart.behaviors.Accelerate;

public class Normal implements Accelerate {

    @Override
    public void accelerate() {
        System.out.println("Normal");
    }
}
