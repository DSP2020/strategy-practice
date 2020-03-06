package mx.iteso.mariokart.items;

abstract class Item {
    int activeTime;
    int levelAcceleration;

    public int getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(int activeTime) {
        this.activeTime = activeTime;
    }

    public int getLevelAcceleration() {
        return levelAcceleration;
    }

    public void setLevelAcceleration(int levelAcceleration) {
        this.levelAcceleration = levelAcceleration;
    }

}
