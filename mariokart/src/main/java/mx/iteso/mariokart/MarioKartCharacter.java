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
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    private Acceleration acceleration;
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    private Drifting drifting;
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    private Item item;
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    private String name;
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    *@param itemParam El parámetro numeroItems define el número de elementos
    *que va a tener la serie aleatoria
    * @return El número de ítems (números aleatorios) de que consta la serie
    */
    public abstract String alterAcceleration(Item itemParam);
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @return El número de ítems (números aleatorios) de que consta la serie
    *@param itemParam El parámetro numeroItems define el número de elementos
    *que va a tener la serie aleatoria
    */
    public abstract String alterDrifting(Item itemParam);
}
