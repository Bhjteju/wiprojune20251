package com.wipro.basic;

public class mathRoundFunction {
	
    public static void main(String[] args) {
//		double num = 25.586;
//		
//		System.out.println(Math.round(num));
//        
//  }
	
	double num1 = 25.586;
    double num2 = 25.589;

    
    long num3 = Math.round(num1 * 1000);
    long num4 = Math.round(num2 * 1000);

    if (num3 == num4) {
        System.out.println("They are the same");
    } else {
        System.out.println("They are different");
    }
    }
}