package mx.iteso.mariokart;

public abstract class Item {
    int initSpeed;
    int finalSpeed;
    int duration;

    public int getInitSpeed() {
        return initSpeed;
    }

    public void setInitSpeed(int initSpeed) {
        this.initSpeed = initSpeed;
    }

    public int getFinalSpeed() {
        return finalSpeed;
    }

    public void setFinalSpeed(int finalSpeed) {
        this.finalSpeed = finalSpeed;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
