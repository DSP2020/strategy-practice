package mx.iteso.mariokart.behaviors.impl;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class BadDriftTest {
	BadDrift badDrift;
	
	@Before
	public void setUp() {
		badDrift = new BadDrift();
	}
	
	@Test
	public void testnormalDrift() {
		assertEquals("This is a bad drift", badDrift.drift());
	}
}

