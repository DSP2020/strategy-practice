package mx.mx.iteso.mariokart.items;

import mx.mx.iteso.mariokart.Item;

public class Rayo extends Item {
    private int efectAcel=-2;
    private int tiemAcel=3;
    private boolean saltLim=false;


    @Override
    public void setEfectAcel(int nefectAcel) {
        this.efectAcel = nefectAcel;
    }

    @Override
    public void setTiemAcel(int ntiemAcel) {
        this.tiemAcel = ntiemAcel;
    }
}
