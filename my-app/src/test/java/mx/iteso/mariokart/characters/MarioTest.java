package mx.iteso.mariokart.characters;

import org.junit.Test;

import mx.iteso.mariokart.Item;
import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.impl.Fast;
import mx.iteso.mariokart.behaviors.impl.Normal;
import mx.iteso.mariokart.items.Shroom;

import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class MarioTest {
	Mario mario;
	Acceleration mockedAcceleration;
	Acceleration mockedFastAcc;
	Item mockedItem;
	
	@Before
	public void setUp() {
		mario = new Mario();
		mockedAcceleration = mock(Normal.class);
		mockedFastAcc = mock(Fast.class);
		mockedItem = mock(Shroom.class);
		mario.setAcceleration(mockedAcceleration);
	}
	
	@Test
	public void testGetAcceleration() {
		when(mockedAcceleration.accelerate()).thenReturn("Normal speed");
		assertEquals("Normal speed", mario.getAcceleration().accelerate());
	}
	
	@Test
	public void testSetAcceleration() {
		when(mockedFastAcc.accelerate()).thenReturn("Fast speed");
		mario.setAcceleration(mockedFastAcc);
		assertEquals("Fast speed", mario.getAcceleration().accelerate());
	}
	
	@Test
	public void testActiveItem() {
		doCallRealMethod().when(mockedItem).itemEffect(mario);
		mario.activeItem(mockedItem);
		assertEquals("Very fast speed", mario.getAcceleration().accelerate());
	}
}
