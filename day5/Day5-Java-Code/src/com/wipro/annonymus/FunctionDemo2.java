package com.wipro.annonymus;

import java.util.function.Function;

public class FunctionDemo2 {

	public static void main(String[] args) {

	Function<Double, Integer> getFraction = num -> (int) ((num - Math.floor(num)) * 100);

		double num = 1156.56;
	    int result = getFraction.apply(num);

	    System.out.println(result); 
	}

}
