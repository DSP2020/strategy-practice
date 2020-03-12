package mx.iteso.behaviors.impl.acceleration;

import mx.iteso.behaviors.Acceleration;

public class SlowAcceleration implements Acceleration {
    /**
     * Slow acceleration.
     * @return string of acceleration;
     */
    public String accelerate() {
        return "Accelerating slowly";
    }
}
