package mx.iteso.marioKart.abstracts;

public abstract class Item {
    protected int itemSelector;
    protected int efectAccelerationItem;
    protected int timeEfectItem;
    protected boolean exceedLimitItem;
    private  boolean isActiveItem;

    public abstract void setItemSelector();
    public abstract void setEfectAcceleration();
    public abstract void setTimeEfect();
    public abstract void setExceedLimit();

    public int getItemSelector() {
        return itemSelector;
    }

    public int getEfectAccelerationItem() {
        return efectAccelerationItem;
    }

    public int getTimeEfectItem() {
        return timeEfectItem;
    }

    public boolean isExceedLimitItem() {
        return exceedLimitItem;
    }

    public boolean isActiveItem() {
        return isActiveItem;
    }

    public void setActiveItem(boolean activeItem) {
        isActiveItem = activeItem;
    }
}
