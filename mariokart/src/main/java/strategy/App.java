package strategy;

import characters.Bowser;
import characters.Toad;
import characters.Yoshi;
import items.Bullet;
import items.Item;
import items.Mushroom;
import items.Star;
/**
 * App!
 *
 */
final class App {
    /**
     * App!
     *
     */
    private App() {

    }
    /**
     * main!
     * @param args
     * jajaja
     */
    public static void main(final String[] args) {
        /**
         * number1!
         *
         */
        final int number1 = 1;
        /**
         * ITEMPROBABILITY!
         *
         */
        final int probability10 = 10;
        /**
         * ACCIDENTPROBABILITY!
         *
         */
        final int probability8 = 8;
        /**
         * CURVAPROBABILITY!
         *
         */
        final int probability6 = 6;
        /**
         * Yoshi!
         *
         */
        Yoshi y = new Yoshi();
        /**
         * Bowser!
         *
         */
        Bowser b = new Bowser();
        /**
         * Toad!
         *
         */
        Toad t = new Toad();
        /**
         * RACETOTALMETERS!
         *
         */
        final int racetotalmeters = 5000;
        /**
         * time!
         *
         */
        int time = 0;

        while (y.getCurrentMeters() < racetotalmeters
                && b.getCurrentMeters() < racetotalmeters
                && t.getCurrentMeters() < racetotalmeters) {
            time++;

            if (y.getItem() != null) {
                y.getItem().useItem(y);
            } else if (((int) (Math.random() * probability10)) == number1) {
                y.setItem(getcubeItem());
                y.getItem().useItem(y);
            } else if (((int) (Math.random() * probability8)) == number1) {
                y.setCurrentSpeed(0);
                System.out.println(y.getName()
                        + " ha sufrido un accidente");
            } else if (((int) (Math.random() * probability8)) == number1) {
                System.out.println(y.getName()
                        + " entro a una curva");
                y.getDrift().drifting(y);
            }

            if (b.getItem() != null) {
                b.getItem().useItem(b);
            } else if (((int) (Math.random() * probability10)) == number1) {
                b.setItem(getcubeItem());
                b.getItem().useItem(b);
            } else if (((int) (Math.random() * probability10)) == number1) {
                System.out.println(b.getName()
                        + " ha sufrido un accidente");
                b.setCurrentSpeed(0);
            } else if (((int) (Math.random() * probability8)) == number1) {
                System.out.println(b.getName()
                        + " entro a una curva");
                b.getDrift().drifting(b);
            }

            if (t.getItem() != null) {
                t.getItem().useItem(t);
            } else if (((int) (Math.random() * probability10)) == number1) {
                t.setItem(getcubeItem());
                t.getItem().useItem(t);
            } else if (((int) (Math.random() * probability6)) == number1) {
                System.out.println(t.getName()
                        + " ha sufrido un accidente");
                t.setCurrentSpeed(0);
            } else if (((int) (Math.random() * probability8)) == number1) {
                System.out.println(t.getName()
                        + " entro a una curva");
                t.getDrift().drifting(t);
            }

            y.move();
            b.move();
            t.move();

            System.out.println(" Time: " + time);

            System.out.println(y.getName()
                    + " meters: "
                    + y.getCurrentMeters()
                    + " speed: "
                    + y.getCurrentSpeed());
            System.out.println(b.getName()
                    + " meters: "
                    + b.getCurrentMeters()
                    + " speed: "
                    + b.getCurrentSpeed());
            System.out.println(t.getName()
                    + " meters: "
                    + t.getCurrentMeters()
                    + " speed: "
                    + t.getCurrentSpeed());
        }
    }
    /**
     * getcubeItem!
     *@return Item
     * jajaja
     */
    private static Item getcubeItem() {
        /**
         * probability3!
         */
        final int probalility3 = 3;
        Item i;
        switch ((int) (Math.random() * probalility3)) {
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
