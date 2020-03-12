package mx.iteso.mariokart.items; //ut
import mx.iteso.mariokart.Item;
import mx.iteso.mariokart.MariokartCharacter;
/**
 * El más castroso.
 */

public class Shell extends Item {
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
