package mx.mx.iteso.mariokart;

abstract public class Item {
    private int efectAcel;
    private int tiemAcel;
    private boolean saltLim;

    public boolean isSaltLim() {
        return saltLim;
    }

    public  void setSaltLim(boolean nsaltLim) {
        this.saltLim = nsaltLim;
    }


    public int getEfectAcel() {
        return efectAcel;
    }

    public abstract void setEfectAcel(int nefectAcel);

    public int getTiemAcel() {
        return tiemAcel;
    }

    public abstract void setTiemAcel(int ntiemAcel);


}
