package mx.mx.iteso.mariokart.behaviors.impl;

import mx.mx.iteso.mariokart.behaviors.Aceleracion;
/**

 * En esta clase de implementa la velocidad más rápida.

 * @author: Frank De La Torre

 * @version: 11/03/2019

 */
public class Rapida implements Aceleracion {
    /**

     * En est metodo se calcula la velocidad.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     */
    @Override
    public String aceleNombre(int curracel) {
        String acelnom = "";
        final int vel4 = 4;

        if (curracel > vel4) {
            acelnom = "Velocidad " + curracel + " es Rápida!";
        }
        return acelnom;
    }
}
