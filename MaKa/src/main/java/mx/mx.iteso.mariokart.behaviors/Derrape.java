package mx.mx.iteso.mariokart.behaviors;

import mx.mx.iteso.mariokart.Item;
/**

 * En esta interfaz define el derrape.

 * @author: Frank De La Torre

 * @version: 11/03/2019

 */
public interface Derrape {
    /**
     *En esta función se asigna un adjetivo a la velocidad.

     * @author: Frank De La Torre

     * @version: 05/03/2019

     * @param coefderrape que tanto puede derrapar.

     * @param acelTop cual es el limite de aceleración.

     * @param curracel acerelación actual.

     * @param objeto qué objeto tiene.

     * @return la velocidad actual modificada

     * */
    String derrape(int coefderrape, int acelTop, Item objeto, int curracel);
}
