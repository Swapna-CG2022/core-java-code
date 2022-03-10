package com.cg.java8features.methodreferenceexample;

public class MethodReferenceExample {

public static void main(String[] args) {
		/**
		 * Following line will copy the code of printMessage() method
		 * to showMessage() method of Message interface
		 */
		Message msg = ThoughtOfTheDay::printMessage;
		msg.showMessage();
	}

}
