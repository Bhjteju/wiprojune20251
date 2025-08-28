package com.wipro.basic;

public class Enum {

//	public static void main(String[] args) {
//		enum Day {
//			SUN,
//			MON,
//			TUE,
//			WED,
//			THU,
//			FRI,
//			SAT
//		}
//		
//		Day day=Day.Mon;
//		if(day==Day.Mon)
//		{
//			System.out.println("Monday");
//		}
//		
//		for(Day d:Day.values())
//		{
//			System.out.println(d);
//		}
//
//>>>>>>>>>>Ex:-17 Enum >>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// File: EnumExample.java


		enum Month {
	        JANUARY,
	        FEBRUARY,
	        MARCH,
	        APRIL,
	        MAY,
	        JUNE,
	        JULY,
	        AUGUST,
	        SEPTEMBER,
	        OCTOBER,
	        NOVEMBER,
	        DECEMBER
	    }

	    public static void main(String[] args) {
	        System.out.println("All months:");
	        for (Month m : Month.values()) {
	            System.out.println(m);
	        }

	        Month month = Month.FEBRUARY;

	        if (month == Month.FEBRUARY) {
	            System.out.println("\nThe assigned month is FEBRUARY.");
	        } else {
	            System.out.println("\nThe assigned month is NOT FEBRUARY.");
	        }
	    }
}
