package com.javapractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Inp = new Scanner(System.in);

        System.out.print("Enter the limit\t");
        int limit = Inp.nextInt();

        doPrintNaturalNumbers(limit);
    }

    public static void doPrintNaturalNumbers(int limit) {
        if (limit > 1)
            doPrintNaturalNumbers(limit - 1);
        System.out.println(limit);
    }
}