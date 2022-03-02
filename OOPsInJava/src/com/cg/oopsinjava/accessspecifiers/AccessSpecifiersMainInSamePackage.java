package com.cg.oopsinjava.accessspecifiers;

public class AccessSpecifiersMainInSamePackage {
	
	public static void main(String[] args) {
		SampleSubClass sm = new SampleSubClass();
		sm.value = 45;
		sm.display();
		
		sm.result =67;
		sm.methodToAccessProtectedMembersOfSampleClass();
		
	}

}
