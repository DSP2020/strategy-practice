package mx.iteso.mariokart.items;

import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.impl.FastestAcceleration;

/**
 * Class for the mushroom item.
 */
public class Mushroom extends Item {

    /**
     * Duration of the item.
     */
    private final int duration = 5;

    /**
     * Constructor of the class.
     */
    public Mushroom() {
        Acceleration acceleration = new FastestAcceleration();
        setAcceleration(acceleration);
    }

    /**
     * Execute the mushroom item.
     */
    @Override
    public void executeItem() {
        for (int i = 0; i < this.duration; i++) {
            acceleration.accelerate();
        }
    }

    /**
     * Getter of the duration of the item.
     * @return integer that represent the duration.
     */
    public int getDuration() {
        return duration;
    }
}
