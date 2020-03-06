/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.iteso.mariokart.items;
import mx.iteso.mariokart.Item;
/**
 *
 * @author coque
 */
public class BulletBill extends Item {
    
    static final int INCREASE_SPEED = 50;
    static final String ITEM_NAME = "BulletBill";
    static final int ABILITY_TIME = 20;
    
    String name = ITEM_NAME;
    int effect = INCREASE_SPEED;
    int time = ABILITY_TIME;
    
    @Override
    public String getName() {
        return this.name;
    }
        
    @Override
    public int getEffect() {
       return this.effect;
    }
    
    @Override
    public int getTime() {
       return this.time;
    }
    
}
