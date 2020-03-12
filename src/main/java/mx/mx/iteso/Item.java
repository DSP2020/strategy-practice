package mx.iteso;

public abstract class Item {
    private double velocity;
    private int duration;

    public Item(double velocity, int duration) {
        this.velocity = velocity;
        this.duration = duration;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "using Item{" +
                "velocity=" + velocity +
                ", duration=" + duration +
                '}';
    }
}
