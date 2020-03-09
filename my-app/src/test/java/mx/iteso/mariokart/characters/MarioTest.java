package mx.iteso.mariokart.characters;

import org.junit.Test;

import mx.iteso.mariokart.items.Mushroom;

import org.junit.Before;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class MarioTest {
    Mario mario;
    Mushroom mushroom;

    @Before
    public void setup() {
        mario = new Mario();
        mushroom = new Mushroom();
    }

    @Test
    public void accelerateTest() {
        assertEquals("Broom broom", mario.accelerate());
    }

    @Test
    public void driftTest() {
        assertEquals("Slow drift", mario.drift());
    }

    @Test
    public void itemTest() {
        mario.setCurrentItem(mushroom);

        List<String> outList = new ArrayList<>();

        for(int i = 0; i < mushroom.getDuration(); i++) {
            outList.add("Broom broom broom broom");
        }

        assertEquals(outList, mario.executeItem());
    }
}