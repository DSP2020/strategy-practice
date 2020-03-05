package mx.iteso.mariokart.behaviors.impl;

import mx.iteso.mariokart.behaviors.Acceleration;

public class Fast implements Acceleration{

	@Override
	public String accelerate() {
		return "Fast speed";
	}

}
