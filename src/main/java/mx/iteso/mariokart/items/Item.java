package mx.iteso.mariokart.items;

/**
 * abstract class.
 */
abstract class Item {
    /**
     * activeTime var.
     */
    private int activeTime;
    /**
     * levelAcceleration var.
     */
    private int levelAcceleration;

    /**
     *
     * @return activeTime
     */
    public int getActiveTime() {
        return activeTime;
    }

    /**
     *
     * @param activeT var
     */
    public void setActiveTime(final int activeT) {
        this.activeTime = activeT;
    }

    /**
     *
     * @return levelAcceleration var
     */
    public int getLevelAcceleration() {
        return levelAcceleration;
    }

    /**
     *
     * @param levelA var
     */
    public void setLevelAcceleration(final int levelA) {
        this.levelAcceleration = levelA;
    }
}
