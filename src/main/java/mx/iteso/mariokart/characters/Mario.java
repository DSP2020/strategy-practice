package mx.iteso.mariokart.characters;

import mx.iteso.mariokart.MariokartCharacter;
import mx.iteso.mariokart.behaviors.ifAcceleration;
import mx.iteso.mariokart.behaviors.impl.Fast;

public class Mario extends MariokartCharacter {
    static final double MarioVelocity = 200;
    private String currVelocity; 
    //ifAcceleration acMario = new Fast();

    public String getCurrentVelocity(){
        return this.currVelocity;
    }

    public void setCurrentVelocity(String v){
        this.currVelocity = v;
    }

    public Mario(){
        super(MarioVelocity);
        this.currVelocity = MarioVelocity;
    }
}
