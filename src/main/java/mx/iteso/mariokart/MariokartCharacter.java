package mx.iteso.mariokart;

public abstract class MariokartCharacter {

    public String getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(String acceleration) {
        this.acceleration = acceleration;
    }

    private String acceleration;

    public MariokartCharacter(){
        this.acceleration = "Normal";
    }

    public void useItem(Item item){
        int duration = item.getItemDuration();
    }

}
