package mx.iteso.mariokart.items;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class RayoTest {
	Rayo rayo;
	
	@Before
	public void setUp() {
		rayo = new Rayo();
		rayo.setTiempo(4);
	}
	
	@Test
	public void testGetTime() {
		assertEquals(4, rayo.getTiempo());
	}
	
	@Test
	public void testSetTime() {
		rayo.setTiempo(12);
		assertEquals(12, rayo.getTiempo());
	}
}