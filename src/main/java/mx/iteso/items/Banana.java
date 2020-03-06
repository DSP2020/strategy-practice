package mx.iteso.items;

import mx.iteso.Item;
import mx.iteso.behaviors.Acceleration;
import mx.iteso.behaviors.impl.SlowAcceleration;

public class Banana extends Item {
    static double velocity = 5000;
    static int duration = 5;
    public Banana(){
        super(velocity,duration);
    }
    public Acceleration getAcceleration(){
        return new SlowAcceleration();
    }
}
