package mx.iteso.marioKart;

import mx.iteso.marioKart.characters.Browser;
import mx.iteso.marioKart.items.Mushroom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class BrowserTest {
    Browser browser;

    @Before
    public void setUp(){
        browser = new Browser();
    }

    @Test
    public void testItemid(){
        browser.setCharacterSelector();
        assertEquals(8,browser.getCharacterSelector());
    }
    @Test
    public void testNotMoving(){
        browser.setStarMove(false);
        browser.speedUp();
        assertEquals(0,browser.getCurrentAcceleration());
    }
}
