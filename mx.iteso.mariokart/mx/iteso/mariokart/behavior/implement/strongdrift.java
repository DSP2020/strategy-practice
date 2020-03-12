package mx.iteso.mariokart.behavior.implement;

import mx.iteso.mariokart.behavior.Drift;

public class strongdrift implements Drift{
	@Override
	public void drifting() {
		System.out.println("Cuidado te sales de la pista!");
	}
}
