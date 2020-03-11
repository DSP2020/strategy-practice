package mx.iteso.mariokart.items;

import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;


public class ShroomTest {
	Shroom shroom;
	
	@Before
	public void setUp() {
		shroom = new Shroom();
		shroom.setDuration(10);
	}
	
	@Test
	public void testGetDuration() {
		assertEquals(10, shroom.getDuration());
	}
	
	@Test
	public void testSetDuration() {
		shroom.setDuration(5);
		assertEquals(5, shroom.getDuration());
	}
	
}
