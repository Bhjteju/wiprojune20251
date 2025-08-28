package com.wipro.basic;

public class SwitchExample {

	public static void main(String[] args) {

		String week = "tuesday";
		
		switch(week) {
		case "sunday" :
			System.out.println("Oh!!.. This is sunday");
			break;
		case "monday" :
			System.out.println("Oh!!.. This is week day");
			break;
		case "thursday" :
			System.out.println("Oh!!.. This is week day");
			break;
		case "saturday" :
			System.out.println("Oh!!.. This is weekend");
			break;
		default :
			System.out.println("Oh!!.. This is Holiday");
		}
				

	}

}
