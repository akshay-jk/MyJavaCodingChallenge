package com.javapractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Inp = new Scanner(System.in);

        // Reading length
        System.out.print("Enter the length\t");
        int length = Inp.nextInt();

        // Reading breadth
        System.out.print("Enter the breadth\t");
        int breadth = Inp.nextInt();

        // Checking type of quadrilateral
        String Quadrilateral = (length == breadth ? "Square" : "Rectangle");

        // Printing Area
        System.out.println("The Area of " + Quadrilateral + " is " + doCalculateArea(length, breadth));
        // Printing Perimeter
        System.out.println("The Perimeter of " + Quadrilateral + " is " + doCalculatePerimeter(length, breadth));
    }

    public static int doCalculatePerimeter(int length, int breadth) {
        return 2 * (length + breadth);
    }

    public static int doCalculateArea(int length, int breadth) {
        return length * breadth;
    }
}