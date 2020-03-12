package drifting;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;

import acceleration.Acceleration;
import acceleration.Fast;
import characters.Luigi;

public class DriftingLowTest {
	Acceleration ac;
	Drifting d;
	Luigi c;
	
	@Before
	public void setUp() {
		this.ac = new Fast();
		d = new Low();
		c = mock(Luigi.class);
	}
	
	@Test
	public void testSet() {
		ac.setAcceleration(40);
		d.drift(c);
		assertEquals(37, ac.getAcceleration());
	}
}
