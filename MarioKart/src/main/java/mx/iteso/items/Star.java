package mx.iteso.items;

import mx.iteso.Item;
import mx.iteso.behaviors.Acceleration;
import mx.iteso.behaviors.impl.FastAcceleration;

public class Star extends Item {
    public Acceleration getAcceleration(){
        return new FastAcceleration();
    }
}
