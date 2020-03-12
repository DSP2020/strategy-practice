package mx.iteso.ut;

//import mx.
import mx.mx.iteso.mariokart.Item;
import mx.mx.iteso.mariokart.behaviors.impl.DerrapeGP;
import mx.mx.iteso.mariokart.items.Moneda;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDerrapeGP {
    DerrapeGP gran;

    /*
    * Prueba realizada con datos de BabyLuigi y Moneda
    * */
    @Test
    public void Testderrape(int coefderrape, int acelTop, Item objeto, int curracel) {
        assertEquals("Derrape Grand Prix a : 4 de unidades de aceleración!!!"
                ,gran.derrape(1,7,new Moneda(),3));
    }

}

