package com.cg.oopsinjava.typesofcoupling.loosecoupling;

public class LooseCouplingExample {

	public static void main(String[] args) {
		Traveler t  = new Traveler();
		t.setV(new Flight()); 
		t.startJourney();

	}

}
