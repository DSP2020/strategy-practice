package mx.iteso.mariokart.items;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class MushroomTest {
    Mushroom mushroom;

    @Before
    public void setup() {
        mushroom = new Mushroom();
    }

    @Test
    public void accelerateTest() {
        List<String> outList = new ArrayList<>();

        for(int i = 0; i < mushroom.getDuration(); i++) {
            outList.add("Broom broom broom broom");
        }

        assertEquals(outList, mushroom.executeItem());
    }
}