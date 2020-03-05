package mx.iteso.mariokart.behaviors.impl;

import mx.iteso.mariokart.behaviors.Acceleration;

public class VerySlow implements Acceleration {

	@Override
	public String accelerate() {
		return "Very slow speed";
	}

}
