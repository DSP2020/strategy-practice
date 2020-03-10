package com.strategy.practice.items;

import com.strategy.practice.Item;
import com.strategy.practice.behaviors.Acceleration;
import com.strategy.practice.behaviors.imp.FastAcceleration;

/**
 * Estrella.
 */
public class Star extends Item {

    /**
     * Constructor.
     */
    public Star() {
        super();
        setAcceleration(new FastAcceleration());
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
