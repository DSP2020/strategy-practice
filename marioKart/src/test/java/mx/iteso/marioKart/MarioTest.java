package mx.iteso.marioKart;

import mx.iteso.marioKart.characters.Mario;
import mx.iteso.marioKart.characters.Toad;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarioTest {
    Mario mario;

    @Before
    public void setUp(){ mario = new Mario(); }

    @Test
    public void testItemid(){
        mario.setCharacterSelector();
        assertEquals(1,mario.getCharacterSelector());
    }
    @Test
    public void testNotMoving(){
        mario.setStarMove(false);
        mario.speedUp();
        assertEquals(0,mario.getCurrentAcceleration());
    }
}
