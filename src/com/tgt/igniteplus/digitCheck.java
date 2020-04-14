package com.tgt.igniteplus;
import java.util.Scanner;

public class digitCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = in.nextLine();
        int flag=0;
        System.out.println("Let's check if the string is only made of digits");
        char[] s= str.toCharArray();
        for(int i=0;i<str.length();i++) {
            if (s[i] < 65)
                flag = 0;
            else
                flag = 1;
        }
        if(flag==0)
            System.out.println("String is only made of digits");
        else
            System.out.println("String is not only made of digits");

    }
}