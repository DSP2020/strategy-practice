package mx.mx.iteso.mariokart.items;

import mx.mx.iteso.mariokart.Item;
/**

 * En esta clase de implementa el objeto Hongo.

 * @author: Frank De La Torre

 * @version: 11/03/2019

 */
public class Hongo extends Item {
    /**

     * Esta variable muestra cuanto ayudara a la aceleración.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     */
    private int efectAcel = 2;

    /**

     * Esta variable muestra por cuanto tiempo
     * ayudara a la aceleración.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     */
    private int tiemAcel = 3;
    /**

     * Esta variable muestra si puede
     * superar el límite de aceleración.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     */
    private boolean saltLim = false;

    /**

     * Este metodo se asigna el efecto.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     */
    @Override
    public void setEfectAcel(int nefectAcel) {
        this.efectAcel = nefectAcel;
    }
    /**

     * Este metodo se asigna la duración.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     */
    @Override
    public void setTiemAcel(int ntiemAcel) {
        this.tiemAcel = ntiemAcel;
    }
}
