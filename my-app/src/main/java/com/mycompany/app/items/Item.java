package com.mycompany.app.items;

import com.mycompany.app.characters.Character;

public abstract class Item {
    private String itemName;

    public abstract void effectChanges(Character character);
}
