/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.iteso.mariokart.characters;
import mx.iteso.mariokart.Item;
import mx.iteso.mariokart.MarioKartCharacter;
import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.Drifting;
import mx.iteso.mariokart.behaviors.behaviors.impl.Fast;
import mx.iteso.mariokart.behaviors.behaviors.impl.Limited;
import mx.iteso.mariokart.behaviors.behaviors.impl.Normal;
import mx.iteso.mariokart.behaviors.behaviors.impl.VeryFast;
import mx.iteso.mariokart.behaviors.behaviors.impl.VerySlow;
import mx.iteso.mariokart.behaviors.behaviors.impl.Wide;

/**
 *
 * @author coque
 */
public class Yoshi extends MarioKartCharacter {
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    private Acceleration acceleration  = new Fast();
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    private Drifting drifting = new Normal();
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    private Item item;
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    private String name = "Mario";
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    public void start() {
        System.out.println("Mario moving");
        this.acceleration.doAcceleration();
        this.drifting.doDrifting();
    }
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @return El número de ítems (números aleatorios) de que consta la serie
    *@param itemParam El parámetro numeroItems define el número de elementos
    *que va a tener la serie aleatoria
    */
    @Override
    public String alterAcceleration(final Item itemParam) {
        if (itemParam.getName() == "Mushroom") {
            Acceleration acc = new VeryFast();
            return acc.doAcceleration();
        } else if (itemParam.getName() == "Lightning") {
            Acceleration acc = new VerySlow();
            return acc.doAcceleration();
        } else if (itemParam.getName() == "BulletBill") {
            Acceleration acc = new VeryFast();
            return acc.doAcceleration();
        }
        return this.acceleration.doAcceleration();
    }
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @return El número de ítems (números aleatorios) de que consta la serie
    *@param itemParam El parámetro numeroItems define el número de elementos
    *que va a tener la serie aleatoria
    */
    @Override
    public String alterDrifting(final Item itemParam) {
        if (itemParam.getName() == "Mushroom") {
            Drifting dt = new Wide();
            return dt.doDrifting();
        } else if (itemParam.getName() == "Lightning") {
            Drifting dt = new Limited();
            return dt.doDrifting();
        } else if (itemParam.getName() == "BulletBill") {
            Drifting dt = new Limited();
            return dt.doDrifting();
        }
        return this.drifting.doDrifting();
    }
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @return El número de ítems (números aleatorios) de que consta la serie
    */
    public String getName() {
        return this.name;
    }
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @return El número de ítems (números aleatorios) de que consta la serie
    */
    public Acceleration getAcceleration() {
        return this.acceleration;
    }
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @return El número de ítems (números aleatorios) de que consta la serie
    */
    public Drifting getAcceleratio() {
        return this.drifting;
    }
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @return El número de ítems (números aleatorios) de que consta la serie
    */
    public Item getItem() {
        return this.item;
    }
}
