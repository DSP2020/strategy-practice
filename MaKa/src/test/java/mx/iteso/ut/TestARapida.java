package mx.iteso.ut;

import mx.mx.iteso.mariokart.behaviors.impl.Rapida;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestARapida {

    Rapida fast;

    @Before
    public void setUp(){
    //Link Player = mock(Link.class);
    }

    @Test
    public void TestAceleNombre(int curracel) {
        assertEquals("Velocidad  3 es Media", fast.aceleNombre(6));

    }

}
