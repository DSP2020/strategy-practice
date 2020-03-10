package com.mycompany.app.characters;

import com.mycompany.app.behaviors.Acceleration;
import com.mycompany.app.behaviors.Drifting;
import com.mycompany.app.items.Item;

public class Character {
    private Acceleration acceleration;
    private Drifting drifting;
    public Acceleration getAcceleration () {
        return this.acceleration;
    }
    public Drifting getDrifting () { return this.drifting; }
    public void setAcceleration (Acceleration a) {
        this.acceleration = a;
    }
    public void setDrifting (Drifting d) { this.drifting = d; }
    public void useItem (Item i) {
        i.effectChanges(this);
    }
}
