package com.tgt.igniteplus;

import java.util.Scanner;

public class ExceptionHandling extends Exception {
    public ExceptionHandling(int msg) {
        System.out.println("Invalid code");
    }

    public static void main(String[] args) throws ExceptionHandling {
        Scanner in = new Scanner(System.in);
        int pincode = in.nextInt();
        Swiggy(pincode);
    }

    public static void Swiggy(int pincode) throws ExceptionHandling {

        int invalidCode1 = 123;
        int invalidCode2 = 456;
        int invalidCode3 = 289;
        if (pincode == invalidCode1 || pincode == invalidCode2 || pincode == invalidCode3)
            System.out.println("Invalid pincode");
    }
}