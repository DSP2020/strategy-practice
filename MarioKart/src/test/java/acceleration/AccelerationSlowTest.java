package acceleration;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import item.Champinon;
import item.Item;

public class AccelerationSlowTest {
	Acceleration ac;
	Item i;
	
	@Before
	public void setUp() {
		this.ac = new Slow();
		this.i = new Champinon();
	}
	
	@Test
	public void testSet() {
		ac.setAcceleration(51);
		assertEquals(51, ac.getAcceleration());
	}
	
	@Test
	public void testBasicAcceleration() {
		for(int i = 0; i < 10; i++) {
			ac.basicAcceleration();
		}
		
		assertEquals(10, ac.getAcceleration());
	}
	
	@Test
	public void testAcceleration() {
		ac.setAcceleration(14);
		ac.itemAcceleration(i);
		assertEquals(11, ac.getAcceleration());
	}
}
