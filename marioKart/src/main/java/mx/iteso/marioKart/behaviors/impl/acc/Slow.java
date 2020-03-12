package mx.iteso.marioKart.behaviors.impl.acc;

import mx.iteso.marioKart.behaviors.IAcceleration;
/**
 * Clase implementada de la interfaz de acceleracion.
 * @author: Juan Carlos Ortiz Pinto
 * @version: 11/03/2020/1.1
 */
public class Slow implements IAcceleration {
    /**
     * Metodo para obtener el resultado de la acceleracion intermedia.
     * @return variable String.
     */
    public String accelerationResult() {
        return "Speed is very slow";
    }
}
