package mx.iteso.items;

import mx.iteso.Item;
import mx.iteso.behaviors.Acceleration;
import mx.iteso.behaviors.impl.FastAcceleration;

public class MushroomTurbo extends Item {
    static double velocity = 9000;
    static int duration = 5;
    public MushroomTurbo(){
        super(velocity,duration);
    }
    public Acceleration getAcceleration(){
        return new FastAcceleration();
    }
}
