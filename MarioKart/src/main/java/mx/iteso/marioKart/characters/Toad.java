package mx.iteso.marioKart.characters;

import mx.iteso.marioKart.Item;
import mx.iteso.marioKart.MarioKartCharacter;
import mx.iteso.marioKart.behaviors.impl.PositiveAcceleration;
import mx.iteso.marioKart.behaviorsInterfaces.Acceleration;
import mx.iteso.marioKart.items.Rocket;
import mx.iteso.marioKart.items.Thunder;

public class Toad extends MarioKartCharacter {
    static final double ToadVelocity = 55;
    private double currentVelocity;

    public Toad(){
        super(ToadVelocity);
        this.currentVelocity = ToadVelocity;
    }

    public void setCurrentVelocity(double v){
        this.currentVelocity = v;
    }

    public double getCurrentVelocity(){
        return this.currentVelocity;
    }

    public void changeAcceleration(double currentVelocity, Item item){
        super.getAcceleration().acceleration(currentVelocity,item);
        this.currentVelocity = ToadVelocity;
    }

    public static void main(String[] args){
        MarioKartCharacter Toad = new Toad();
        Item rocket = new Rocket();
        Acceleration positive = new PositiveAcceleration();
        Toad.setAceleration(positive);
        Toad.changeAcceleration(Toad.getCurrentVelocity(),rocket);
        System.out.println("Continue it's way, current velocity "+Toad.getCurrentVelocity() +" m/s");
    }
}
