package mx.iteso.mariokart.characters;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import mx.iteso.mariokart.Item;
import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.Drift;
import mx.iteso.mariokart.behaviors.impl.BadDrift;
import mx.iteso.mariokart.behaviors.impl.Fast;
import mx.iteso.mariokart.behaviors.impl.NormalDrift;
import mx.iteso.mariokart.behaviors.impl.VeryFast;
import mx.iteso.mariokart.items.BilBall;

public class BowserTest {
	Bowser bowser;
	Acceleration mockedAcc;
	Item mockedItem;
	Acceleration mockedIt;
	Drift mockedDri;
	Drift mockedSetDri;
	
	@Before
	public void setUp() {
		bowser = new Bowser();
		mockedAcc = mock(Fast.class);
		mockedItem = new BilBall();
		mockedIt = mock(VeryFast.class);
		bowser.setAcelerate(mockedAcc);
		mockedDri = mock(NormalDrift.class);
		mockedSetDri = mock(BadDrift.class);
		bowser.setDrift(mockedDri);
	}
	
	@Test
	public void testGetAc() {
		when(mockedAcc.setAcceleration()).thenReturn("Your velocity is low, bro");
		assertEquals("Your velocity is low, bro", bowser.getAcelerate().setAcceleration());
	}
	
	@Test
	public void testSetAc() {
		when(mockedIt.setAcceleration()).thenReturn("Your velocity is very fast, bro");
		bowser.setAcelerate(mockedIt);
		assertEquals("Your velocity is very fast, bro", bowser.getAcelerate().setAcceleration());
	}
	
	@Test
	public void testtakeEffect() {
		bowser.takeEffect(mockedItem);
		assertEquals("Your velocity is very so fast, bro", bowser.getAcelerate().setAcceleration());
		assertEquals("This is a good drift", bowser.getDrift().drift());
	}
	
	@Test
	public void testGetDr() {
		when(mockedDri.drift()).thenReturn("This is a normal drift");
		assertEquals("This is a normal drift", bowser.getDrift().drift());
	}
	
	@Test
	public void testSetDr() {
		when(mockedSetDri.drift()).thenReturn("This is a bad drift");
		bowser.setDrift(mockedSetDri);
		assertEquals("This is a bad drift", bowser.getDrift().drift());
	}	
}