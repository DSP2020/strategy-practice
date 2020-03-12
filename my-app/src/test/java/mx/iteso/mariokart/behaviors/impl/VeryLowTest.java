package mx.iteso.mariokart.behaviors.impl;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class VeryLowTest {
	
	VeryLow veryLowAcceleration;
	
	@Before
	public void setUp() {
		veryLowAcceleration = new VeryLow();
	}
	
	@Test
	public void testVeryLow() {
		assertEquals("Your velocity is very low, bro", veryLowAcceleration.setAcceleration());
	}
}