package mx.iteso.marioKart.characters;

import mx.iteso.marioKart.Item;
import mx.iteso.marioKart.MarioKartCharacter;
import mx.iteso.marioKart.behaviors.impl.MediaAcceleration;
import mx.iteso.marioKart.behaviorsInterfaces.Acceleration;
import mx.iteso.marioKart.items.Star;

public class Mario extends MarioKartCharacter {
   static final double MarioVelocity = 150;
   private double currentVelocity;

    public Mario(){
        super(MarioVelocity);
        this.currentVelocity = MarioVelocity;
    }

    public void setCurrentVelocity(double v){
        this.currentVelocity = v;
    }

    public double getCurrentVelocity(){
        return this.currentVelocity;
    }

    public void changeAcceleration(double currentVelocity, Item item){
        super.getAcceleration().acceleration(currentVelocity,item);
        this.currentVelocity = MarioVelocity;
    }

}
