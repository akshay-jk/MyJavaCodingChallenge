package com.javapractice;

public class ComplexNumber {
    int RealNumber;
    int ImaginaryNumber;


    public ComplexNumber(int realNumber, int imaginaryNumber) {
        RealNumber = realNumber;
        ImaginaryNumber = imaginaryNumber;
    }

    public int getRealNumber() {
        return this.RealNumber;
    }

    public void setRealNumber(int realNumber) {
        this.RealNumber = realNumber;
    }

    public int getImaginaryNumber() {
        return this.ImaginaryNumber;
    }

    public void setImaginaryNumber(int imaginaryNumber) {
        this.ImaginaryNumber = imaginaryNumber;
    }

    public void addRealPart(int RealNumber) {
        this.RealNumber += RealNumber;
    }

    public void addImaginaryPart(int ImaginaryNumber) {
        this.ImaginaryNumber += ImaginaryNumber;
    }

    public void printDetails() {
        System.out.println("The resultant complex number is " + this.getRealNumber() + " + " + this.getImaginaryNumber() + "i");
    }


}
