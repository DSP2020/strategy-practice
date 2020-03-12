package acceleration;

import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import item.Estrella;
import item.Item;

@SuppressWarnings("deprecation")
@RunWith(MockitoJUnitRunner.class)
public class AccelerationFastTest {
	Acceleration ac;
	Item i;
	
	@Before
	public void setUp() {
		this.ac = new Fast();
		i = new Estrella();
	}
	
	@Test
	public void testSet() {
		ac.setAcceleration(10);
		assertEquals(10, ac.getAcceleration());
	}
	
	@Test
	public void testBasicAcceleration() {
		for(int i = 0; i < 10; i++) {
			ac.basicAcceleration();
		}
		
		assertEquals(50, ac.getAcceleration());
	}
	
	@Test
	public void testAcceleration() {
		ac.setAcceleration(10);
		ac.itemAcceleration(i);
		assertEquals(10, ac.getAcceleration());
	}
}
