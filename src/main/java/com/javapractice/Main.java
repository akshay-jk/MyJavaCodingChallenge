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

        SelectionSort(Arr);
    }

    public static void SelectionSort(int[] Arr) {
        int indexPointer = 0;
        for (int i = 0; i < Arr.length; i++) {
            int smallestIntegerIndex = i;
            for (int j = indexPointer; j < Arr.length; j++) {
                if (Arr[j] < Arr[smallestIntegerIndex]) {
                    smallestIntegerIndex = j;
                }
            }

            if (smallestIntegerIndex != indexPointer) {
                Arr[indexPointer] = Arr[indexPointer] + Arr[smallestIntegerIndex];
                Arr[smallestIntegerIndex] = Arr[indexPointer] - Arr[smallestIntegerIndex];
                Arr[indexPointer] = Arr[indexPointer] - Arr[smallestIntegerIndex];
            }

            indexPointer += 1;
        }

        System.out.println(Arrays.toString(Arr));
    }
}