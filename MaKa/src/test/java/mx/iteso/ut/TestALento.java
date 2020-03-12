package mx.iteso.ut;

import mx.mx.iteso.mariokart.behaviors.impl.Lento;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestALento {

    Lento lento;

    @Test
    public void TestAceleNombre(int curracel) {
        assertEquals("Velocidad  3 es Media", lento.aceleNombre(1));

    }

}
