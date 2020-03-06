package mx.iteso.items;

import mx.iteso.Item;
import mx.iteso.behaviors.Acceleration;
import mx.iteso.behaviors.impl.FastAcceleration;

public class Star extends Item {
    static double velocity = 10000;
    static int duration = 15;
    public Star(){
        super(velocity,duration);
    }
    public Acceleration getAcceleration(){
        return new FastAcceleration();
    }
}
