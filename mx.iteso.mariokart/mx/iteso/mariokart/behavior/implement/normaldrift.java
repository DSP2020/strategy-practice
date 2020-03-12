package mx.iteso.mariokart.behavior.implement;

import mx.iteso.mariokart.behavior.Drift;

public class normaldrift implements Drift{
	@Override
	public void drifting() {
		System.out.println("Buen drift!");
	}
}
