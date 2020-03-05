package mx.iteso.marioKart;

import mx.iteso.marioKart.behaviorsInterfaces.Acceleration;

public abstract class MarioKartCharacter{
    private double velocity;
    private Acceleration acceleration;

    public MarioKartCharacter(double v){
        this.velocity = v;
    }

    public void setAceleration(Acceleration acceleration) {
        this.acceleration = acceleration;
    }

    public Acceleration getAcceleration(){
        return this.acceleration;
    }

}
