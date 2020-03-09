package mx.iteso.mariokart.characters;

import org.junit.Test;

import mx.iteso.mariokart.items.Mushroom;

import org.junit.Before;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class DonkeyKongTest {
    DonkeyKong donkeyKong;
    Mushroom mushroom;

    @Before
    public void setup() {
        donkeyKong = new DonkeyKong();
        mushroom = new Mushroom();
    }

    @Test
    public void accelerateTest() {
        assertEquals("Broom", donkeyKong.accelerate());
    }

    @Test
    public void driftTest() {
        assertEquals("Fast drift", donkeyKong.drift());
    }

    @Test
    public void itemTest() {
        donkeyKong.setCurrentItem(mushroom);

        List<String> outList = new ArrayList<>();

        for(int i = 0; i < mushroom.getDuration(); i++) {
            outList.add("Broom broom broom broom");
        }

        assertEquals(outList, donkeyKong.executeItem());
    }
}