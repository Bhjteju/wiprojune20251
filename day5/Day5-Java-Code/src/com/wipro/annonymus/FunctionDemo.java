package com.wipro.annonymus;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
				
//		Function<String,Integer> fn= s -> {return s.length(); };
//		
//		System.out.println(fn.apply("Jayanta"));
//		
//		Function<String,String> fn1= s -> {return s.toUpperCase(); };
//		System.out.println(fn1.apply("jayanta"));
//		
		
		List<Integer> numList= Arrays.asList(1,4,6,7,8,9);
		Function<List<Integer>,Integer> doSum= list->{
			int sum=0;
			for(int n:list)
			{
				sum=sum+n;
			}
			return sum;
		};
		
		int sumVal=doSum.apply(numList);
		System.out.println(sumVal);

	}

}
