/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.iteso.mariokart;

import mx.iteso.mariokart.characters.Bowser;
import mx.iteso.mariokart.characters.Mario;
import mx.iteso.mariokart.characters.Yoshi;
import mx.iteso.mariokart.items.BulletBill;
import mx.iteso.mariokart.items.Lightning;
import mx.iteso.mariokart.items.Mushroom;

/**
 *
 * @author coque
 */
// 1. Define the interface of the algorithm
//interface Strategy {
//    void solve();
//}
//
//// 2. Bury implementation
//@SuppressWarnings("ALL")
//abstract class StrategySolution implements Strategy {
//    // 3. Template Method
//    public void solve() {
//        start();
//        while (nextTry() && !isSolution()) {}
//        stop();
//    }
//
//    abstract void start();
//    abstract boolean nextTry();
//    abstract boolean isSolution();
//    abstract void stop();
//}
//
//class FOO extends StrategySolution {
//    private int state = 1;
//
//    protected void start() {
//        System.out.print("Start  ");
//    }
//
//    protected void stop() {
//        System.out.println("Stop");
//    }
//
//    protected boolean nextTry() {
//        System.out.print("NextTry-" + state++ + "  ");
//        return true;
//    }
//
//    protected boolean isSolution() {
//        System.out.print("IsSolution-" + (state == 3) + "  ");
//        return (state == 3);
//    }
//}
//
//// 2. Bury implementation
//abstract class StrategySearch implements Strategy {
//    // 3. Template Method
//    public void solve() {
//        while (true) {
//            preProcess();
//            if (search()) {
//                break;
//            }
//            postProcess();
//        }
//    }
//
//    abstract void preProcess();
//    abstract boolean search();
//    abstract void postProcess();
//}
//
//@SuppressWarnings("ALL")
//class BAR extends StrategySearch {
//    private int state = 1;
//
//    protected void preProcess()  {
//        System.out.print("PreProcess  ");
//    }
//
//    protected void postProcess() {
//        System.out.print("PostProcess  ");
//    }
//
//    protected boolean search() {
//        System.out.print("Search-" + state++ + "  ");
//        return state == 3 ? true : false;
//    }
//}
//
//// 4. Clients couple strictly to the interface
public class StrategyDemo {
    // client code here
//    private static void execute(Strategy strategy) {
//        strategy.solve();
//    }

    public static void main( String[] args ) {
//        Strategy[] algorithms = {new FOO(), new BAR()};
//        for (Strategy algorithm : algorithms) {
//            execute(algorithm);
//        }
        
        //Characters
        Bowser bowser = new Bowser();
        Mario mario = new Mario();
        Yoshi yoshi = new Yoshi();
        // ITEMS
        Mushroom  mushroom  = new Mushroom();
        BulletBill bullet = new BulletBill();
        Lightning lightning = new Lightning();
        
        bowser.start();
        System.out.println("ITEM: " + mushroom.getName());
        bowser.alterAcceleration(mushroom);
        System.out.println("ITEM: " + bullet.getName());
        bowser.alterAcceleration(bullet);
        System.out.println("ITEM: " + lightning.getName());
        bowser.alterAcceleration(lightning);
        
        mario.start();
        System.out.println("ITEM: " + mushroom.getName());
        mario.alterAcceleration(mushroom);
        System.out.println("ITEM: " + bullet.getName());
        mario.alterAcceleration(bullet);
        System.out.println("ITEM: " + lightning.getName());
        mario.alterAcceleration(lightning);
        
        yoshi.start();
        System.out.println("ITEM: " + mushroom.getName());
        yoshi.alterAcceleration(mushroom);
        System.out.println("ITEM: " + bullet.getName());
        yoshi.alterAcceleration(bullet);
        System.out.println("ITEM: " + lightning.getName());
        yoshi.alterAcceleration(lightning);
        
    }
}
