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
     * @return The character's message.
     */
    public abstract String drive();

    /**
     * Accelertes the character.
     * @return The acceleration message.
     */
    public String accelerate() {
        IAcceleration origiAcceleration = getAcceleration();
        String accelerationMessage = "";
        if (item != null) {
            accelerationMessage = item.getAcceleration().accelerate();
        } else {
            accelerationMessage = origiAcceleration.accelerate();
        }
        setAcceleration(origiAcceleration);
        return accelerationMessage;
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
     * @return The acceleration item message.
     */
    public String useItem() {
        IAcceleration origiAcceleration = getAcceleration();
        String accelerationMessage = "";
        if (item != null) {
            int currentTime = 0;
            int duration = item.getDuration();
            setAcceleration(item.getAcceleration());
            while (currentTime < duration) {
                accelerationMessage += accelerate();
                currentTime++;
            }
            item = null;
        }
        setAcceleration(origiAcceleration);
        return accelerationMessage;
    }
}
