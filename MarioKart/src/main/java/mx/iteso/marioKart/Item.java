package mx.iteso.marioKart;

/**
 * class Item.
 */
public abstract class Item {
    /**
     *
     * @param v es la velocidad.
     * @param time es el tiempo.
     */

    public Item(final double v, final int time) {
        this.velocity = v; //En metros
        this.duration = time; //En segundos
    }

    /**
     * velocidad del item.
     */

    private double velocity;
    /**
     * duración del item.
     */
    private int duration; //In seconds

    /**
     *
     * @param v es la velocidad a setear.
     */

    public final void setVelocity(final double v) {
        this.velocity = v;
    }

    /**
     *
     * @param time es el tiempo a setear.
     */
    public final void setDuration(final int time) {
        this.duration = time;
    }

    /**
     *
     * @return la velocidad del item.
     */

    public final double getVelocity() {
        return this.velocity;
    }

    /**
     *
     * @return la duración del item.
     */

    public final double getDuration() {
        return this.duration;
    }

}
