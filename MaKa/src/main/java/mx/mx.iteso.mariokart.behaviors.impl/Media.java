package mx.mx.iteso.mariokart.behaviors.impl;

import mx.mx.iteso.mariokart.behaviors.Aceleración;

public class Media implements Aceleración {
    @Override
    public String AceleNombre(int curracel) {
        String Acelnom = "";

        if(curracel >2 & curracel <=4) {
            Acelnom = "Velocidad " + curracel + " es Media";
        }
        return Acelnom;
    }
}
