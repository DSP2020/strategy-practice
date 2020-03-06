/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.iteso.mariokart.items;
import mx.iteso.mariokart.Item;
import static mx.iteso.mariokart.items.BulletBill.ABILITY_TIME;

/**
 *
 * @author coque
 */
public class Lightning extends Item{
    static final int DECREASE_SPEED = -20;
    static final String ITEM_NAME = "Ligtning";
    static final int ABILITY_TIME = 20;
    
    String name = ITEM_NAME;
    int effect =  DECREASE_SPEED;
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
