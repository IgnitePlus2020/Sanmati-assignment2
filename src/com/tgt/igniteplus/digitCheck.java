package com.tgt.igniteplus;
import java.util.Scanner;

public class digitCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = in.nextLine();
        int flag=0;
        System.out.println("Let's check if the string is only made of digits");
        if(str.matches("[0-9]+"))
            System.out.println("String is only made of digits");
        else
            System.out.println("String is not only made of digits");

    }
}

/*
Output:
1)Enter a string
Sanmati 21
Let's check if the string is only made of digits
String is not only made of digits
2)Enter a string
6579
Let's check if the string is only made of digits
String is only made of digits
 */