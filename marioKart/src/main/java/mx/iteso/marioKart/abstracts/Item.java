package mx.iteso.marioKart.abstracts;
/**
 * Clase abstracta con los atributos de los articulos.
 * @author: Juan Carlos Ortiz Pinto
 * @version: 11/03/2020/1.1
 */
public abstract class Item {
    /**
     * Variable para identificar el id del articulo.
     */
    private int itemSelector;
    /**
     * Variable para determinar si afecta la acceleracion.
     */
    private int efectAccelerationItem;
    /**
     * Variable para determinar el tiempo que afecta.
     */
    private int timeEfectItem;
    /**
     * Variable para determinar si excede la acceleracion maxima.
     */
    private boolean exceedLimitItem;
    /**
     * Variable para determinar si se activo algun articulo.
     */
    private  boolean isActiveItem;
    /**
     * Clase abstracta para seleccionar articulo.
     */
    public abstract void setItemSelector();
    /**
     * Clase abstracta para asignar si afecta en la acceleracion.
     */
    public abstract void setEfectAcceleration();
    /**
     * Clase abstracta para asignar el tiempo.
     */
    public abstract void setTimeEfect();
    /**
     * Clase abstracta para asignar si puede exceleder el limite.
     */
    public abstract void setExceedLimit();

    /**
     * Metodo para obtener el id del item.
     * @return variable int.
     */
    public int getItemSelector() {
        return itemSelector;
    }
    /**
     * Metodo para obtener el valor del efecto.
     * @return variable int.
     */
    public int getEfectAccelerationItem() {
        return efectAccelerationItem;
    }
    /**
     * Metodo para obtener el tiempo que dura el item.
     * @return variable int.
     */
    public int getTimeEfectItem() {
        return timeEfectItem;
    }
    /**
     * Metodo para obtener si o no excede el limite del tope de acceleracion.
     * @return variable boolean.
     */
    public boolean isExceedLimitItem() {
        return exceedLimitItem;
    }
    /**
     * Metodo para obtener si o no se utiliza un item.
     * @return variable boolean.
     */
    public boolean isActiveItem() {
        return isActiveItem;
    }
    /**
     * Metodo para activar el uso de un item.
     * @param activeItem asigna variable.
     */
    public void setActiveItem(final boolean activeItem) {
        isActiveItem = activeItem;
    }

    /**
     * Metodo para asignar el valor.
     * @param iitemSelector asigna variable.
     */
    public void setItemSelector(final int iitemSelector) {
        this.itemSelector = iitemSelector;
    }

    /**
     * Metodo para asignar el valor.
     * @param iefectAccelerationItem asigna variable.
     */
    public void setEfectAccelerationItem(final int iefectAccelerationItem) {
        this.efectAccelerationItem = iefectAccelerationItem;
    }

    /**
     * Metodo para asignar el valor.
     * @param itimeEfectItem asigna variable.
     */
    public void setTimeEfectItem(final int itimeEfectItem) {
        this.timeEfectItem = itimeEfectItem;
    }

    /**
     * Metodo para asignar el valor.
     * @param iexceedLimitItem asigna variable.
     */
    public void setExceedLimitItem(final boolean iexceedLimitItem) {
        this.exceedLimitItem = iexceedLimitItem;
    }
}
