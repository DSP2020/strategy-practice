package mx.iteso.marioKart.characters;

import mx.iteso.marioKart.Item;
import mx.iteso.marioKart.MarioKartCharacter;
import mx.iteso.marioKart.behaviors.impl.MediaAcceleration;
import mx.iteso.marioKart.behaviors.impl.PositiveAcceleration;
import mx.iteso.marioKart.behaviorsInterfaces.Acceleration;
import mx.iteso.marioKart.items.Thunder;

public class Luigi extends MarioKartCharacter {
    static final double LuigiVelocity = 170;
    private double currentVelocity;

    public Luigi(){
        super(LuigiVelocity);
        this.currentVelocity = LuigiVelocity;
    }

    public void setCurrentVelocity(double v){
        this.currentVelocity = v;
    }

    public double getCurrentVelocity(){
        return this.currentVelocity;
    }

    public void changeAcceleration(double currentVelocity, Item item){
        super.getAcceleration().acceleration(currentVelocity,item);
        this.currentVelocity = LuigiVelocity;
    }

}
