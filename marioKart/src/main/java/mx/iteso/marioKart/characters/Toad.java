package mx.iteso.marioKart.characters;

import mx.iteso.marioKart.abstracts.Character;

/**
 * Esta clase es de un personaje y extiende de la clase abstracta Character.
 * @author: Juan Carlos Ortiz Pinto
 * @version: 11/03/2020/1.1
 */
public class Toad extends Character {
    /**
     * Variable que le asigna un identificador.
     */
    private final int idCharacter = 5;
    /**
     * Variable para asignar el tope de incremento.
     */
    private final int speedMax = 9;
    /**
     * Variable para asignar la acceleracion que ejerce.
     */
    private final int acceleration = 6;
    /**
     * Variable para asignar el balance del corredor.
     */
    private final int balance = 6;
    /**
     * Variable para asignar el peso.
     */
    private final int weight = 1;
    /**
     * Variable para determinar el movimiento.
     */
    private boolean moving = false;
    /**
     * Metodo para asignar el id del personaje.
     */
    public void setCharacterSelector() {
        this.setCharacterSelector(idCharacter);
    }
    /**
     * Metodo para incrementar la acceleracion.
     */
    public void speedUp() {
        final int limitTimeDrifting = 3;
        final int limitBalanceDrifting = 10;
        if (moving) {
            for (int i = 0; i < this.speedMax; i++) {
                if (this.getItem().isActiveItem()) {
                    for (int j = 0; j < this.getItem()
                            .getTimeEfectItem(); j++) {
                        this.setCurrentAcceleration(
                                this.getCurrentAcceleration()
                                        + this.getItem()
                                        .getEfectAccelerationItem());
                    }
                }
                if (this.getiDrifting().isDrifting()) {
                    this.setTimerDrifting(0);
                    if (this.getiDrifting().isStable()) {
                        System.out.println(
                                this.getIfisDriftingStable(
                                        this.balance, this.weight));
                    } else if (this.getTimerDrifting() <= limitTimeDrifting) {
                        int tempBalance =
                                (this.balance < limitBalanceDrifting)
                                        ? this.balance + 2 : this.balance;
                        System.out.println(
                                this.getIfisDriftingStable(
                                        tempBalance, this.weight));
                    }
                    this.setTimerDrifting(this.getTimerDrifting() + 1);
                }
                this.setCurrentAcceleration(this.getCurrentAcceleration() + i);
                System.out.println(this.getTypeAcceleration());
            }
        } else {
            this.setCurrentAcceleration(0);
        }
    }
    /**
     * Metodo para asignar el inicio del movimiento.
     * @param isMoving variable que asigna.
     */
    public void setStarMove(final boolean isMoving) {
        this.moving = isMoving;
    }
}
