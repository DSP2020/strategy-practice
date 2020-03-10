package com.strategy.practice.items;

import com.strategy.practice.Item;
import com.strategy.practice.behaviors.Acceleration;
import com.strategy.practice.behaviors.imp.NormalAcceleration;

/**
 * Hongo.
 */
public class Mushroom extends Item {
    /**
     * Constructor.
     */
    public Mushroom() {
        super();
        setAcceleration(new NormalAcceleration());
    }

    /**
     * Modificador.
     * @return Tipo de aceleración.
     */
    @Override
    public Acceleration modify() {
        return getAcceleration();
    }
}
