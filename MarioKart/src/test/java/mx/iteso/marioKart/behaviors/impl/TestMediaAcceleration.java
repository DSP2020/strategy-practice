package mx.iteso.marioKart.behaviors.impl;

import mx.iteso.marioKart.characters.Mario;
import mx.iteso.marioKart.items.Star;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestMediaAcceleration {
    MediaAcceleration mediaAcceleration;
    @Before
    public void setUp(){
        mediaAcceleration = new MediaAcceleration();
    }
    @Test
    public void acceleration(){
        assertEquals("go",mediaAcceleration.acceleration(new Mario().getCurrentVelocity(),new Star()));
    }
}

