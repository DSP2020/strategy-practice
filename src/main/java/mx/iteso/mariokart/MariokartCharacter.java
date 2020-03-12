package mx.iteso.mariokart; //ut
import mx.iteso.mariokart.behaviors.IfAcceleration; //ut

public abstract class MariokartCharacter {
    /**
     * Attr.
     */
    private String acceleration;
    /**
     * Attr.
     */
    private double velocity;

    /**
     * Getter.
     * @return String
     */
    public String getAcceleration() {
        return this.acceleration;
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
     * @param newAcceleration
     */
    public void setAcceleration(final IfAcceleration newAcceleration) {
        this.acceleration = newAcceleration;
    }
    /**
     * Setter.
     * @param newVel
     */
    public void setVelocity(final double newVel) {
        this.vel = newVel;
    }

    /**
     * Constructor.
     * @param accel
     * @param vel
     */
    public MariokartCharacter(final String accel, final double vel) {
        this.acceleration = accel;
        this.velocity = vel;
    }

    /**
     * Constructor.
     */
    public MariokartCharacter() {
        this.acceleration = "Going normal";
        this.velocity = 0;
    }
}
