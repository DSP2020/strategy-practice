package mx.iteso.mariokart.behaviors.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class GoodDriftTest {
	GoodDrift goodDrift;
	
	@Before
	public void setUp() {
		goodDrift = new GoodDrift();
	}
	
	@Test
	public void testnormalDrift() {
		assertEquals("This is a good drift", goodDrift.drift());
	}
}
