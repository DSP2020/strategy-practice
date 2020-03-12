package mx.iteso.marioKart.behaviors.impl;

import mx.iteso.marioKart.characters.Mario;
import mx.iteso.marioKart.items.Star;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestMediumDrift {
    MediumDrift mediumDrift;
    @Before
    public void setUp(){
        mediumDrift= new MediumDrift();
    }
    @Test
    public void drift(){
        assertEquals("Medium drifting",mediumDrift.drift(new Mario().getCurrentVelocity(),new Star()));
    }
}
