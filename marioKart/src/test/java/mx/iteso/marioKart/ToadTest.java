package mx.iteso.marioKart;

import mx.iteso.marioKart.characters.Browser;
import mx.iteso.marioKart.characters.Toad;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ToadTest {
    Toad toad;

    @Before
    public void setUp(){ toad = new Toad(); }

    @Test
    public void testItemid(){
        toad.setCharacterSelector();
        assertEquals(5,toad.getCharacterSelector());
    }
    @Test
    public void testNotMoving(){
        toad.setStarMove(false);
        toad.speedUp();
        assertEquals(0,toad.getCurrentAcceleration());
    }
}
