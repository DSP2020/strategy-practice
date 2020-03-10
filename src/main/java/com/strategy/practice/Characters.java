package com.strategy.practice;

import com.strategy.practice.behaviors.Acceleration;
import com.strategy.practice.behaviors.Drifting;

/**
 * Clase abstracta para definir caracteres.
 */
public abstract class Characters {

    /**
     * Aceleración.
     */
    private Acceleration accelerationType;
    /**
     * Item.
     */
    private Item item;
    /**
     * Tipo de derrape.
     */
    private Drifting driftType;

    /**
     * Para acelerar.
     * @return aceleración.
     */
    public abstract String accelerate();

    /**
     * Modificación temporal de la aceleración.
     * @return otra aceleración.
     */
    public abstract String itemAcceleration();

    /**
     * Derrape.
     * @return derrape.
     */
    public abstract String drift();

    /**
     * Getter.
     * @return Item.
     */
    public Item getItem() {
        return item;
    }

    /**
     * Setter.
     * @param newItem item.
     */
    public void setItem(final Item newItem) {
        this.item = newItem;
    }

    /**
     * Getter.
     * @return Tipo de aceleración,
     */
    public Acceleration getAccelerationType() {
        return accelerationType;
    }

    /**
     * Setter.
     * @param accelerationTypeArg tipo de aceleración.
     */
    public void setAccelerationType(final Acceleration accelerationTypeArg) {
        this.accelerationType = accelerationTypeArg;
    }

    /**
     * Getter.
     * @return tipo de derrape.
     */
    public Drifting getDriftType() {
        return driftType;
    }

    /**
     * Setter.
     * @param driftTypeArg tipo de derrape.
     */
    public void setDriftType(final Drifting driftTypeArg) {
        this.driftType = driftTypeArg;
    }
}
