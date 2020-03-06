/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.iteso.mariokart.behaviors.behaviors.impl;

import mx.iteso.mariokart.behaviors.Acceleration;

/**
 *
 * @author coque
 */

public class Fast implements Acceleration{
  
    @Override
    public void doAcceleration(){
        System.out.println("Fast Aceleration");
    }
}
