package com.wipro.anonymus.test;

import com.wipro.annonymus.BankOps;

public class AnnonymusTest {

	public static void main(String[] args) {


		BankOps savings = new BankOps( ) {
			
			@override
			public void deposit(double amount) {

				System.out.println("Deposited amount: " + amount);
				
			}
			
		};
		savings.deposit(5000.00);
		
		BankOps current = new BankOps() {
			
            @Override
            public void deposit(double amount) {
                System.out.println("Deposited amount: " + amount);
            }
        };
        
        current.deposit(10000.00);
	}

}
