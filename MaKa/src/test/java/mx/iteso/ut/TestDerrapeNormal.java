package mx.iteso.ut;

import mx.mx.iteso.mariokart.Item;
import mx.mx.iteso.mariokart.behaviors.impl.DerrapeNormal;
import mx.mx.iteso.mariokart.items.Moneda;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDerrapeNormal {
    DerrapeNormal gran;

    /*
     * Prueba realizada con datos de BabyLuigi y Moneda
     * */
    @Test
    public void Testderrape(int coefderrape, int acelTop, Item objeto, int curracel) {
        assertEquals("Derrape a : 4 de unidades de aceleración!"
                ,gran.derrape(1,7,new Moneda(),3));
    }
}
