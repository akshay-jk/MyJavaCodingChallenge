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

        MergeSort(Arr, 0, Arr.length - 1);

        System.out.println("Array After Sorting");
        System.out.println(Arrays.toString(Arr));
    }

    public static void MergeSort(int[] UnsortedArr, int StartIndex, int EndIndex) {
        if (StartIndex < EndIndex) {
            int MidIndex = (int) Math.floor((EndIndex + StartIndex) / 2);

            MergeSort(UnsortedArr, StartIndex, MidIndex);
            MergeSort(UnsortedArr, MidIndex + 1, EndIndex);
            MergeArray(UnsortedArr, StartIndex, MidIndex, EndIndex);
        }
    }

    public static void MergeArray(int[] UnsortedArr, int StartIndex, int MidIndex, int EndIndex) {
        int FirstArrayLen = (MidIndex - StartIndex) + 1;
        int SecondArrayLen = EndIndex - MidIndex;

        int[] LeftArr = new int[FirstArrayLen];
        int[] RightArr = new int[SecondArrayLen];

        for (int x = 0; x < FirstArrayLen; x++) {
            LeftArr[x] = UnsortedArr[StartIndex + x];
        }

        for (int y = 0; y < SecondArrayLen; y++) {
            RightArr[y] = UnsortedArr[MidIndex + 1 + y];
        }

        int i = 0, j = 0, k = StartIndex;

        while (i < FirstArrayLen && j < SecondArrayLen) {
            if (LeftArr[i] <= RightArr[j]) {
                UnsortedArr[k] = LeftArr[i];
                i++;
            } else {
                UnsortedArr[k] = RightArr[j];
                j++;
            }
            k++;

        }

        while (i < FirstArrayLen) {
            UnsortedArr[k] = LeftArr[i];
            i++;
            k++;
        }

        while (j < SecondArrayLen) {
            UnsortedArr[k] = RightArr[j];
            j++;
            k++;
        }
    }
}