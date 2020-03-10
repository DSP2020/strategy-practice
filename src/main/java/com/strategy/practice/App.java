package com.strategy.practice;

import com.strategy.practice.characters.Bowser;
import com.strategy.practice.characters.Luigi;
import com.strategy.practice.characters.Mario;
import com.strategy.practice.items.Mushroom;
import com.strategy.practice.items.Ray;
import com.strategy.practice.items.Star;

/**
 * Hello world!
 *
 */
public final class App {

    /**
     * Constructor.
     */
    private App() {

    }

    /**
     * Main de la app.
     * @param args args.
     */
    public static void main(final String[] args) {
        System.out.println("Hello World!");
        Mario mario = new Mario();
        Luigi luigi = new Luigi();
        Bowser bowser = new Bowser();

        System.out.println(mario.accelerate());
        System.out.println(luigi.accelerate());
        System.out.println(bowser.accelerate());

        mario.setItem(new Star());
        luigi.setItem(new Ray());
        bowser.setItem(new Mushroom());

        System.out.println(mario.itemAcceleration());
        System.out.println(luigi.itemAcceleration());
        System.out.println(bowser.itemAcceleration());

        System.out.println(mario.drift());
        System.out.println(luigi.drift());
        System.out.println(bowser.drift());
    }
}
