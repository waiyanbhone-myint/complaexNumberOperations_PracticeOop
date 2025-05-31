package com.ps;

public class Main {
    //  a = real part
    // b = imaginary part
    // i = symbol for square root of -1

    public static void main(String[] args) {
        ComplexNumber complexNumber = new ComplexNumber(5, 4);
        complexNumber.add(4, 1);

        System.out.println(complexNumber.getReal());
        System.out.println(complexNumber.getImaginary());
    }
}