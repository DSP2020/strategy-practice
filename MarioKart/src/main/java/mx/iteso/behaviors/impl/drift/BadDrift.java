package mx.iteso.behaviors.impl.drift;

import mx.iteso.behaviors.Drift;

public class BadDrift implements Drift {

    @Override
    public String drift() {
        return "Bad drift";
    }
}
