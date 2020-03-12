package mx.iteso.mariokart.behaviors.impl;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class VeryFastTest {
	
	VeryFast veryFastAcceleration;
	
	@Before
	public void setUp() {
		veryFastAcceleration = new VeryFast();
	}
	
	@Test
	public void testVeryFast() {
		assertEquals("Your velocity is very fast, bro", veryFastAcceleration.setAcceleration());
	}
}