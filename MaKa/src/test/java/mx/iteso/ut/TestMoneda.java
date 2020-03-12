package mx.iteso.ut;

import mx.mx.iteso.mariokart.items.Moneda;
import mx.mx.iteso.mariokart.items.Rayo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestMoneda {

    Moneda coin;

    @Test
    public void TestsetEfectAcel(int nefectAcel) {
        coin.setEfectAcel(1);
        assertEquals(1,coin.getEfectAcel());
    }

    @Test
    public void TestsetTiemAcel(int ntiemAcel) {
        coin.setTiemAcel(1);
        assertEquals(1,coin.getTiemAcel());

    }

}
