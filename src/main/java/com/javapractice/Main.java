package com.javapractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Inp = new Scanner(System.in);

        System.out.print("Enter the size of array\t");
        int ArrSize = Inp.nextInt();

        int[] Arr = new int[ArrSize];

        System.out.print("Enter the elements of array\t");
        for (int i = 0; i < ArrSize; i++) {
            Arr[i] = Inp.nextInt();
        }

        System.out.print("Enter the key to be searched\t");
        int SearchKey = Inp.nextInt();

        LinearSearch(Arr, SearchKey);
    }

    public static void LinearSearch(int[] Arr, int SearchKey) {
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] == SearchKey) {
                System.out.println("Element found at position " + (i + 1));
                return;
            }
        }

        System.out.println("Element not found");
    }


}