package com.mycompany.app.items;

import com.mycompany.app.behaviors.Acceleration;
import com.mycompany.app.behaviors.impl.VeryFastAcceleration;
import com.mycompany.app.characters.Character;

public class Mushroom extends Item {
    @Override
    public void effectChanges(Character character) {
        Acceleration originalAcceleration = character.getAcceleration();
        character.setAcceleration(new VeryFastAcceleration());
        character.getAcceleration().accelerate();
        character.setAcceleration(originalAcceleration);
    }
}
