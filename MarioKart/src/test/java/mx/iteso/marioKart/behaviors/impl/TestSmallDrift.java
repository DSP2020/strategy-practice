package mx.iteso.marioKart.behaviors.impl;
import mx.iteso.marioKart.characters.Luigi;
import mx.iteso.marioKart.characters.Toad;
import mx.iteso.marioKart.items.Rocket;
import mx.iteso.marioKart.items.Thunder;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestSmallDrift {
    SmallDrift smallDrift;

    @Before
    public void setUp(){
        smallDrift= new SmallDrift();
    }
    @Test
    public void drift(){
        assertEquals("stop",smallDrift.drift(new Luigi().getCurrentVelocity(),new Thunder()));
    }
}
