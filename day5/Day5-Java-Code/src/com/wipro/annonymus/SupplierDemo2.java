package com.wipro.annonymus;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class SupplierDemo2 {

	public static void main(String[] args) {

		
		String inputDate = "25-07-2025";

        
        LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        
        DayOfWeek today = date.getDayOfWeek();

        
        Supplier<String> nextDay = () -> today.plus(1).toString();

        System.out.println("Input date: " + inputDate);
        System.out.println("Today: " + today);
        System.out.println("Next day: " + nextDay.get());

	}

}
