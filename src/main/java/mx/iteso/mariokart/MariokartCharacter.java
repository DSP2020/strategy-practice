package mx.iteso.mariokart; //ut
import mx.iteso.mariokart.ibehaviors.Acceleration; //ut

public abstract class MariokartCharacter {
    private String acceleration;
    private double velocity;

    public String getAcceleration() {
        return this.acceleration;
    }

    public double getVelocity(){
        return this.velocity;
    }

    public void setAcceleration(Acceleration newAcceleration) {
        this.acceleration = newAcceleration;
    }

    public void setVelocity(double newVel){
        this.vel = newVel;
    }

    public MariokartCharacter(String acc, double vel){
        this.acceleration = accel;
        this.velocity = vel;
    }

    public MariokartCharacter(){
        this.acceleration = "Going normal";
        this.velocity = 0;
    }
    
}
