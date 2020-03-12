package mx.iteso.marioKart.behaviors.impl.drift;

import mx.iteso.marioKart.behaviors.IDrifting;
/**
 * Clase implementada de la interfaz de derrape.
 * @author: Juan Carlos Ortiz Pinto
 * @version: 11/03/2020/1.1
 */
public class Stable implements IDrifting {
    /**
     * Variable para determinar hay o no derraper.
     */
    private boolean drifting;
    /**
     * Metodo que obtiene si hay derrape.
     * @return variable boolena.
     */
    public boolean isDrifting() {
        return drifting;
    }
    /**
     * Metodo que obtiene si hay estabilidad.
     * @return variable booleana.
     */
    public boolean isStable() {
        return true;
    }

    /**
     * Metodo que asigna si hay derrape.
     * @param idrifting variable booleana.
     */
    public void setDrifting(final boolean idrifting) {
        this.drifting = idrifting;
    }
    /**
     * Metodo que imprime mensaje de estabilidad.
     * @return variable String.
     */
    public String driftingResult() {
        return "It's stable";
    }
}
