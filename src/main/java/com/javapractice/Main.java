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

        BinarySearch(Arr, SearchKey);

    }

    public static void BinarySearch(int[] arr, int searchKey) {
        int LowerLimit = 0, UpperLimit = arr.length - 1;
        while (LowerLimit != UpperLimit) {
            int MiddleIndex = (int) Math.floor((LowerLimit + UpperLimit) / 2);
            if (searchKey == arr[MiddleIndex]) {
                System.out.println("Key present at index " + MiddleIndex);
                return;
            } else {
                if (searchKey > arr[MiddleIndex]) {
                    LowerLimit = MiddleIndex + 1;
                } else {
                    LowerLimit = UpperLimit - 1;
                }
            }
        }

        System.out.println("Key not present");
    }

}