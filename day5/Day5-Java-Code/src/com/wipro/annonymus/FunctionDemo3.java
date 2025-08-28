package com.wipro.annonymus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo3 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Jayanta", "Amit", "Vasu");

        
        Function<String, Integer> slf = s -> s.length();

        List<Integer> lengths = new ArrayList<>();

        for (String name : names) {
            int length = slf.apply(name);
            lengths.add(length);
        }

        System.out.println(lengths); 
	}

}
