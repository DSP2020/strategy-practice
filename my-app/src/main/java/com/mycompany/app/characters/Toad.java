package com.mycompany.app.characters;

import com.mycompany.app.behaviors.Acceleration;
import com.mycompany.app.behaviors.impl.FastAcceleration;

public class Toad extends Character {
    Acceleration acceleration = new FastAcceleration();
}
