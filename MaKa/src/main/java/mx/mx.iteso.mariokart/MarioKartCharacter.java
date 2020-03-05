package mx.mx.iteso.mariokart;

abstract public class MarioKartCharacter extends Item{

    private int acelInic;
    private int curracel;
    private int acelTop;

    public int getAcelInic() {
        return acelInic;
    }

    public void setAcelInic(int acelInic) {
        this.acelInic = acelInic;
    }

    public int getAcelTop() {
        return acelTop;
    }

    public void setAcelTop(int acelTop) {
        this.acelTop = acelTop;
    }

    public int getCurracel() {
        return curracel;
    }

    public void setCurracel(int curracel) {
        this.curracel = curracel;
    }

    public void Acelerar(){

        int temp = this.curracel;

        for(int i = 0; i < getTiemAcel();i++) {
            this.curracel = this.curracel + getEfectAcel();
        }

        if((this.curracel > this.acelTop)|!isSaltLim()) {
            this.curracel = temp;
        }

    }

}
