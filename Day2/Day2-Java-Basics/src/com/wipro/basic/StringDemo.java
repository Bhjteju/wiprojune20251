package com.wipro.basic;

import java.util.Arrays;

public class StringDemo {

	    public static void main(String[] args) {
	        
//	        String[] words = {"Madam", "Rotor", "Hello"};
//
//	        for (int w = 0; w < words.length; w++) {
//	            String word = words[w];
//	            word = word.toLowerCase();  
//	            boolean isPalindrome = true;
//
//	            for (int i = 0; i < word.length() / 2; i++) {
//	                if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
//	                    isPalindrome = false;
//	                    break;
//	                }
//	            }
//
//	            if (isPalindrome) {
//	                System.out.println(words[w] + " is a palindrome.");
//	            } else {
//	                System.out.println(words[w] + " is not a palindrome.");
//	            }
//	    	}

//>>>>>>>>>>>Ex:- 19 using string builder >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	    	    
	    	        
//	    	String[] words = {"Madam", "Rotor", "Hello"};
//
//	    		for (String word : words) {
//	    			String original = word.toLowerCase();
//	    	        String sb = new StringBuilder(original).reverse().toString();
//
//	    	        if (original.equals(sb)) {
//	    	        	System.out.println(word + " is a palindrome.");
//	    	        } else {
//	    	        	System.out.println(word + " is not a palindrome.");
//	    	        }
//	    		}   
	    		
//>>>>>>>>>>>Ex:- 20 Anagrams >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	    
	    	        
//	    	        String str1 = "listen";
//	    	        String str2 = "silent";
//
//	    	        
//	    	        str1 = str1.toLowerCase();
//	    	        str2 = str2.toLowerCase();
//
//	    	        
//	    	        char[] arr1 = str1.toCharArray();
//	    	        char[] arr2 = str2.toCharArray();
//
//	    	            
//	    	         Arrays.sort(arr1);
//	    	         Arrays.sort(arr2);
//
//	    	            
//	    	         if (Arrays.equals(arr1, arr2)) {
//	    	        	 System.out.println(str1 + " and " + str2 + " are anagrams.");
//	    	         } else {
//	    	             System.out.println(str1 + " and " + str2 + " are not anagrams.");
//	    	         }
//	    	     }
	    	
	    
//>>>>>>>>>>>Ex:- 21 Count Vowels And Consonants >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	    	
//	    	String  input = "Welcome to Wipro NGA Pre Skilling Training";
//	        input = input.toLowerCase();  
//
//	        int vowels = 0;
//	        int consonants = 0;
//
//	        for (int i = 0; i < input.length(); i++) {
//	            char ch = input.charAt(i);
//
//	            if (ch >= 'a' && ch <= 'z') { 
//	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//	                    vowels++;
//	                } else {
//	                    consonants++;
//	                }
//	            }
//	        }
//
//	        System.out.println("Input: " + input);
//	        System.out.println("Number of vowels: " + vowels);
//	        System.out.println("Number of consonants: " + consonants);

	        
//>>>>>>>>>>>Ex:- 21 Count Vowels And Consonants >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>	        
	        
	        String sentence = "An anagram is a word or phrase formed by rearranging the letters of a different word or phrase";

	        
	        //sentence = sentence.replaceAll("[^a-zA-Z ]", "");

	        String[] words = sentence.split(" "); 
	        String shortest = words[0];

	        for (int i = 1; i < words.length; i++) {
	            if (words[i].length() < shortest.length()) {
	                shortest = words[i];
	            }
	        }

	        System.out.println("Sentence: " + sentence);
	        System.out.println("Shortest Word: " + shortest);
	    }
	    
}
