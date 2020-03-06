package test;

import characters.Bowser;
import characters.Luigi;
import characters.Mario;

public class Test {

	public static void main(String[] args) {
		Luigi luigi = new Luigi();
		luigi.startRunning();
		
		Mario mario = new Mario();
		mario.startRunning();
	
		Bowser bowser = new Bowser();
		bowser.startRunning();
	}

}
