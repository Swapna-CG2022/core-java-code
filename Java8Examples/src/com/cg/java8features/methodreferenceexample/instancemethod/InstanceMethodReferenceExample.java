package com.cg.java8features.methodreferenceexample.instancemethod;

import com.cg.java8features.withoutanonymousclsexample.Addition;

public class InstanceMethodReferenceExample {

	public static void main(String[] args) {
		EpsonPrinter ep = new EpsonPrinter();
		Printer pr = ep::printUsingEpson;
		pr.printData();
		
		Addition ad = new Addition();
		Printer prAdd = ad :: add;
		prAdd.printData();

	}

}
