package drifting;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import acceleration.Acceleration;
import acceleration.Fast;
import characters.Bowser;

@SuppressWarnings("deprecation")
@RunWith(MockitoJUnitRunner.class)
public class DriftingNormalTest {
	Acceleration ac;
	Drifting d;
	Bowser c;
	
	@Before
	public void setUp() {
		this.ac = new Fast();
		d = new Normal();
		c = mock(Bowser.class);
	}
	
	@Test
	public void testSet() {
		ac.setAcceleration(20);
		d.drift(c);
		assertEquals(13, ac.getAcceleration());
	}
}
