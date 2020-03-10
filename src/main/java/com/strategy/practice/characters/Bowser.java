package com.strategy.practice.characters;

import com.strategy.practice.Characters;
import com.strategy.practice.behaviors.Acceleration;
import com.strategy.practice.behaviors.imp.ShortDrift;
import com.strategy.practice.behaviors.imp.SlowAcceleration;

/**
 * Bowser.
 */
public class Bowser extends Characters {

    /**
     * Constructor.
     */
    public Bowser() {
        super();
        setAccelerationType(new SlowAcceleration());
        setDriftType(new ShortDrift());
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
     * Implementación de la aceleración temporal.
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
