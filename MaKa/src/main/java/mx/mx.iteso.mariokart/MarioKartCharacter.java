package mx.mx.iteso.mariokart;
/**

 * En esta clase se define el tipo de corredor.

 * @author: Frank De La Torre

 * @version: 11/03/2019

 */
 public abstract class MarioKartCharacter {
    /**

     * Esta variable muestra la aceleración inicial.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     */
    private int acelInic;
    /**

     * Variable de Aceleración Actual.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     */
    private int curracel;
    /**

     * Variable de Aceleración Máxima.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     */
    private int acelTop;
    /**

     * Variable de Objeto a usar.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     */
    protected Item objeto;
    /**

     * Variable de Coeficiente de Derrape.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     */
    private int coefderrape;
    /**

     * En este metodo se obtiene la aceleración inical.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     * @return  la aceleración inical

     */
    public int getAcelInic() {
        return acelInic;
    }
    /**

     * En este metodo se asigna la aceleración inical.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     * @param nacelInic  aceleración inical

     */
    public abstract void setAcelInic(int nacelInic);
    /**

     * En este metodo se obtiene la aceleración máxima.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     * @return  la aceleración máxima

     */
    public int getAcelTop() {
        return acelTop;
    }
    /**

     * En este metodo se asigna la aceleración máxima.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     * @param nacelTop aceleración máxima

     */
    public abstract void setAcelTop(int nacelTop);
    /**

     * En este metodo se obtiene la aceleración actual.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     * @return  la aceleración actual

     */
    public int getCurracel() {
        return curracel;
    }
    /**

     * En este metodo se asigna la aceleración actual.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     * @param ncurracel  aceleración actual

     */
    public abstract void setCurracel(int ncurracel);
    /**

     * En este metodo se obtiene el objeto.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     * @return  el objeto

     */
     public Item getObjeto() {
         return objeto; }
    /**

     * En este metodo se asigna el objeto.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     * @param nobjeto  el objeto

     */
     public abstract void setObjeto(Item nobjeto);
    /**

     * En este metodo se obtiene el coeficiente de derrape.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     * @return  el coeficiente de derrape

     */
     public int getCoefderrape() {
         return coefderrape; }
    /**

     * En este metodo se asigna el coeficiente de derrape.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     * @param ncoefderrape es el coeficiente de derrape

     */
     public abstract void setCoefderrape(int ncoefderrape);
    /**

     * En este metodo se asigna la nueva aceleración actual.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     */
    public abstract void acelerar();

}
