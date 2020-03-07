package items;

import accelerations.Acceleration;
import accelerations.Normal;
import characters.Character;

public abstract class Item {
    private int time;
    private Acceleration acceleration;
    private String name;

    public Item(int t, Acceleration a, String n){
        setTime(t);
        setAcceleration(a);
        setName(n);
    }

    public void setAcceleration(Acceleration a) {
        this.acceleration = a;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setTime(int t){
        this.time = t;
    }

    public int getTime(){
        return this.time;
    }

    public Acceleration getAcceleration() {
        return this.acceleration;
    }

    public String getName() {
        return this.name;
    }

    public void useItem(Character c){
        this.setTime(this.getTime()-1);

        System.out.println( c.getName() + " is using: " + this.getName() + " restante: " + this.getTime());

        if(this.getTime()==0){
            c.setAcceleration(new Normal());
            c.setItem(null);

        } else{
            c.setAcceleration(this.getAcceleration());
        }
    }
}
