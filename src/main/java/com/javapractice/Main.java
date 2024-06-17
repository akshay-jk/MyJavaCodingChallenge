package com.javapractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Inp = new Scanner(System.in);

        System.out.print("Enter the limit\t");
        int limit = Inp.nextInt();

        doPrintNaturalNumbersByDescOrder(limit);
    }

    public static void doPrintNaturalNumbersByDescOrder(int limit) {
        System.out.println(limit);
        if (limit > 1)
            doPrintNaturalNumbersByDescOrder(limit - 1);
    }
}