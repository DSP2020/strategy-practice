package mx.iteso.mariokart.items; //ut

import mx.iteso.mariokart.Item;
import mx.iteso.mariokart.MariokartCharacter;

public class Star extends Item {
    private int timeFinal = getItemDuration();
    private int timeInicial = 0;

    @Override
    public void activeItem(MariokartCharacter character) {
        String actual = character.getAcceleration();
        for(timeInicial = 0; timeInicial < timeFinal; timeInicial ++) {
            character.setAcceleration("Fast");
            character.getAcceleration();
        }

        character.setAcceleration(actual);
    }
}
