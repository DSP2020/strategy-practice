package mx.iteso.mariokart.characters;

import mx.iteso.mariokart.behaviors.Accelerate;
import mx.iteso.mariokart.items.Item;

public abstract class MarioKartCharacter {
    public Accelerate accelerate;

    public void setAcceleration(Accelerate accelerate) {
        this.accelerate = accelerate;
    }

    public void usedItem(Item i) {
        i.setEffect(this);
    }
}
