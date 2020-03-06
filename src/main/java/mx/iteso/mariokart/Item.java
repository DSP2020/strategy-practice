package mx.iteso.mariokart; //ut

public abstract class Item {

    private int duration;
    private double velocity;
    //private String name;

    public int getDuration(){
        return this.duration;
    }

    public double getVelocity(){
        return this.velocity;
    }

    public void setDuration(int newDuration){
        this.duration = newDuration;
    }

    public void setVelocity(double newVelocity){
        this.velocity = newVelocity; 
    }

    public Item(int d, double v){
        this.duration = d;
        this.velocity = v;
    }
    
    public abstract void activeItem(MariokartCharacter c);
}
