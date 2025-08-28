package com.wipro.annonymus;

import java.util.function.Predicate;

public class PredicateDemo {
	
	public static void main(String[] args) {

//		Predicate<String> isPalindrome = str -> {
//          String reversed = new StringBuilder(str).reverse().toString();
//          return str.equalsIgnoreCase(reversed);
//      };
		
		Predicate<String> isPalindrome = str3 -> {
			return str3.equalsIgnoreCase(new StringBuilder(str3).reverse().toString());
		};

      
      String str1 = "madam";
      String str2 = "Srikanth";

      System.out.println(str1 + " -  is palindrome : " + isPalindrome.test(str1));
      System.out.println(str2 + " - is palindrome : " + isPalindrome.test(str2));


	}

}
