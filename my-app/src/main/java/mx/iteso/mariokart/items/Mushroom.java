package mx.iteso.mariokart.items;

import java.util.ArrayList;
import java.util.List;

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
    public List<String> executeItem() {
        ArrayList<String> itemMessage = new ArrayList<>(this.duration);
        for (int i = 0; i < this.duration; i++) {
            itemMessage.set(i, acceleration.accelerate());
        }

        return itemMessage;
    }

    /**
     * Getter of the duration of the item.
     * @return integer that represent the duration.
     */
    public int getDuration() {
        return duration;
    }
}
