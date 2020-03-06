package mx.iteso.mariokart;

public abstract class Item {

    private Integer duration;
    private String name;
    private int tiempo;

    public Integer getItemDuration(){
        return this.duration;
    }

    public void setItemDuration(Integer duration){
        this.duration = duration;
    }

    public abstract void activeItem(MariokartCharacter c);

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
