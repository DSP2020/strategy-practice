package com.strategy.practice.items;

import com.strategy.practice.Item;
import com.strategy.practice.behaviors.Acceleration;
import com.strategy.practice.behaviors.imp.SlowAcceleration;

/**
 * Rayo.
 */
public class Ray extends Item {

    /**
     * Constructor.
     */
    public Ray() {
        super();
        setAcceleration(new SlowAcceleration());
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
