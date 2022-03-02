package com.cg.oopsinjava.accessspecifiers;

public class SampleNonSubClass {
	
	Sample sm = new Sample();
	
	public void methodToAccessProtectedMembersOfSampleClassUsingNonSubClass() {
		//protected data member accessed in same package non - sub class
		sm.result = 789;
		System.out.println(sm.result);
		sm.thoughtOfTheDay();
	}

}
