/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.iteso.ut.Characters;
import mx.iteso.mariokart.characters.Bowser;
import mx.iteso.mariokart.items.*;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;
/**
 *
 * @author coque
 */
public class BowserTest {
    Bowser bowser;
    Mushroom mushroom;
    Lightning lightning;
    BulletBill bulletBill;

    @Before
    public void setUp(){
        bowser = new Bowser();
        mushroom = new Mushroom();
        lightning = new Lightning();
        bulletBill = new BulletBill();
    }

    @Test
    public void testGetName(){
        assertEquals("Bowser",bowser.getName());
    } 
    
    @Test
    public void testAccelerationMushroom(){
        assertEquals("Fast Aceleration",bowser.alterAcceleration(mushroom));
    }
    @Test
    public void testAccelerationLighting(){
        assertEquals("Very Slow Aceleration",bowser.alterAcceleration(lightning));
    }
    @Test
    public void testAccelerationBullet(){
        assertEquals("Very Fast Aceleration",bowser.alterAcceleration(bulletBill));
    }
    
    @Test
    public void testDriftingMushroom(){
        assertEquals("Wide Drifting",bowser.alterDrifting(mushroom));
    }
    @Test
    public void testDriftingLighting(){
        assertEquals("Limited Drifting",bowser.alterDrifting(lightning));
    }
    @Test
    public void testDriftingBullet(){
        assertEquals("Limited Drifting",bowser.alterDrifting(bulletBill));
    }

}
