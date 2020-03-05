package mx.iteso.marioKart.abstracts;

abstract class Item {
    private int efectAcel;
    private int timeAcel;
    private boolean overtakeLimit;

    public boolean isOvertakeLimit() {
        return overtakeLimit;
    }

    public void setOvertakeLimit(boolean overtakeLimit) {
        this.overtakeLimit = overtakeLimit;
    }

    public int getEfectAcel() {
        return efectAcel;
    }

    public void setEfectAcel(int efectAcel) {
        this.efectAcel = efectAcel;
    }

    public int getTimeAcel() {
        return timeAcel;
    }

    public void setTimeAcel(int timeAcel) {
        this.timeAcel = timeAcel;
    }
}
