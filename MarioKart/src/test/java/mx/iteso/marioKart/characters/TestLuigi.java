package mx.iteso.marioKart.characters;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestLuigi {
    Luigi luigi;

    @Before
    public void setUp(){
        luigi = new Luigi();
    }

    @Test
    public void getCurrentVelocity(){
        assertEquals(170,luigi.getCurrentVelocity(),0);
    }

}
