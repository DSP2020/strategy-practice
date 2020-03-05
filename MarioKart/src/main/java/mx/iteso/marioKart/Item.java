package mx.iteso.marioKart;

public abstract class Item {
    private double initialVelocity;
    private double finalVelocity;
    private double initialTime;
    private double finalTime;
    private int duration;

    public void setInitialVelocity(double vi){
        this.initialVelocity = vi;
    }

    public void setFinalVelocity(double vf){
        this.finalVelocity = vf;
    }

    public void setInitialTime(double ti){
        this.initialTime = ti;
    }

    public void setFinalTime(double tf){
        this.finalTime = tf;
    }

    public void setDuration(int time){

    }

    public double getInitialVelocity(){
        return this.initialVelocity;
    }

    public double getFinalVelocity(){
        return this.finalVelocity;
    }

    public double getInitialTime(){
        return this.initialTime;
    }

    public double getFinalTime(){
        return this.finalTime;
    }

}
