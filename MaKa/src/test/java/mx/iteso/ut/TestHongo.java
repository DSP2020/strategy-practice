package mx.iteso.ut;

import mx.mx.iteso.mariokart.items.Hongo;
import mx.mx.iteso.mariokart.items.Moneda;
import mx.mx.iteso.mariokart.items.Rayo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHongo {
    Hongo Mush;

    @Test
    public void TestsetEfectAcel(int nefectAcel) {
        Mush.setEfectAcel(2);
        assertEquals(2,Mush.getEfectAcel());
    }

    @Test
    public void TestsetTiemAcel(int ntiemAcel) {
        Mush.setTiemAcel(3);
        assertEquals(3,Mush.getTiemAcel());

    }

}
