package mx.mx.iteso.mariokart.behaviors.impl;

import mx.mx.iteso.mariokart.behaviors.Aceleracion;

/**

 * En esta clase de implementa la velocidad más lenta.

 * @author: Frank De La Torre

 * @version: 11/03/2019

 */
public class Lento implements Aceleracion {
    /**

     * En est metodo se calcula la velocidad.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     */
    @Override
    public String aceleNombre(int curracel) {
        String acelnom = "";

        if (curracel <= 2) {
            acelnom = "Velocidad " + curracel + " es Lenta";
        }
        return acelnom;
    }
}
