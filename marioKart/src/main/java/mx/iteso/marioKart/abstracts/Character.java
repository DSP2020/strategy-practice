package mx.iteso.marioKart.abstracts;

abstract class Character {
    private  int accelInitial;
    private int accelCurrent;
    private  int accelMaxim;

    public int getAccelInitial() {
        return accelInitial;
    }

    public void setAccelInitial(int accelInitial) {
        this.accelInitial = accelInitial;
    }

    public int getAccelCurrent() {
        return accelCurrent;
    }

    public void setAccelCurrent(int accelCurrent) {
        this.accelCurrent = accelCurrent;
    }

    public int getAccelMaxim() {
        return accelMaxim;
    }

    public void setAccelMaxim(int accelMaxim) {
        this.accelMaxim = accelMaxim;
    }
    public void accelerationCharacter(){
        int tempAccel = this.accelCurrent;

    }
}
