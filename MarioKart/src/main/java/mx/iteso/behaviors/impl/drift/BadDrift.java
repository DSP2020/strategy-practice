package mx.iteso.behaviors.impl.drift;

import mx.iteso.behaviors.Drift;

public class BadDrift implements Drift {
    /**
     * @return string of a bad drift;
     */
    @Override
    public String drift() {
        return "Bad drift";
    }
}
