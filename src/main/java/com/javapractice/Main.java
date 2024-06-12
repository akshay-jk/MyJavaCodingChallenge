package com.javapractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Inp = new Scanner(System.in);

        System.out.print("Enter the year\t");
        int year = Inp.nextInt();

        System.out.println(year + " is " + (checkIsLeapYear(year) ? " a" : " not a") + " leap year");

    }

    public static boolean checkIsLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}