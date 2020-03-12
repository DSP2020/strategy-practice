package mx.iteso.marioKart.abstracts;

import mx.iteso.marioKart.behaviors.IAcceleration;
import mx.iteso.marioKart.behaviors.IDrifting;
import mx.iteso.marioKart.behaviors.impl.acc.Average;
import mx.iteso.marioKart.behaviors.impl.acc.Quick;
import mx.iteso.marioKart.behaviors.impl.acc.Slow;
import mx.iteso.marioKart.behaviors.impl.drift.Stable;
import mx.iteso.marioKart.behaviors.impl.drift.Unstable;

/**
 * Clase abstracta con los atributos de los personajes.
 * @author: Juan Carlos Ortiz Pinto
 * @version: 11/03/2020/1.1
 */
public abstract class Character {
    /**
     *Variable para identificar al corredor.
     */
    private int characterSelector;
    /**
     * Variable para representar la velociadad actual.
     */
    private int currentAcceleration;
    /**
     * Llama a la clase abstracta item.
     */
    private Item item;
    /**
     * Variable contador para el tiempo de drifting.
     */
    private int timerDrifting;
    /**
     * Llama la interfaz de acceleracion.
     */
    private IAcceleration iAcceleration;
    /**
     * Llama la interfaz de derrape.
     */
    private IDrifting iDrifting;
    /**
     * Metodo que asigna la acceleracion actual.
     * @param iCurrentAcceleration variable que asigna.
     */
    public void setCurrentAcceleration(final int iCurrentAcceleration) {
        this.currentAcceleration = iCurrentAcceleration;
    }
    /**
     * Metodo abstracta.
     */
    public abstract void setCharacterSelector();
    /**
     * Metodo abstracta.
     */
    public abstract void speedUp();
    /**
     * Metodo abstracta.
     * @param isMoving variable que asigna.
     */
    public abstract void setStarMove(boolean isMoving);
    /**
     * Metodo para asignar el comienzo del derrape.
     * @param isDrifting variable que asigna.
     */
    public void setNeedtoSkid(final boolean isDrifting) {
        iDrifting.setDrifting(isDrifting);
    }
    /**
     * Metodo para obtener la acceleracion actual.
     * @return variable int.
     */
    public int getCurrentAcceleration() {
        return currentAcceleration;
    }

    /**
     * Metodo para obtener la otra clase abstracta.
     * @return la clase item.
     */
    public Item getItem() {
        return item;
    }

    /**
     * Metodo para asignar el id del corredor.
     * @param icharacterSelector variable asignar.
     */
    public void setCharacterSelector(final int icharacterSelector) {
        this.characterSelector = icharacterSelector;
    }

    /**
     * Metodo para obtener el tiempo que se mantiene derrapando.
     * @return variable int.
     */
    public int getTimerDrifting() {
        return timerDrifting;
    }

    /**
     * Metodo para asignar el tiempo de derrape.
     * @param itimerDrifting variable de tiempo.
     */
    public void setTimerDrifting(final int itimerDrifting) {
        this.timerDrifting = itimerDrifting;
    }

    /**
     * Metodo para obtener las interfaces.
     * @return la interfaz.
     */
    public IDrifting getiDrifting() {
        return iDrifting;
    }

    /**
     *  Metodo para obtener el id del corredor.
     * @return variable int.
     */
    public int getCharacterSelector() {
        return characterSelector;
    }
    /**
     * Metodo para obtener la acceleracion que corre.
     * @return variable string.
     */
    public String getTypeAcceleration() {
        final int slowDeterminate = 4;
        final int quickDeterminate = 9;

        if (currentAcceleration > slowDeterminate) {
            iAcceleration = new Slow();
        }
        if (this.getCurrentAcceleration() <= quickDeterminate) {
            iAcceleration = new Quick();
        } else {
            iAcceleration = new Average();
        }
        return iAcceleration.accelerationResult();
    }

    /**
     * Metodo para obtener la estabilidad en el derrape.
     * @param balance variable asignada balance.
     * @param weight variable asignada peso.
     * @return variable string.
     */
    public String getIfisDriftingStable(final int balance, final int weight) {
        final int determinate = 6;
        final int totalMidpoint = 3;
        int midpoint = (this.getCurrentAcceleration()
                + balance + weight) / totalMidpoint;
        if (midpoint >= determinate) {
            iDrifting = new Stable();
        } else {
            iDrifting = new Unstable();
        }
        return iDrifting.driftingResult();
    }
}
