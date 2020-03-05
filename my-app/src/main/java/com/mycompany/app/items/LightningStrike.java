package com.mycompany.app.items;

import com.mycompany.app.behaviors.Acceleration;
import com.mycompany.app.behaviors.impl.VerySlowAcceleration;
import com.mycompany.app.characters.Character;

public class LightningStrike extends Item{

    @Override
    public void effectChanges(Character character) {
        Acceleration originalAcceleration = character.getAcceleration();
        character.setAcceleration(new VerySlowAcceleration());
        character.getAcceleration().accelerate();
        character.setAcceleration(originalAcceleration);
    }
}
