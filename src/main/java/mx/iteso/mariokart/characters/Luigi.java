package mx.iteso.mariokart.characters;

import mx.iteso.mariokart.MariokartCharacter;
import mx.iteso.mariokart.behaviors.ifAcceleration;
import mx.iteso.mariokart.behaviors.impl.Fast;

public class Luigi extends MariokartCharacter {
    static final double LuigiVelocity = 150;
    private String currVelocity; 
    //ifAcceleration acLuigi = new Fast();

    public String getCurrentVelocity(){
        return this.currVelocity;
    }

    public void setCurrentVelocity(String v){
        this.currVelocity = v;
    }

    public Luigi(){
        super(LuigiVelocity);
        this.currVelocity = LuigiVelocity;
    }

}
