package com.cg.oopsinjava.accessspecifiersdemo;

import com.cg.oopsinjava.accessspecifiers.Sample;

public class AccessProtectedMember extends Sample {
	
	public void readProtectedDataFromSampleClass() {
		//protected data member accessed in different package sub class
		result = 567899;
		thoughtOfTheDay();
	}

}
