/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.iteso.mariokart;

/**
 *
 * @author coque
 */
public abstract class Item {
    String name;
    int effect;
    int time;
    
    public abstract String getName();
    public abstract int getEffect();
    public abstract int getTime();
    
}
