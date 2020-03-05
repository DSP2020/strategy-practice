package mx.mx.iteso.mariokart;

abstract public class Item {
    private int efectAcel;
    private int tiemAcel;
    private boolean saltLim;

    public boolean isSaltLim() {
        return saltLim;
    }

    public void setSaltLim(boolean saltLim) {
        this.saltLim = saltLim;
    }


    public int getEfectAcel() {
        return efectAcel;
    }

    public void setEfectAcel(int nefectAcel) {
        this.efectAcel = nefectAcel;
    }

    public int getTiemAcel() {
        return tiemAcel;
    }

    public void setTiemAcel(int ntiemAcel) {
        this.tiemAcel = ntiemAcel;
    }


}
