package mx.iteso;

import mx.iteso.behaviors.Acceleration;
import mx.iteso.behaviors.Drift;
import mx.iteso.behaviors.impl.drift.NormalDrift;

public abstract class MarioKartCharacter {
    private Acceleration acceleration;
    private Item item;
    private Drift drift;

    public abstract String drive();

    public Acceleration getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(Acceleration acceleration) {
        this.acceleration = acceleration;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Drift getDrift() {
        return drift;
    }

    public void setDrift(Drift drift) {
        this.drift = drift;
    }

    public String drift(){
        if(this.drift == null) {
            setDrift(new NormalDrift());
        }

        return this.drift.drift();
    }

    public String accelerate(){
        Acceleration acceleration = getAcceleration();
        String message;
        if(item != null){
            message= item.getAcceleration().accelerate();
        } else {
            message = acceleration.accelerate();
        }
        setAcceleration(acceleration);
        return message;
    }

    public String useItem(){
        Acceleration acceleration = getAcceleration();
        String message = "";
        if(item != null){
            int currentTime = 0;
            int duration = item.getDuration();
            setAcceleration(item.getAcceleration());
            while(currentTime < duration){
                message += accelerate();
                currentTime ++;
            }
            item = null;
        }
        setAcceleration(acceleration);
        return message;
    }
}
