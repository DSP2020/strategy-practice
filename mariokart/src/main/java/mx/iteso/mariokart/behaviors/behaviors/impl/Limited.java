/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.iteso.mariokart.behaviors.behaviors.impl;

import mx.iteso.mariokart.behaviors.Drifting;

/**
 *
 * @author coque
 */
public class Limited implements Drifting{
    @Override
    public void doDrifting(){
        System.out.println("Limited Drifting");
    }
}
