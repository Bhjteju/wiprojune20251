package com.wipro.anonymus.test;

import com.wipro.annonymus.Greet;

public class LamdaTest {

	public static void main(String[] args) {
		
		Greet greet = () -> System.out.println("Hello Lambda");
        
        greet.sayHello();
	}

}
