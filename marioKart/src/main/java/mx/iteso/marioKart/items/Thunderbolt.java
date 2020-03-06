package mx.iteso.marioKart.items;

import mx.iteso.marioKart.abstracts.Item;

public class Thunderbolt extends Item {
    private final int idItem = 1;
    private final int efectAcceleration = -1;
    private final int timeEfect = 5;
    private final boolean isExceedLimit = false;

    public void setItemSelector() {
        this.itemSelector = idItem;
    }

    public void setEfectAcceleration() {
        this.timeEfectItem = timeEfect;
    }

    public void setTimeEfect() {
        this.timeEfectItem = efectAcceleration;
    }

    public void setExceedLimit() {
        this.exceedLimitItem = isExceedLimit;
    }
}
