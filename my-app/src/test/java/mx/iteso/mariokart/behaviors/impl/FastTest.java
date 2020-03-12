package mx.iteso.mariokart.behaviors.impl;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class FastTest {
	
	Fast fastAcceleration;
	
	@Before
	public void setUp() {
		fastAcceleration = new Fast();
	}
	
	@Test
	public void testFast() {
		assertEquals("Your velocity is fast, bro", fastAcceleration.setAcceleration());
	}
}
