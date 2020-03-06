package mx.iteso.mariokart.items;

import mx.iteso.mariokart.Item;
import mx.iteso.mariokart.MariokartCharacter;
import mx.iteso.mariokart.behaviors.ifAcceleration;
import mx.iteso.mariokart.behaviors.impl.VeryFast;

public class Mushroom extends Item {

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
