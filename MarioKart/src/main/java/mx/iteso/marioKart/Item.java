package mx.iteso.marioKart;

public abstract class Item {

    public Item(double v,int time){
        this.velocity = v;//En kilómetros
        this.duration = time;//En segundos
    }

    private double velocity;
    private int duration;//In seconds

    public void setVelocity(double v){
        this.velocity = v;
    }
    public void setDuration(int time){
        this.duration = time;
    }

    public double getVelocity(){
        return this.velocity;
    }

    public double getDuration(){
        return this.duration;
    }

}
