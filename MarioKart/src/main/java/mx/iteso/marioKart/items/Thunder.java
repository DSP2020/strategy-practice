package mx.iteso.marioKart.items;

import mx.iteso.marioKart.Item;

public class Thunder extends Item {
    static final double thunderVelocity = -100;
    static final int thunderDuration = 10;
    public Thunder(){
        super(thunderVelocity,thunderDuration);
    }
}
