package mx.iteso.mariokart.characters;

import mx.iteso.mariokart.MariokartCharacter;
import mx.iteso.mariokart.behaviors.ifAcceleration;
import mx.iteso.mariokart.behaviors.impl.Fast;

public class Bowser extends MariokartCharacter {
    static final double BoswerVelocity = 100;
    private String currVelocity; 
    //ifAcceleration aBowser = new Fast();

    public String getCurrentVelocity(){
        return this.currVelocity;
    }

    public void setCurrentVelocity(String v){
        this.currVelocity = v;
    }

    public Bowser(){
        super(BowserVelocity);
        this.currVelocity = BowserVelocity;
    }

}
