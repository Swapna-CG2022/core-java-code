package com.cg.java8features.timepkgexample;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;

public class PeriodExample {

	public static void main(String[] args) {
		Period period = Period.ofDays(25);
		Temporal temp = period.addTo(LocalDate.now());
		System.out.println(temp);
		
		Period period1 = Period.ofYears(4);
		Period period2 = period1.plus(Period.ofMonths(2));
		System.out.println(period2);
		
		Period period3 = period1.minus(Period.ofYears(2));
		System.out.println(period3);

	}

}
