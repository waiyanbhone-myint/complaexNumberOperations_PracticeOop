package com.ps;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal(){
        return this.real;
    }

    public double getImaginary(){
        return this.imaginary;
    }

    public void add(double real, double imaginary){
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber other){
        this.real += other.getReal();
        this.imaginary += other.getImaginary();
    }

    public void substract(double real, double imaginary){
        this.real = real;
        this.imaginary -= imaginary;
    }

    public void substract(ComplexNumber other){
        this.real -= other.getReal();
        this.imaginary -= other.getImaginary();
    }
}
