package mx.iteso.marioKart.behaviors;
/**
 * Interfaz de derrape.
 * @author: Juan Carlos Ortiz Pinto
 * @version: 11/03/2020/1.1
 */
public interface IDrifting {
    /**
     * Metodo que imprime mensaje de estabilidad.
     * @return variable String.
     */
    String driftingResult();
    /**
     * Metodo que asigna si hay derrape.
     * @param drifting variable booleana.
     */
    void setDrifting(boolean drifting);
    /**
     * Metodo que obtiene si hay derrape.
     * @return variable boolena.
     */
    boolean isDrifting();

    /**
     * Metodo que obtiene si hay estabilidad.
     * @return variable booleana.
     */
    boolean isStable();
}
