package mx.iteso;

import mx.iteso.behaviors.Acceleration;

public abstract class MarioKartCharacter {
    private Acceleration acceleration;
    private Item item;

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

    public void useItem(){
        System.out.println( item.toString());
    }

}
