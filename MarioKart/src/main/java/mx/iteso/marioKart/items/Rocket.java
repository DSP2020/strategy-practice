package mx.iteso.marioKart.items;

import mx.iteso.marioKart.Item;

public class Rocket extends Item {
    static final double rocketVelocity = 1000000;
    static final int rocketDuration = 10000;
    public Rocket(){
        super(rocketVelocity,rocketDuration);
    }
}
