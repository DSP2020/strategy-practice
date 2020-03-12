package mx.iteso.behaviors.impl.drift;

import mx.iteso.behaviors.Drift;

public class NormalDrift implements Drift {
    /**
     * @return string of a normal drift;
     */
    @Override
    public String drift() {
        return "Normal drift";
    }
}
