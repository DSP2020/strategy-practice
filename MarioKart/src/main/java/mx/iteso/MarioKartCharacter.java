package mx.iteso;

import mx.iteso.behaviors.Acceleration;

public abstract class MarioKartCharacter {
    private Acceleration acceleration;
    private Item item;

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
