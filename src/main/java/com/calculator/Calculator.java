package com.calculator;

public class Calculator {
    public static long add(int a,int b){
        return a+b;
    }
    public static long subtract(int a,int b){
        return b-a;
    }
    public static long multiply(int a,int b){
        return a*b;
    }
    public static long divide(int a,int b){
        long res;
        try{
            res = a/b;
        }catch (ArithmeticException e){
            throw new ArithmeticException(e.getMessage());
        }
        return res;
    }
}
