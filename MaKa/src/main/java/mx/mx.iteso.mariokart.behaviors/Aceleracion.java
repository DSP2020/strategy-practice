package mx.mx.iteso.mariokart.behaviors;
/**

 * En esta interfaz define la aceleración.

 * @author: Frank De La Torre

 * @version: 11/03/2019

 */
public interface Aceleracion {
    /**
    *En esta función se asigna un adjetivo a la velocidad.

     * @author: Frank De La Torre

     * @version: 05/03/2019

     *@param curracel recive la unidad de aceleración

     * @return Regesa el String de la aceleración (1=Lento,2=Normal...)

    * */
    String aceleNombre(int curracel);
}
