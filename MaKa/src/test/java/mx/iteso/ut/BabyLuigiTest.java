package mx.iteso.ut;

import mx.mx.iteso.mariokart.Item;
import mx.mx.iteso.mariokart.character.BabyLuigi;

import mx.mx.iteso.mariokart.items.Hongo;
import mx.mx.iteso.mariokart.items.Moneda;
import mx.mx.iteso.mariokart.items.Rayo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class BabyLuigiTest {

    BabyLuigi babyluigi;

    @Test
    public void TestsetAcelInic(int nacelInic) {
        babyluigi.setAcelInic(3);
        assertEquals(3,babyluigi.getAcelInic());
    }

    @Test
    public void TestsetAcelTop(int naceltop) {
        babyluigi.setAcelTop(7);
        assertEquals(7,babyluigi.getAcelTop());
    }

    @Test
    public void TestsetCurracel(int ncurracel){
        babyluigi.setCurracel(3);
        assertEquals(3,babyluigi.getCurracel());
    }

    @Test
    public void TestsetObjetoHongo(Item nobjeto){
        babyluigi.setObjeto(new Hongo());
        assertEquals(2,babyluigi.getObjeto().getEfectAcel());
    }

    @Test
    public void TestsetObjetoMoneda(Item nobjeto){
        babyluigi.setObjeto(new Moneda());
        assertEquals(1,babyluigi.getObjeto().getEfectAcel());
    }

    @Test
    public void TestsetObjetoRayoo(Item nobjeto){
        babyluigi.setObjeto(new Rayo());
        assertEquals(-2,babyluigi.getObjeto().getEfectAcel());
    }

    @Test
    public  void TestAcelerar(){



    }
}
