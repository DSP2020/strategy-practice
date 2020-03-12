package mx.iteso.mariokart.items;
import mx.iteso.mariokart.Item;
import mx.iteso.mariokart.MariokartCharacter;
//import mx.iteso.mariokart.behaviors.ifAcceleration;
//import mx.iteso.mariokart.behaviors.impl.VeryFast;
/**
 * El más común.
 */

public class Mushroom extends Item {
    /**
     * Attr.
     */
    private int timeFinal = getItemDuration();
    /**
     * Attr.
     */
    private int timeInicial = 0;
    /**
     * Activator.
     * @param character
     */
    @Override
    public void activeItem(final MariokartCharacter character) {
        String actual = character.getAcceleration();
        for (timeInicial = 0; timeInicial < timeFinal; timeInicial++) {
            character.setAcceleration("Fast");
            character.getAcceleration();
        }

        character.setAcceleration(actual);
    }

}
