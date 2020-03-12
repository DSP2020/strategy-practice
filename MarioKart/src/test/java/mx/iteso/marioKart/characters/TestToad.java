package mx.iteso.marioKart.characters;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestToad {
    Toad toad;

    @Before
    public void setUp(){
        toad = new Toad();
    }

    @Test
    public void getCurrentVelocity(){
        assertEquals(55,toad.getCurrentVelocity(),0);
    }

}
