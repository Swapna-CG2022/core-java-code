package com.cg.oopsinjava.typesofcoupling.tightcoupling;

public class Traveler {
	
	Car c = new Car();
	
	public void startJourney() {
		c.move();
	}

}
