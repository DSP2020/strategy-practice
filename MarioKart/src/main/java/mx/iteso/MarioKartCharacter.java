package mx.iteso;

import mx.iteso.behaviors.Acceleration;
import mx.iteso.behaviors.Drift;
import mx.iteso.behaviors.impl.drift.NormalDrift;

/**
 * The Mario Kart Character abstract class.
 */
public abstract class MarioKartCharacter {
    /**
     * The character's acceleration.
     */
    private Acceleration acceleration;
    /**
     * The character's item.
     */
    private Item item;
    /**
     * The character's drift.
     */
    private Drift drift;
    /**
     * @return The character's drive String.
     */
    public abstract String drive();
    /**
     * @return The character's acceleration.
     */
    public Acceleration getAcceleration() {
        return acceleration;
    }

    /**
     * @param acceleration1 The character's acceleration to set.
     */
    public void setAcceleration(final Acceleration acceleration1) {
        this.acceleration = acceleration1;
    }

    /**
     * @return The character's item.
     */
    public Item getItem() {
        return item;
    }

    /**
     * @param item1 The character's item to set.
     */
    public void setItem(final Item item1) {
        this.item = item1;
    }

    /**
     * @return The character's Drift.
     */
    public Drift getDrift() {
        return drift;
    }

    /**
     * @param drift1 The character's drift to set.
     */
    public void setDrift(final Drift drift1) {
        this.drift = drift1;
    }

    /**
     * @return the drift message
     */
    public String drift() {
        if (this.drift == null) {
            setDrift(new NormalDrift());
        }

        return this.drift.drift();
    }

    /**
     * Accelerate the character.
     * @return the acceleration message.
     */

    public String accelerate() {
        Acceleration acceleration1 = getAcceleration();
        String message;
        if (item != null) {
            message = item.getAcceleration().accelerate();
        } else {
            message = acceleration1.accelerate();
        }
        setAcceleration(acceleration1);
        return message;
    }


    /**
     * Uses the item and then sets it to null.
     * @return The acceleration item message.
     */
    public String useItem() {
        Acceleration acceleration1 = getAcceleration();
        String message = "";
        if (item != null) {
            int currentTime = 0;
            int duration = item.getDuration();
            setAcceleration(item.getAcceleration());
            while (currentTime < duration) {
                message += accelerate();
                currentTime++;
            }
            item = null;
        }
        setAcceleration(acceleration1);
        return message;
    }
}
