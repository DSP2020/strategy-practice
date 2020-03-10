package com.strategy.practice.characters;

import com.strategy.practice.Characters;
import com.strategy.practice.behaviors.Acceleration;
import com.strategy.practice.behaviors.imp.FastAcceleration;
import com.strategy.practice.behaviors.imp.LongDrift;

/**
 * Luigi.
 */
public class Luigi extends Characters {

    /**
     * Constructor.
     */
    public Luigi() {
        super();
        setAccelerationType(new FastAcceleration());
        setDriftType(new LongDrift());
    }

    /**
     * Implementación de aceleración.
     * @return Acelera.
     */
    @Override
    public String accelerate() {
        return getAccelerationType().accelerate();
    }

    /**
     * Implementación de modificador de aceleración.
     * @return acelera.
     */
    @Override
    public String itemAcceleration() {
        Acceleration originalAcceleration = getAccelerationType();
        setAccelerationType(getItem().modify());
        String itemAcceleration = accelerate();
        setAccelerationType(originalAcceleration);
        return itemAcceleration;
    }

    /**
     * Implementación de derrape.
     * @return derrapa.
     */
    @Override
    public String drift() {
        return getDriftType().drift();
    }
}
