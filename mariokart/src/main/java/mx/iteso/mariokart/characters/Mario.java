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
import mx.iteso.mariokart.behaviors.behaviors.impl.Slow;
import mx.iteso.mariokart.behaviors.behaviors.impl.VeryFast;
import mx.iteso.mariokart.behaviors.behaviors.impl.VerySlow;
/**
 *
 * @author coque
 */
public class Mario extends MarioKartCharacter {
    Acceleration acceleration  = new Fast();
    Drifting drifting;
    Item item;
    int speed = 100;
    String name = "Mario";
    
    
    public void start(){
        System.out.println("Mario moving");
        this.acceleration.doAcceleration();
    }
    @Override
    public void alterAcceleration(Item itemParam){
        if(itemParam.getName() == "Mushroom"){
            Acceleration acc = new VeryFast();
            acc.doAcceleration();
            System.out.println("End ITEM");
            this.acceleration.doAcceleration();
        }else if (itemParam.getName() == "Lightning"){
            Acceleration acc = new VerySlow();
            acc.doAcceleration();
            System.out.println("End ITEM");
            this.acceleration.doAcceleration();            
        }else if(itemParam.getName() == "BulletBill"){
            Acceleration acc = new VeryFast();
            acc.doAcceleration();
            System.out.println("End ITEM");
            this.acceleration.doAcceleration();            
        }
        
    }
    
    @Override
    public void alterDrifting(){

    }
    
    
    
    public void setAcceleration(Acceleration accelerationParam){
        this.acceleration = accelerationParam; 
    }
    
    public void setDrifting(Drifting driftingParam){
        this.drifting = driftingParam;
    }
        
    public String getName(){
        return this.name;
    }
    
    public int getDefaultSpeed(){
        return this.speed;
    }
    
    public void setDefaultSpeed(int speedParam){
        this.speed = speedParam;
    }
}
