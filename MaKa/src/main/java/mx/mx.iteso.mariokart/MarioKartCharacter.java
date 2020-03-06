package mx.mx.iteso.mariokart;

 public abstract class MarioKartCharacter extends Item{

    private int acelInic;
    private int curracel;
    private int acelTop;

    public int getAcelInic() {
        return acelInic;
    }

    public abstract void setAcelInic(int acelInic) ;

    public int getAcelTop() {
        return acelTop;
    }

    public abstract void setAcelTop(int acelTop);

    public int getCurracel() {
        return curracel;
    }

    public abstract void setCurracel(int curracel);

    public abstract void Acelerar();

}
