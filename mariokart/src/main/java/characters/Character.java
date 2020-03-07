package characters;

import accelerations.Acceleration;
import accelerations.Normal;
import items.Item;

public abstract class Character {
    private int mass;
    private int strength;
    private String name;
    private int currentSpeed = 0;
    private int currentMeters = 0;
    private Item item;
    private Acceleration acceleration;
    private int maxSpeed;

    public Character(int s, int m, String n, int ms){
        setStrength(s);
        setName(n);
        setMass(m);
        setItem(null);
        setMaxSpeed(ms);
        setAcceleration(new Normal());
    }

    public void setMaxSpeed(int ms) {
        this.maxSpeed = ms;
    }

    public void setItem(Item i){
        this.item = i;
    }

    public void setCurrentSpeed(int c) {
        this.currentSpeed = c;
    }

    public void setStrength(int s){
        this.strength = s;
    }

    public void setName(String n){
        this.name = n;
    }

    public void setMass(int m){
        this.mass = m;
    }

    public void setAcceleration(Acceleration a){
        this.acceleration = a;
        System.out.println( this.getName() + " changed to " + this.acceleration.getName());
    }

    public void setCurrentMeters(int cm) {
        this.currentMeters = cm;
    }

    public int getStrength(){
        return this.strength;
    }

    public String getName(){
        return  this.name;
    }

    public int getMass(){
        return this.mass;
    }

    public Item getItem() {
        return this.item;
    }

    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public Acceleration getAcceleration(){
        return this.acceleration;
    }

    public int getCurrentMeters() {
        return this.currentMeters;
    }


    public void move(){
        this.acceleration.accelerate(this);
        setCurrentMeters(
                getCurrentMeters() +
                        getCurrentSpeed()
        );
    }
}
