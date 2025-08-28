package com.wipro.anonymus.test;

import com.wipro.annonymus.Multiply;

public class MultiplyTest {

	public static void main(String[] args) {
		
		
		Multiply mul = (a, b) -> { return a * b; } ;
        
        
        int result = mul.multiply(5, 3);
        System.out.println("Multiplication result: " + result);
	}

}
