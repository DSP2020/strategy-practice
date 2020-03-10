package com.mycompany.app.items;

import com.mycompany.app.behaviors.impl.Drift;
import com.mycompany.app.behaviors.impl.NoDrift;
import com.mycompany.app.characters.Character;

public class Banana extends Item {
    @Override
    public void effectChanges(Character character) {
        character.setDrifting(new Drift());
        character.getDrifting().drift();
        character.setDrifting(new NoDrift());
    }
}
