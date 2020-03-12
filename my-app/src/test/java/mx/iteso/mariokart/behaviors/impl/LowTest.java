package mx.iteso.mariokart.behaviors.impl;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class LowTest {
	
	Low lowAcceleration;
	
	@Before
	public void setUp() {
		lowAcceleration = new Low();
	}
	
	@Test
	public void testLow() {
		assertEquals("Your velocity is low, bro", lowAcceleration.setAcceleration());
	}
}