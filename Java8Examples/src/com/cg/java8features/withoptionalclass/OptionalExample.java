package com.cg.java8features.withoptionalclass;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalExample {

	public static void main(String[] args) throws Exception {
		SpaceShip falcon = new SpaceShip();
		Optional<SpaceShip> optionalFalcon = Optional.of(falcon);
		System.out.println(optionalFalcon);
		
		SpaceShip falcon1 = new SpaceShip(new Engine(new VelocityMonitor(500)));
		Optional<SpaceShip> optionalFalcon1 = Optional.ofNullable(falcon1);
		System.out.println(optionalFalcon1);
		
		if(optionalFalcon1.isPresent()) {
			System.out.println(optionalFalcon1.get());
		}else {
			System.out.println("Object is null");
		}
		
		SpaceShip falcon11 = null;
		Optional<SpaceShip> optionalFalcon11 = Optional.ofNullable(falcon11);
		SpaceShip result = optionalFalcon11.orElseThrow(() -> new SpaceShipIsNullException("empty object"));
		System.out.println(result);
		
	}

}
