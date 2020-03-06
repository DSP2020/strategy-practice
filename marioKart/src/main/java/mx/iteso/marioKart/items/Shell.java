package mx.iteso.marioKart.items;

import mx.iteso.marioKart.abstracts.Item;

public class Shell extends Item {
    private final int idItem = 3;
    private final int efectAcceleration = -3;
    private final int timeEfect = 3;
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
