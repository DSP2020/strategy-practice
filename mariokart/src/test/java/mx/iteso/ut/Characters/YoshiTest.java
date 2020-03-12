/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.iteso.ut.Characters;
import mx.iteso.mariokart.characters.*;
import mx.iteso.mariokart.items.*;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author coque
 */
public class YoshiTest {
    Yoshi yoshi;
    Mushroom mushroom;
    Lightning lightning;
    BulletBill bulletBill;

    @Before
    public void setUp(){
        yoshi = new Yoshi();
        mushroom = new Mushroom();
        lightning = new Lightning();
        bulletBill = new BulletBill();
    }

    @Test
    public void testGetName(){
        assertEquals("Yoshi",yoshi.getName());
    } 
    
    @Test
    public void testAccelerationMushroom(){
        assertEquals("Very Fast Aceleration",yoshi.alterAcceleration(mushroom));
    }
    @Test
    public void testAccelerationLighting(){
        assertEquals("Very Slow Aceleration",yoshi.alterAcceleration(lightning));
    }
    @Test
    public void testAccelerationBullet(){
        assertEquals("Very Fast Aceleration",yoshi.alterAcceleration(bulletBill));
    }
    
    @Test
    public void testDriftingMushroom(){
        assertEquals("Wide Drifting",yoshi.alterDrifting(mushroom));
    }
    @Test
    public void testDriftingLighting(){
        assertEquals("Limited Drifting",yoshi.alterDrifting(lightning));
    }
    @Test
    public void testDriftingBullet(){
        assertEquals("Limited Drifting",yoshi.alterDrifting(bulletBill));
    }
}
