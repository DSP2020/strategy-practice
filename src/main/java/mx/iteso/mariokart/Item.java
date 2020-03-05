package mx.iteso.mariokart;

public abstract class Item {

    private Integer duration;

    public Integer getItemDuration(){
        return this.duration;
    }

    public void setItemDuration(Integer duration){
        this.duration = duration;
    }
}
