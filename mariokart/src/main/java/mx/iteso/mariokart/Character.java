package mx.iteso.mariokart;

import mx.iteso.mariokart.behaviors.Acceleration;

/**
 * The character baseclass.
 */
public abstract class Character {
    /**
     * Drives the character.
     * @return that it is driving.
     */
    public abstract String drive();

    /**
     * Sets the acceleration.
     * @param acc the acceleration to set.
     */
    public abstract void setAcceleration(Acceleration acc);

    /**
     * Gets the acceleration.
     * @return the acceleration.
     */
    public abstract Acceleration getAcceleration();

    /**
     * Sets the item.
     * @param itemNew the item to set.
     */
    public abstract void setItem(Item itemNew);

    /**
     * Gets the item.
     * @return the item.
     */
    public abstract Item getItem();

    /**
     * Accelerates the character.
     * @return the acceleration if theres an item.
     */
    public String accelerate() {
        Acceleration originalAcceleration = getAcceleration();
        if (getItem() != null) {
            return getItem().getAcceleration().accelerate();
        } else {
            return originalAcceleration.accelerate();
        }
    }

    /**
     * Uses the item and then sets it to null.
     * @return the acceleration at the moment.
     */
    public String useItem() {
        Acceleration originalAcceleration = getAcceleration();
        Acceleration modifiedAcceleration = getAcceleration();
        if (getItem() != null) {
            int currentTime = 0;
            int time = getItem().getDurationTime();
            setAcceleration(getItem().getAcceleration());
            while (currentTime < time) {
                modifiedAcceleration = getAcceleration();
                currentTime++;
            }
            setItem(null);
            setAcceleration(originalAcceleration);
            return modifiedAcceleration.accelerate();
        }
        return originalAcceleration.accelerate();
    }
}
