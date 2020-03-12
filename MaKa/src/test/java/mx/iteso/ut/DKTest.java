package mx.iteso.ut;

import mx.mx.iteso.mariokart.Item;

import mx.mx.iteso.mariokart.character.DonkeyKong;

import mx.mx.iteso.mariokart.items.Hongo;
import mx.mx.iteso.mariokart.items.Moneda;
import mx.mx.iteso.mariokart.items.Rayo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DKTest {

    DonkeyKong DK;

    @Test
    public void TestsetAcelInic(int nacelInic) {
        DK.setAcelInic(1);
        assertEquals(1,DK.getAcelInic());
    }

    @Test
    public void TestsetAcelTop(int naceltop) {
        DK.setAcelTop(5);
        assertEquals(5,DK.getAcelTop());
    }

    @Test
    public void TestsetCurracel(int ncurracel){
        DK.setCurracel(1);
        assertEquals(1,DK.getCurracel());
    }

    @Test
    public void TestsetObjetoHongo(Item nobjeto){
        DK.setObjeto(new Hongo());
        assertEquals(2,DK.getObjeto().getEfectAcel());
    }

    @Test
    public void TestsetObjetoMoneda(Item nobjeto){
        DK.setObjeto(new Moneda());
        assertEquals(1,DK.getObjeto().getEfectAcel());
    }

    @Test
    public void TestsetObjetoRayoo(Item nobjeto){
        DK.setObjeto(new Rayo());
        assertEquals(-2,DK.getObjeto().getEfectAcel());
    }

    @Test
    public  void TestAcelerar(){



    }
}
