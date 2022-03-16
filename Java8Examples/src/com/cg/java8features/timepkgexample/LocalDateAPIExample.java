package com.cg.java8features.timepkgexample;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateAPIExample {
	public static void main(String[] args) {
		 LocalDate date = LocalDate.now();
		 System.out.println("Today = " + date);
		 LocalDate aWeekLater = date.plusDays(7);
		 System.out.println("A Week Later = " + aWeekLater);
		 LocalDate aWeekBefore = date.minusDays(7);
		 System.out.println("A Week Before = " + aWeekBefore);
		 System.out.println("A month Before = " + date.minusMonths(2));
		 System.out.println("Leap Year or Not = " + date.isLeapYear());
		 LocalDate repulicDay = LocalDate.of(1953,1,26);
		 System.out.println("repulicDay = " + repulicDay);
		 String dob = "2002-08-01";
		 LocalDate ldob = LocalDate.parse(dob);
		 System.out.println("dob = " +  ldob);
		 String ldobFormat = ldob.format(DateTimeFormatter.ISO_DATE);
		 System.out.println("Formated Date = " +  ldobFormat);
		 System.out.println("Year = " + date.getYear());
		 System.out.println("Month = " + date.getMonth());
		 System.out.println("WeekDay = " + date.getDayOfWeek());
		 System.out.println("Date = " + date.getDayOfYear());
		 System.out.println("Date = " + date.getDayOfMonth());
		 if(repulicDay.isBefore(ldob)) {
			 System.out.println("republicDay is before ldob ....");
		 }else {
			 System.out.println("republicDay is not before ldob....");
		 }
	}
}
