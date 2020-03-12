package mx.iteso.marioKart.behaviors.impl;
import mx.iteso.marioKart.characters.Toad;
import mx.iteso.marioKart.items.Rocket;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestBigDrift {
    BigDrift bigDrift;
    @Before
    public void setUp(){
        bigDrift= new BigDrift();
    }
    @Test
    public void drift(){
        assertEquals("Big drifting",bigDrift.drift(new Toad().getCurrentVelocity(),new Rocket()));
    }
}
