package com.javapractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Inp = new Scanner(System.in);

        System.out.print("Enter the char\t");
        char ch = Inp.next().charAt(0);

        System.out.println("Input is a " + (isVowel(ch) ? "VOWEL" : "CONSONANT"));

    }

    public static boolean isVowel(char CharInp) {
        char[] VowelArray = {'a', 'e', 'i', 'o', 'u'};
        for (char ch : VowelArray)
            if (CharInp == ch)
                return true;
        return false;
    }
}