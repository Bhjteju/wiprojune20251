package com.wipro.annonymus;

import java.time.DayOfWeek;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		
//		Supplier<String> tomorrow = () -> LocalDate.now().plusDays(1).getDayOfWeek().toString();
//
//      System.out.println("Tomorrow is: " + tomorrow.get());
		
		
		String inputDay = "friday";  
        
        DayOfWeek today = DayOfWeek.valueOf(inputDay.toUpperCase());

       
        Supplier<String> nextDay = () -> today.plus(1).toString();

        System.out.println("Next day: " + nextDay.get());
    }

}
