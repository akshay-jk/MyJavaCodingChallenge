package com.javapractice;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Inp = new Scanner(System.in);

        System.out.print("Enter the size of array\t");
        int ArrSize = Inp.nextInt();

        int[] Arr = new int[ArrSize];

        System.out.print("Enter the elements of array\t");
        for (int i = 0; i < ArrSize; i++) {
            Arr[i] = Integer.parseInt(Inp.next());
        }

        InsertionSort(Arr);
    }

    public static void InsertionSort(int[] ArrToSort) {
        for (int i = 1; i < ArrToSort.length; i++) {
            int ArrPointer = i;
            while (ArrPointer > 0) {
                if (ArrToSort[ArrPointer - 1] > ArrToSort[ArrPointer]) {
                    int SwapVariable = ArrToSort[ArrPointer];
                    ArrToSort[ArrPointer] = ArrToSort[ArrPointer - 1];
                    ArrToSort[ArrPointer - 1] = SwapVariable;
                    ArrPointer = ArrPointer - 1;
                } else {
                    break;
                }
            }
            System.out.println(Arrays.toString(ArrToSort));
        }
    }
}