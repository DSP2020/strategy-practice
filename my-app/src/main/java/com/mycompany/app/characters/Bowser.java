package com.mycompany.app.characters;

import com.mycompany.app.behaviors.Acceleration;
import com.mycompany.app.behaviors.impl.SlowAcceleration;

public class Bowser extends Character {
    Acceleration acceleration = new SlowAcceleration();
}
