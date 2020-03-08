package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.IAcceleration;

/**
 * The character baseclass.
 */
public abstract class Character {
    /**
     * The character's acceleration.
     */
    private IAcceleration acceleration;
    /**
     * The character's item.
     */
    private Item item;

    /**
     * Drives the character.
     */
    public abstract void drive();

    /**
     * Accelertes the character.
     */
    public void accelerate() {
        IAcceleration origiAcceleration = getAcceleration();
        if (item != null) {
            item.getAcceleration().accelerate();
        } else {
            origiAcceleration.accelerate();
        }
        setAcceleration(origiAcceleration);

    }

    /**
     * Sets the acceleration.
     * @param a the acceleration to set.
     */
    public void setAcceleration(final IAcceleration a) {
        this.acceleration = a;
    }

    /**
     * Gets the acceleration.
     * @return the acceleration.
     */
    public IAcceleration getAcceleration() {
        return acceleration;
    }

    /**
     * Sets the item.
     * @param i the item to set.
     */
    public void setItem(final Item i) {
        this.item = i;
    }

    /**
     * Gets the item.
     * @return the item.
     */
    public Item getItem() {
        return item;
    }

    /**
     * Uses the item and then sets it to null.
     */
    public void useItem() {
        IAcceleration origiAcceleration = getAcceleration();
        if (item != null) {
            int currentTime = 0;
            int duration = item.getDuration();
            setAcceleration(item.getAcceleration());
            while (currentTime < duration) {
                accelerate();
                currentTime++;
            }
            item = null;
        }
        setAcceleration(origiAcceleration);
    }
}
