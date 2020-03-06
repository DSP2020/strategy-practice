package mx.mx.iteso.mariokart.behaviors.impl;

import mx.mx.iteso.mariokart.behaviors.Aceleración;

public class Rápida implements Aceleración {
    @Override
    public String AceleNombre(int curracel) {
        String Acelnom = "";

        if(curracel >4) {
            Acelnom = "Velocidad " + curracel + " es Rápida!";
        }
        return Acelnom;
    }
}
