package items;

public class Bullet extends Item {

    static int bulletTime = 10;
    static int bulletaccmodifier = 5;

    public Bullet() {
        super(bulletaccmodifier, bulletTime);
    }
}
