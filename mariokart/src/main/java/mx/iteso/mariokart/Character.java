package mx.iteso.mariokart;

import mx.iteso.mariokart.behaviors.Acceleration;

/**
 * The character baseclass.
 */
public abstract class Character {
    /**
     * The character's acceleration.
     */
    private Acceleration acceleration;
    /**
     * The character's item.
     */
    private Item item;

    /**
     * Drives the character
     */
    abstract public void drive();

    /**
     * Sets the acceleration.
     * 
     * @param acc the acceleration to set.
     */
    public void setAccelerationAb(Acceleration acc) {
        this.acceleration = acc;
    }

    /**
     * Gets the acceleration.
     * 
     * @return the acceleration.
     */
    public Acceleration getAccelerationAb() {
        return acceleration;
    }

    /**
     * Sets the item.
     * 
     * @param itemNew the item to set.
     */
    public void setItem(Item itemNew) {
        this.item = itemNew;
    }

    /**
     * Gets the item.
     * 
     * @return the item.
     */
    public Item getItem() {
        return item;
    }

    /**
     * Accelertes the character.
     */
    public void accelerate() {
        Acceleration originalAcceleration = getAccelerationAb();
        if(item != null){
            item.getAcceleration().accelerate();
        }else{
            originalAcceleration.accelerate();
        }
        setAccelerationAb(originalAcceleration);

    }

    /**
     * Uses the item and then sets it to null.
     */
    public void useItem() {
        Acceleration originalAcceleration = getAccelerationAb();
        if (item != null) {
            int currentTime = 0;
            int time = item.getDurationTime();
            setAccelerationAb(item.getAcceleration());
            while (currentTime < time) {
                accelerate();
                currentTime++;
            }
            item = null;
        }
        setAccelerationAb(originalAcceleration);
    }
}
