package com.javapractice;

public class SwapNumber {
    private int NumberOne;
    private int NumberTwo;


    public SwapNumber(int numberOne, int numberTwo) {
        NumberOne = numberOne;
        NumberTwo = numberTwo;
    }

    public int getNumberOne() {
        return NumberOne;
    }

    public void setNumberOne(int numberOne) {
        NumberOne = numberOne;
    }

    public int getNumberTwo() {
        return NumberTwo;
    }

    public void setNumberTwo(int numberTwo) {
        NumberTwo = numberTwo;
    }

    public void doSwapNumbers() {
        int TempVar = this.getNumberOne() + this.getNumberTwo();
        this.setNumberOne(TempVar - this.getNumberOne());
        this.setNumberTwo(TempVar - this.getNumberOne());
    }
}
