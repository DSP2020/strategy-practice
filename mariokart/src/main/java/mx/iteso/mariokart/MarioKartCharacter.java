/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.iteso.mariokart;

import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.Drifting;

/**
 *
 * @author coque
 */
public abstract class MarioKartCharacter {
    
    Acceleration acceleration;
    Drifting drifting;
    Item item;
    int defaultSpeed;
    String name;
    
    public abstract void alterAcceleration(Item itemParam);
    public abstract void alterDrifting(Item itemParam);
    
    
}
