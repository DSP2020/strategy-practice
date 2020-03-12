package acceleration;

import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import item.Item;
import item.Moneda;

@SuppressWarnings("deprecation")
@RunWith(MockitoJUnitRunner.class)
public class AccelerationNormalTest {
	Acceleration ac;
	Item i;
	
	@Before
	public void setUp() {
		this.ac = new Normal();
		this.i = new Moneda();
	}
	
	@Test
	public void testSet() {
		ac.setAcceleration(20);
		assertEquals(20, ac.getAcceleration());
	}
	
	@Test
	public void testBasicAcceleration() {
		for(int i = 0; i < 10; i++) {
			ac.basicAcceleration();
		}
		
		assertEquals(30, ac.getAcceleration());
	}
	
	@Test
	public void testAcceleration() {
		ac.setAcceleration(114);
		ac.itemAcceleration(i);
		assertEquals(118, ac.getAcceleration());
	}
}
