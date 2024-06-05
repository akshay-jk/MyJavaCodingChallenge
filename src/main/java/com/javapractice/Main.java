package com.javapractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Inp = new Scanner(System.in);
        System.out.print("Enter the text\t");

        //Obtaining text from user
        String UserInput = Inp.nextLine();

        //Obtaining the result using normal function call
        System.out.println("The entered text is " + (isPalindrome(UserInput) ? "a" : "not a") + " palindrome");

    }

    public static boolean isPalindrome(String Str) {
        String InpCleaned = Str.replace(" ", "");
        String InpReveresed = "";
        for (int i = InpCleaned.length() - 1; i > -1; --i) {
            InpReveresed = InpReveresed + InpCleaned.charAt(i);
        }

        if (InpCleaned.equals(InpReveresed)) return true;
        return false;
    }
}