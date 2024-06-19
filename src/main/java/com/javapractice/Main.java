package com.javapractice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Inp = new Scanner(System.in);

        System.out.print("Enter the limit\t");
        int limit = Inp.nextInt();

        ArrayList<Integer> FibonacciSeries = printFibonacciSeries(limit);
        System.out.println(FibonacciSeries);

    }

    public static ArrayList<Integer> printFibonacciSeries(int limit) {
        ArrayList<Integer> resultArray = new ArrayList<Integer>();
        int PreviousValue = 0, PresentValue = 1;

        while (resultArray.size() < limit) {
            if (resultArray.isEmpty()) {
                resultArray.add(PreviousValue);
                resultArray.add(PresentValue);
            } else {
                int NextValue = PreviousValue + PresentValue;
                PreviousValue = PresentValue;
                PresentValue = NextValue;
                resultArray.add(PresentValue);
            }
        }

        return resultArray;
    }
}