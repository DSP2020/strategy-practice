package mx.mx.iteso.mariokart.behaviors.impl;

import mx.mx.iteso.mariokart.Item;
import mx.mx.iteso.mariokart.behaviors.Derrape;

/**

 * En esta clase de implementa el derrape normal.

 * @author: Frank De La Torre

 * @version: 11/03/2019

 */
public class DerrapeNormal implements Derrape {
    /**

     * En este metodo se calcula el tipo de derrape.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     */
    @Override
    public String derrape(final int coefderrape,
             final  int acelTop, final Item objeto, int curracel) {
        int derr = 1;
        for (int i = 0; i < coefderrape; i++) {

            if (objeto.getEfectAcel() > 0) {
                derr = objeto.getEfectAcel();
            }
            curracel += derr;


        }
        if (curracel > acelTop & coefderrape < 2) {
            curracel = acelTop;
        }
        return "Derrape a : " + curracel + " de unidades de aceleración!";
    }
}
