package mx.iteso.marioKart.characters;

import mx.iteso.marioKart.Item;
import mx.iteso.marioKart.MarioKartCharacter;
import mx.iteso.marioKart.behaviors.impl.MediaAcceleration;
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

    public static void main(String[] args){

        Mario Mario = new Mario();
        Star star = new Star();
        MediaAcceleration media = new MediaAcceleration();
        Mario.setAceleration(media);

        Mario.changeAcceleration(Mario.getCurrentVelocity(),star);

    }

}
