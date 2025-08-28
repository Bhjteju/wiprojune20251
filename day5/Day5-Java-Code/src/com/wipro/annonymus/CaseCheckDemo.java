package com.wipro.annonymus;

import java.util.function.Predicate;

public class CaseCheckDemo {

	public static void main(String[] args) {
		
		Predicate<String> isUpperCase = str -> str.equals(str.toUpperCase());
        Predicate<String> isLowerCase = str -> str.equals(str.toLowerCase());

        String str1 = "SRIKANTH";
        String str2 = "srikanth";

        System.out.println(str1 + " - is uppercase: " + isUpperCase.test(str1));
        System.out.println(str2 + " - is lowercase: " + isLowerCase.test(str2));

	}

}
