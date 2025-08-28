package com.wipro.basic;

public class orAndPractice {

	public static void main(String[] args) {
		
//		float number = 0;
//		
//		if(number > 0) {
//			System.out.println("Positive");
//		}
//		else if(number < 0) {
//			System.out.println("Negative");
//		}
//		else {
//			System.out.println("Zero");
//		}
		
		double number = -0.5;
		if (number == 0) {
            System.out.println("Zero");
		}
		else if (number > 0) {
                System.out.print("Positive number");
            } 
		else {
                System.out.print("Negative number");
            }

    
         double absValue = Math.abs(number);
            if (absValue < 1) {
                System.out.print(" and small");
            } else if (absValue > 1000000) {
                System.out.print(" and large");
            }
	

	}

}
