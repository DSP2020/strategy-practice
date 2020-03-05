package mx.iteso.marioKart.items;

import mx.iteso.marioKart.Item;

public class Star extends Item {
    static final double starVelocity = 1000;
    static final int starDuration = 100;
    public Star(){
        super(starVelocity,starDuration);
    }
}

