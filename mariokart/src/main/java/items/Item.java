package items;

public abstract class Item {
    private int accmodifier;
    private int time;

    public Item(int accm, int t){
        setAccmodifier(accm);
        setTime(t);
    }

    public void setAccmodifier(int accm){
        this.accmodifier = accm;
    }

    public void setTime(int t){
        this.time = t;
    }

    public int getAccmodifier(){
        return this.accmodifier;
    }

    public int getTime(){
        return this.time;
    }
}
