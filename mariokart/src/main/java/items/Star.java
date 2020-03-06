package items;

public class Star extends Item {
    static int starTime = 20;
    static int staraccmodifier = 2;

    public Star() {
        super(staraccmodifier, starTime);
    }
}
