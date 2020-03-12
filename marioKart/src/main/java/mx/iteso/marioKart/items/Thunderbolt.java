package mx.iteso.marioKart.items;

import mx.iteso.marioKart.abstracts.Item;
/**
 * Esta clase es de un articulo y extiende de la clase abstracta Item.
 * @author: Juan Carlos Ortiz Pinto
 * @version: 11/03/2020/1.1
 */
public class Thunderbolt extends Item {
    /**
     * Variable con el valor de id del objeto.
     */
    private final int idItem = 1;
    /**
     * Variable con el valor de efecto que provoca.
     */
    private final int efectAcceleration = -1;
    /**
     * Variable con el tiempo que dura el efecto del objeto.
     */
    private final int timeEfect = 5;
    /**
     * Variable que determina si puede exceder el limite de acceleracion.
     */
    private final boolean isExceedLimit = false;

    /**
     *  Metodo que asigna el identificador del objeto.
     */
    public void setItemSelector() {
        this.setItemSelector(idItem);
    }

    /**
     * Metodo que asigna el efecto del acceleracion.
     */
    public void setEfectAcceleration() {
        this.setEfectAccelerationItem(efectAcceleration);
    }

    /**
     * Metodo que asigna la duracion del efecto.
     */
    public void setTimeEfect() {
        this.setTimeEfectItem(timeEfect);
    }

    /**
     * Metodo que asigna si excede el limite.
     */
    public void setExceedLimit() {
        this.setExceedLimitItem(isExceedLimit);
    }
}
