package mx.mx.iteso.mariokart.character;

import mx.mx.iteso.mariokart.Item;
import mx.mx.iteso.mariokart.MarioKartCharacter;
/**

 * En esta clase de implementa el personaje Link.

 * @author: Frank De La Torre

 * @version: 11/03/2019

 */
public class Link extends MarioKartCharacter {
    /**

     * Variable de Aceleración Inicial.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     */
    private int acelInic = 2;
    /**

     * Variable de Aceleración Actual.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     */
    private int curracel = 2;
    /**

     * Variable de Aceleración Máxima.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     */
    private int acelTop = 6;
    /**

     * Variable de Coeficiente de Derrape.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     */
    private int coefderrape = 2;
    /**

     * En este metodo se asigna la aceleración inical.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     */
    @Override
    public void setAcelInic(int nacelInic) {
        this.acelInic = nacelInic;
    }
    /**

     * En este metodo se asigna la aceleración máxima.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     */
    @Override
    public void setAcelTop(int nacelTop) {
        this.acelTop = nacelTop;
    }
    /**

     * En este metodo se asigna la aceleración actual.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     */
    @Override
    public void setCurracel(int ncurracel) {
        this.curracel = ncurracel;
    }
    /**

     * En este metodo se asigna el objeto.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     */
    @Override
    public void setObjeto(Item nobjeto) {
        this.objeto = nobjeto; }
    /**

     * En este metodo se asigna el coeficiente de derrape.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     */
    @Override
    public void setCoefderrape(int ncoefderrape) {
        this.coefderrape = ncoefderrape;
    }
    /**

     * En este metodo se asigna la nueva aceleración actual.

     * @author: Frank De La Torre

     * @version: 11/03/2019

     */
    @Override
    public void acelerar() {
        int temp = this.curracel;

        for (int i = 0; i < objeto.getTiemAcel(); i++) {
            this.curracel = this.curracel + objeto.getEfectAcel();
        }

        if (objeto.isSaltLim()) {
            this.curracel = temp;
        } else if ((this.curracel > this.acelTop)) {
            this.curracel = this.acelTop;
        } else if (this.curracel <= 0) {
            this.curracel = this.acelInic;
        }

    }


}
