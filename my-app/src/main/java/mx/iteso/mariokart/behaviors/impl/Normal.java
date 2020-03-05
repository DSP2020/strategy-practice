package mx.iteso.mariokart.behaviors.impl;

import mx.iteso.mariokart.behaviors.Acceleration;

public class Normal implements Acceleration{

	@Override
	public String accelerate() {
		return "Normal speed";
	}
	
}
