package com.javapractice;

import java.time.Year;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Program to get user input from command line
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter Your Name\t");
        String UserName = Sc.nextLine();
        System.out.println("You are " + UserName);

        System.out.print("Enter Your Age\t");
        int UserAge = Sc.nextInt();
        int UserBornYear = Year.now().getValue() - UserAge;
        System.out.println("You were born in " + UserBornYear);
    }
}