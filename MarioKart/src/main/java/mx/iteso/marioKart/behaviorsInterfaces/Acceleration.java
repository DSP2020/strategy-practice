package mx.iteso.marioKart.behaviorsInterfaces;

import mx.iteso.marioKart.Item;

/**
 * interface Acceleration.
 */
public interface Acceleration {
    /**
     *
     * @param currentVelocity velocidad actual.
     * @param item que toma el jugador.
     * @return un comentario sobre la aceleración.
     */
    String acceleration(double currentVelocity, Item item);
}

