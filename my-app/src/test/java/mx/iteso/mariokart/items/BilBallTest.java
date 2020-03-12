package mx.iteso.mariokart.items;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class BilBallTest {
	BilBall bilBall;
	
	@Before
	public void setUp() {
		bilBall = new BilBall();
		bilBall.setTiempo(8);
	}
	
	@Test
	public void testGetTime() {
		assertEquals(8, bilBall.getTiempo());
	}
	
	@Test
	public void testSetTime() {
		bilBall.setTiempo(10);
		assertEquals(10, bilBall.getTiempo());
	}
}
