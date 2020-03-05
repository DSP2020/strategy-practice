package mx.iteso.mariokart.behaviors.impl;

import mx.iteso.mariokart.behaviors.Acceleration;

public class VeryFast implements Acceleration {

	@Override
	public String setAcceleration() {
		return "Your velocity is very fast, bro";
	}
}
