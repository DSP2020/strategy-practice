package mx.iteso.items;

import mx.iteso.Item;
import mx.iteso.behaviors.Acceleration;
import mx.iteso.behaviors.impl.SlowAcceleration;

public class Banana extends Item {

    public Acceleration getAcceleration(){
        return new SlowAcceleration();
    }
}
