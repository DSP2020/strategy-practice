package mx.iteso.mariokart.characters;

import mx.iteso.mariokart.MariokartCharacter;
import mx.iteso.mariokart.behaviors.iAcceleration;
import mx.iteso.mariokart.behaviors.impl.Fast;

public class Mario extends MariokartCharacter {

    iAcceleration acLuigi = new Fast();
}
