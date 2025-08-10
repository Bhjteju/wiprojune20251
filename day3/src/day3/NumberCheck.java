package day3;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Input a number: ");
        double number = scanner.nextDouble();

        System.out.println("Input value: " + number);

       
        if (number == 0) {
            System.out.println("zero");
        } else {
           
            if (number > 0) {
                System.out.print("positive");
            } else {
                System.out.print("negative");
            }

        
            if (Math.abs(number) < 1) {
                System.out.println(" small");
            } else if (Math.abs(number) > 1_000_000) {
                System.out.println(" large");
            } else {
                System.out.println();
            }
        }

        scanner.close();
    }
}

