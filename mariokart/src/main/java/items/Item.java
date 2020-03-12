package items;

import accelerations.Acceleration;
import accelerations.Normal;
import characters.Character;
/**
 * Item!
 *
 */
public abstract class Item {
    /**
     * time!
     *
     */
    private int time;
    /**
     * acceleration!
     *
     */
    private Acceleration acceleration;
    /**
     * name!
     *
     */
    private String name;
    /**
     * constructor!
     *@param t
     * jajaja
     *@param a
     * jajaja
     *@param n
     * jajaja
     */
    public Item(final int t,
                final Acceleration a,
                final String n) {
        setTime(t);
        setAcceleration(a);
        setName(n);
    }
    /**
     * setAcceleration!
     *@param a
     * jajaja
     */
    public void setAcceleration(final Acceleration a) {
        this.acceleration = a;
    }
    /**
     * setName!
     *@param n
     * jajaja
     */
    public void setName(final String n) {
        this.name = n;
    }
    /**
     * setTime!
     *@param t
     * jajaja
     */
    public void setTime(final int t) {
        this.time = t;
    }
    /**
     * getTime!
     *@return int
     * jajaja
     */
    public int getTime() {
        return this.time;
    }
    /**
     * getAcceleration!
     *@return Acceleration
     * jajaja
     */
    public Acceleration getAcceleration() {
        return this.acceleration;
    }
    /**
     * getName!
     *@return String
     * jajaja
     */
    public String getName() {
        return this.name;
    }
    /**
     * useItem!
     *@param c
     * jajaja
     */
    public void useItem(final Character c) {
        this.setTime(this.getTime() - 1);
        System.out.println(c.getName()
                + " is using: "
                + this.getName()
                + " restante: "
                + this.getTime());

        if (this.getTime() == 0) {
            c.setAcceleration(new Normal());
            c.setItem(null);
        } else {
            c.setAcceleration(this.getAcceleration());
        }
    }
}
