package mx.mx.iteso.mariokart.character;

import mx.mx.iteso.mariokart.MarioKartCharacter;

public class Link extends MarioKartCharacter {
    private int acelInic = 2;
    private int curracel = 2;
    private int acelTop = 6;

    @Override
    public void setAcelInic(int nacelInic) {
        this.acelInic = nacelInic;
    }

    @Override
    public void setAcelTop(int nacelTop) {
        this.acelTop = nacelTop;
    }

    @Override
    public void setCurracel(int ncurracel) {
        this.curracel = ncurracel;
    }

    @Override
    public void Acelerar() {
        int temp = this.curracel;

        for(int i = 0; i < getTiemAcel();i++) {
            this.curracel = this.curracel + getEfectAcel();
        }

        if(isSaltLim()) {
            this.curracel = temp;
        } else if((this.curracel > this.acelTop)){
            this.curracel = this.acelTop;
        } else if(this.curracel <= 0){
            this.curracel = this.acelInic;
        }

    }


}
