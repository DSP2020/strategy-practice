package mx.iteso.mariokart.behaviors.impl;

import mx.iteso.mariokart.behaviors.Acceleration;

public class Slow implements Acceleration {

	@Override
	public String accelerate() {
		return "Slow speed";
	}

}
