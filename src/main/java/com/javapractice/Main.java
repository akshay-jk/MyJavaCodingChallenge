package com.javapractice;

public class Main {
    public static void main(String[] args) {
        //Program to find the largest number among the given three
        int LargestNumber = largestFromThree(4, 5, 3);
        System.out.println("The largest among three is " + LargestNumber);
    }

    public static int largestFromThree(int a, int b, int c) {
        if (a > b) {
            if (a > c) return a;
            else return c;
        } else {
            if (b > c) return b;
            else return c;
        }
    }
}