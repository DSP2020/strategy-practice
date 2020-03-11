package mx.iteso.mariokart.items;

import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;

public class BoltTest {
	Bolt bolt;
	
	@Before
	public void setUp() {
		bolt = new Bolt();
		bolt.setDuration(10);
	}
	
	@Test
	public void testGetDuration() {
		assertEquals(10, bolt.getDuration());
	}
	
	@Test
	public void testSetDuration() {
		bolt.setDuration(5);
		assertEquals(5, bolt.getDuration());
	}
}
