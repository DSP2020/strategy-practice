package mx.iteso.strategy.items;

import mx.iteso.strategy.Item;
import mx.iteso.strategy.behaviors.IAcceleration;
import mx.iteso.strategy.behaviors.impl.SuperFastAcceleration;

/**
 * Mushroom class.
 */
public class Mushroom extends Item {
    /**
     * Increments the acceleration to SuperFastAcceleration.
     * @return The new acceleration.
     */
    @Override
    public IAcceleration getAcceleration() {
        return new SuperFastAcceleration();
    }
}
