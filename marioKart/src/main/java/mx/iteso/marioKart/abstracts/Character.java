package mx.iteso.marioKart.abstracts;

import mx.iteso.marioKart.behaviors.IAcceleration;

public abstract class Character {
    protected int characterSelector;
    protected int currentAcceleration;
    protected Item item;

    public abstract void setCurrentAcceleration(int currentAcceleration);
    public abstract void setCharacterSelector();
    public abstract void speedUp();
    public abstract void setStarMove(boolean isMoving);

    public int getCurrentAcceleration() {
        return currentAcceleration;
    }

    public int getCharacterSelector() {
        return characterSelector;
    }
}
