package items;

public class Mushroom extends Item {
    static int mushroomTime = 3;
    static int mushroomaccmodifier = 3;

    public Mushroom() {
        super(mushroomaccmodifier, mushroomTime);
    }
}
