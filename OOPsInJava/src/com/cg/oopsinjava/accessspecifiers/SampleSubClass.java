package com.cg.oopsinjava.accessspecifiers;

public class SampleSubClass extends Sample {
	
	public void methodToAccessProtectedMembersOfSampleClass() {
		result = 789;
		//protected data member accessed in same package sub class
		System.out.println(result);
		thoughtOfTheDay();
	}

}
