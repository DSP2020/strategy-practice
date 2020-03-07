package strategy;

import characters.Bowser;
import characters.Toad;
import characters.Yoshi;
import items.Bullet;
import items.Item;
import items.Mushroom;
import items.Star;

public class App
{
    public static void main( String[] args )
    {
        Yoshi y = new Yoshi();
        Bowser b = new Bowser();
        Toad t = new Toad();

        int raceTotalMeters = 5000;
        int time = 0;

        while(y.getCurrentMeters()<raceTotalMeters
                && b.getCurrentMeters()<raceTotalMeters
                && t.getCurrentMeters()<raceTotalMeters){
            time++;

            if(y.getItem()!= null){
                y.getItem().useItem(y);
            } else if (((int)(Math.random()*10))==7){
                y.setItem(getcubeItem());
                y.getItem().useItem(y);
            }else if (((int)(Math.random()*8))==1){
                y.setCurrentSpeed(0);
                System.out.println( y.getName() + " ha sufrido un accidente");
            }

            if(b.getItem()!= null){
                b.getItem().useItem(b);
            } else if (((int)(Math.random()*10))==7){
                b.setItem(getcubeItem());
                b.getItem().useItem(b);
            }else if (((int)(Math.random()*10))==1){
                System.out.println( b.getName() + " ha sufrido un accidente");
                b.setCurrentSpeed(0);
            }

            if(t.getItem()!= null){
                t.getItem().useItem(t);
            } else if (((int)(Math.random()*10))==7){
                t.setItem(getcubeItem());
                t.getItem().useItem(t);
            }else if (((int)(Math.random()*5))==1){
                System.out.println( t.getName() + " ha sufrido un accidente");
                t.setCurrentSpeed(0);
            }

            y.move();
            b.move();
            t.move();

            System.out.println( " Time: " + time);

            System.out.println( y.getName() + " meters: " + y.getCurrentMeters() + " speed: " + y.getCurrentSpeed());
            System.out.println( b.getName() + " meters: " + b.getCurrentMeters() + " speed: " + b.getCurrentSpeed());
            System.out.println( t.getName() + " meters: " + t.getCurrentMeters() + " speed: " + t.getCurrentSpeed());
        }
    }

    static Item getcubeItem(){
        Item i;
        switch((int)(Math.random()*3)){
            case 0:
                i = new Bullet();
                break;
            case 1:
                i = new Star();
                break;
            default:
                i = new Mushroom();
        }
        return i;
    }
}
