package com.mycompany.app.characters;

import com.mycompany.app.behaviors.Acceleration;
import com.mycompany.app.behaviors.impl.RegularAcceleration;

public class Mario extends Character {
    Acceleration acceleration = new RegularAcceleration();
}
