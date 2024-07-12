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

        BubbleSort(Arr);
    }

    public static void BubbleSort(int[] Arr) {
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr.length - 1; j++) {
                if (Arr[j] > Arr[j + 1]) {
                    Arr[j] = Arr[j] + Arr[j + 1];
                    Arr[j + 1] = Arr[j] - Arr[j + 1];
                    Arr[j] = Arr[j] - Arr[j + 1];
                }
            }
//            System.out.println(Arrays.toString(Arr));
        }
        System.out.println(Arrays.toString(Arr));
    }
}