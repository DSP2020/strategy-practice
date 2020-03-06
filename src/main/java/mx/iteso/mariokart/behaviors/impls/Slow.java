package mx.iteso.mariokart.behaviors.impls;

import mx.iteso.mariokart.behaviors.Accelerate;

public class Slow implements Accelerate {

    @Override
    public void accelerate() {
        System.out.println("Slow...");
    }
}
