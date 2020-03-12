package mx.mx.iteso.mariokart;
/**

 * En esta clase se define el tipo objeto.

 * @author: Frank De La Torre

 * @version: 11/03/2019

 */
public abstract class Item {
    /**

     * Esta variable muestra cuanto ayudara a la aceleración.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     */
    private int efectAcel;
    /**

     * Esta variable muestra por cuanto tiempo
     * ayudara a la aceleración.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     */
    private int tiemAcel;
    /**

     * Esta variable muestra si puede
     * superar el límite de aceleración.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     */
    private boolean saltLim;
    /**

     * Este metodo muestra si puede o no pasar el limite.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     * @return  puede o no pasar el limite

     */
    public boolean isSaltLim() {
        return saltLim;
    }
    /**

     * Este metodo retorna el efecto.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     * @return  Efecto del objeto

     */
    public int getEfectAcel() {
        return efectAcel;
    }
    /**

     * Este metodo se asigna el efecto.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     * @param  nefectAcel el nuevo efecto de aceleración

     */
    public abstract void setEfectAcel(int nefectAcel);
    /**

     * Este metodo retorna el tiempo de efecto.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     * @return  tiempo de efecto

     */
    public int getTiemAcel() {
        return tiemAcel;
    }
    /**

     * Este metodo se asigna la duración.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     * @param ntiemAcel el nuevo tiempo de aceleración

     */
    public abstract void setTiemAcel(int ntiemAcel);


}
