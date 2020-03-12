package mx.iteso.behaviors.impl.drift;

import mx.iteso.behaviors.Drift;

public class NormalDrift implements Drift {

    @Override
    public String drift() {
        return "Normal drift";
    }
}
