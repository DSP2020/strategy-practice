package mx.iteso.mariokart.behaviors.impl;

import mx.iteso.mariokart.behaviors.Acceleration;

public class SoFast implements Acceleration {

	@Override
	public String setAcceleration() {
		return "Your velocity is very so fast, bro";
	}
}
