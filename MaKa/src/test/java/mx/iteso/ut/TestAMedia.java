package mx.iteso.ut;

import mx.mx.iteso.mariokart.behaviors.impl.Media;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAMedia {

    Media media;


    @Test
    public void TestAceleNombre(int curracel) {
        assertEquals("Velocidad  3 es Media", media.aceleNombre(3));

    }
}
