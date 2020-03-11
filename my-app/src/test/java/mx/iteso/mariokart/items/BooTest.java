package mx.iteso.mariokart.items;

import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;

public class BooTest {
	Boo boo;
	
	@Before
	public void setUp() {
		boo = new Boo();
		boo.setDuration(10);
	}
	
	@Test
	public void testGetDuration() {
		assertEquals(10, boo.getDuration());
	}
	
	@Test
	public void testSetDuration() {
		boo.setDuration(5);
		assertEquals(5, boo.getDuration());
	}
}
