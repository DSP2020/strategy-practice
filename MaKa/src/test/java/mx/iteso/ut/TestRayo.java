package mx.iteso.ut;

import mx.mx.iteso.mariokart.items.Rayo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestRayo {

    Rayo ray;

    @Test
    public void TestsetEfectAcel(int nefectAcel) {
        ray.setEfectAcel(-2);
        assertEquals(-2,ray.getEfectAcel());
    }

    @Test
    public void TestsetTiemAcel(int ntiemAcel) {
        ray.setTiemAcel(3);
        assertEquals(3,ray.getTiemAcel());

    }

}
