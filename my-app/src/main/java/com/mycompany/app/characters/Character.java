package com.mycompany.app.characters;

import com.mycompany.app.behaviors.Acceleration;
import com.mycompany.app.items.Item;

public class Character {
    private Acceleration acceleration;
    public Acceleration getAcceleration () {
        return this.acceleration;
    }
    public void setAcceleration (Acceleration a) {
        this.acceleration = a;
    }
    public void useItem (Item i) {
        i.effectChanges(this);
    }
}
