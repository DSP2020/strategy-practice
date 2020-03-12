package mx.iteso.marioKart.characters;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestMario {
    Mario mario;

    @Before
    public void setUp(){
        mario = new Mario();
    }

    @Test
    public void getCurrentVelocity(){
        assertEquals(150,mario.getCurrentVelocity(),0);
    }
}
