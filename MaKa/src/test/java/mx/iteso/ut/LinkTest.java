package mx.iteso.ut;

import mx.mx.iteso.mariokart.Item;
import mx.mx.iteso.mariokart.character.BabyLuigi;

import mx.mx.iteso.mariokart.character.Link;
import mx.mx.iteso.mariokart.items.Hongo;
import mx.mx.iteso.mariokart.items.Moneda;
import mx.mx.iteso.mariokart.items.Rayo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class LinkTest {

    Link link;

    @Test
    public void TestsetAcelInic(int nacelInic) {
        link.setAcelInic(2);
        assertEquals(2,link.getAcelInic());
    }

    @Test
    public void TestsetAcelTop(int naceltop) {
        link.setAcelTop(6);
        assertEquals(6,link.getAcelTop());
    }

    @Test
    public void TestsetCurracel(int ncurracel){
        link.setCurracel(2);
        assertEquals(2,link.getCurracel());
    }

    @Test
    public void TestsetObjetoHongo(Item nobjeto){
        link.setObjeto(new Hongo());
        assertEquals(2,link.getObjeto().getEfectAcel());
    }

    @Test
    public void TestsetObjetoMoneda(Item nobjeto){
        link.setObjeto(new Moneda());
        assertEquals(1,link.getObjeto().getEfectAcel());
    }

    @Test
    public void TestsetObjetoRayoo(Item nobjeto){
        link.setObjeto(new Rayo());
        assertEquals(-2,link.getObjeto().getEfectAcel());
    }

    @Test
    public  void TestAcelerar(){



    }

}
