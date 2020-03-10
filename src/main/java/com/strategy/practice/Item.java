package com.strategy.practice;

import com.strategy.practice.behaviors.Acceleration;

/**
 * Clase Item.
 */
public abstract class Item {
    /**
     * Aceleración.
     */
    private Acceleration acceleration;

    /**
     * Modifica la aceleración.
     * @return tipo de aceleración.
     */
    public abstract Acceleration modify();

    /**
     * Getter.
     * @return Tipo de aceleración.
     */
    public Acceleration getAcceleration() {
        return acceleration;
    }

    /**
     * Setter.
     * @param newAcceleration aceleracion.
     */
    public void setAcceleration(final Acceleration newAcceleration) {
        this.acceleration = newAcceleration;
    }
}
