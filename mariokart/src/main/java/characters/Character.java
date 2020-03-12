package characters;

import accelerations.Acceleration;
import accelerations.Normal;
import drift.Drift;
import items.Item;
/**
 * Character!
 */
public abstract class Character {
    /**
     * mass!
     */
    private int mass;
    /**
     * strength!
     */
    private int strength;
    /**
     * name!
     */
    private String name;
    /**
     * currentSpeed!
     */
    private int currentSpeed;
    /**
     * currentMeters!
     */
    private int currentMeters;
    /**
     * item!
     */
    private Item item;
    /**
     * acceleration!
     */
    private Acceleration acceleration;
    /**
     * drift!
     */
    private Drift drift;
    /**
     * maxSpeed!
     */
    private int maxSpeed;
    /**
     * constructor!
     *@param s
     * jajaja
     *@param m
     * jajaja
     *@param n
     * jajaja
     *@param ms
     * jajaja
     *@param d
     * jajaja
     */
    public Character(final int s,
                     final int m,
                     final String n,
                     final int ms,
                     final Drift d) {
        setStrength(s);
        setName(n);
        setMass(m);
        setItem(null);
        setMaxSpeed(ms);
        setAcceleration(new Normal());
        setDrift(d);
        setCurrentSpeed(0);
        setCurrentMeters(0);
    }
    /**
     * setMaxSpeed!
     *@param ms
     * jajaja
     */
    public void setMaxSpeed(final int ms) {
        this.maxSpeed = ms;
    }
    /**
     * setItem!
     *@param i
     * jajaja
     */
    public void setItem(final Item i) {
        this.item = i;
    }
    /**
     * setCurrentSpeed!
     *@param c
     * jajaja
     */
    public void setCurrentSpeed(final int c) {
        this.currentSpeed = c;
    }
    /**
     * setStrength!
     *@param s
     * jajaja
     */
    public void setStrength(final int s) {
        this.strength = s;
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
     * setMass!
     *@param m
     * jajaja
     */
    public void setMass(final int m) {
        this.mass = m;
    }
    /**
     * setAcceleration!
     *@param a
     * jajaja
     */
    public void setAcceleration(final Acceleration a) {
        this.acceleration = a;
        System.out.println(this.getName()
                + " changed to "
                + this.acceleration.getName());
    }
    /**
     * setCurrentMeters!
     *@param cm
     * jajaja
     */
    public void setCurrentMeters(final int cm) {
        this.currentMeters = cm;
    }
    /**
     * setDrift!
     *@param d
     * jajaja
     */
    public void setDrift(final Drift d) {
        this.drift = d;
    }
    /**
     * getStrength!
     *@return int
     * jajaja
     */
    public int getStrength() {
        return this.strength;
    }
    /**
     * getName!
     *@return String
     * jajaja
     */
    public String getName() {
        return  this.name;
    }
    /**
     * getMass!
     *@return int
     * jajaja
     */
    public int getMass() {
        return this.mass;
    }
    /**
     * getItem!
     *@return Item
     * jajaja
     */
    public Item getItem() {
        return this.item;
    }
    /**
     * getCurrentSpeed!
     *@return int
     * jajaja
     */
    public int getCurrentSpeed() {
        return this.currentSpeed;
    }
    /**
     * getMaxSpeed!
     *@return int
     * jajaja
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
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
     * getCurrentMeters!
     *@return int
     * jajaja
     */
    public int getCurrentMeters() {
        return this.currentMeters;
    }
    /**
     * getDrift!
     *@return Drift
     * jajaja
     */
    public Drift getDrift() {
        return this.drift;
    }
    /**
     * move!
     */
    public void move() {
        this.acceleration.accelerate(this);
        setCurrentMeters(
                getCurrentMeters()
                        + getCurrentSpeed()
        );
    }
}
