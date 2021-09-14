/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Drew Butler
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the principal: ");
        int principal= myObj.nextInt();

        System.out.println("Enter the rate of intrest: ");
        double rateInterest = myObj.nextDouble();

        System.out.println("Enter the number of years: ");
        int years = myObj.nextInt();
        double  percentage = rateInterest / 100;
        double total = principal * (1 + percentage * years);

        System.out.printf("After %d years at %.1f%%, the inverstment will be worth $%.2f", years, rateInterest, total);

        myObj.close();
    }
}