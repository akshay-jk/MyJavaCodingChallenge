package com.javapractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Inp = new Scanner(System.in);

        System.out.print("Enter the Principle Amount\t");
        //Obtaining text from user
        int PrincipleAmount = Inp.nextInt();

        System.out.print("Enter the Rate\t");
        int Rate = Inp.nextInt();

        System.out.print("Enter the Tenure\t");
        int Tenure = Inp.nextInt();

        System.out.println();

        //Obtaining the result using normal function call
        double SimpleInterest = doCalculateSimpleInterest(PrincipleAmount, Rate, Tenure);
        double CompoundInterest = doCalculateCompoundInterest(PrincipleAmount, Rate, Tenure);

        System.out.println("Simple Interest : " + SimpleInterest);
        System.out.println("Total Repayment : " + (SimpleInterest + PrincipleAmount));

        System.out.println();

        System.out.println("Compound Interest : " + CompoundInterest);
        System.out.println("Total Repayment : " + (CompoundInterest + PrincipleAmount));

    }

    // Function for Calculating Simple Interest
    public static double doCalculateSimpleInterest(int amount, double rate, int tenure) {
        return (amount * rate * tenure) / 100;
    }

    // Function for Calculating Compound Interest
    public static double doCalculateCompoundInterest(int amount, double rate, int tenure) {
        return (amount * Math.pow((1 + ((rate / 100) / 12)), (12 * tenure))) - amount;
    }
}