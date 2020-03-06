package mx.mx.iteso.mariokart.behaviors.impl;

import mx.mx.iteso.mariokart.behaviors.Aceleración;

import java.security.acl.AclEntry;

public class Lento implements Aceleración {
    @Override
    public String AceleNombre(int curracel) {
        String Acelnom = "";

        if(curracel <=2) {
            Acelnom = "Velocidad " + curracel + " es Lenta";
        }
        return Acelnom;
    }
}
