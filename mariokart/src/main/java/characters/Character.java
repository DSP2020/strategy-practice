package characters;

public abstract class Character {
    private int size;
    private String name;

    public Character(int s, String n){
        setSize(s);
        setName(n);
    }

    public void setSize(int s){
        this.size = s;
    }

    public void setName(String n){
        this.name = n;
    }

    public int getSize(){
        return this.size;
    }

    public String getName(){
        return  this.name;
    }
}
