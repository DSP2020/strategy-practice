package mx.iteso.mariokart.items;

import mx.iteso.mariokart.characters.MarioKartCharacter;

public abstract class Item {
    public int duration;
    public String name;

    public void setDuration() {};
    public abstract void setEffect(MarioKartCharacter character);
}
