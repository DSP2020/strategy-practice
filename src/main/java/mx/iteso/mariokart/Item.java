package mx.iteso.mariokart; //ut
/**
 * Items que todos usan.
 */

public abstract class Item {
    /**
     * Attr.
     */
    private int duration;
    /**
     * Attr.
     */
    private double velocity;
    //private String name;

    /**
     * Getter.
     * @return String
     */
    public int getDuration() {
        return this.duration;
    }

    /**
     * Getter.
     * @return String
     */
    public double getVelocity() {
        return this.velocity;
    }

    /**
     * Setter.
     * @param newDuration
     */
    public void setDuration(final int newDuration) {
        this.duration = newDuration;
    }

    /**
     * Setter.
     * @param newVelocity
     */
    public void setVelocity(final double newVelocity) {
        this.velocity = newVelocity;
    }

    /**
     * Constructor.
     * @param d
     * @param v
     */
    public Item(final int d, final double v) {
        this.duration = d;
        this.velocity = v;
    }
    /**
     * Activator.
     * @param c
     */
    public abstract void activeItem(MariokartCharacter c);
}
