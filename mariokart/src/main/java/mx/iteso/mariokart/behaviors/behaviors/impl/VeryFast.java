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
public class VeryFast implements Acceleration {
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @return El número de ítems (números aleatorios) de que consta la serie
    */
    @Override
    public String doAcceleration() {
        //System.out.println("Very Fast Aceleration");
        return "Very Fast Aceleration";
    }
}
