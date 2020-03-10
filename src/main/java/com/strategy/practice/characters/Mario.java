package com.strategy.practice.characters;

import com.strategy.practice.Characters;
import com.strategy.practice.behaviors.Acceleration;
import com.strategy.practice.behaviors.imp.NormalAcceleration;
import com.strategy.practice.behaviors.imp.NormalDrift;

/**
 * Mario.
 */
public class Mario extends Characters {

    /**
     * Constructor.
     */
    public Mario() {
        super();
        setAccelerationType(new NormalAcceleration());
        setDriftType(new NormalDrift());
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
