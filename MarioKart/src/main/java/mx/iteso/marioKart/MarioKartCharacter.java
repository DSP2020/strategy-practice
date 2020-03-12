package mx.iteso.marioKart;

import mx.iteso.marioKart.behaviorsInterfaces.Acceleration;
import mx.iteso.marioKart.behaviorsInterfaces.Drifting;

/**
 * clase abstracta MariaKartCharacter.
 */

public abstract class MarioKartCharacter {
    /**
     * velocidad del personaje.
     */
    private double velocity;
    /**
     * Aceleración del personaje.
     */
    private Acceleration acceleration;
    /**
     * Derrape del personaje.
     */
    private Drifting drifting;

    /**
     *
     * @param v es la velocidad del personaje.
     */

    public MarioKartCharacter(final double v) {
        this.velocity = v;
    }

    /**
     *
     * @param a que va a tener el personaje.
     */

    public final void setAceleration(final Acceleration a) {
        this.acceleration = a;
    }

    /**
     *
     * @return la aceleración del personaje.
     */

    public final Acceleration getAcceleration() {
        return this.acceleration;
    }

    /**
     *
     * @return la velocidad del personaje.
     */

    public double getCurrentVelocity() {
        return this.velocity;
    }

    /**
     *
     * @param currentVelocity velocidad actual del personaje.
     * @param item que toma durante la carrera.
     */

    public final void changeAcceleration(final double currentVelocity,
                                         final Item item) {
        getAcceleration().acceleration(currentVelocity, item);
        this.velocity = currentVelocity;
    }

}
