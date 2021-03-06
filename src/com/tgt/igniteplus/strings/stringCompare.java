//Different ways to compare two strings

package com.tgt.igniteplus.strings;
import java.util.Scanner;

public class stringCompare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two strings");
        String str1= in.nextLine();
        String str2= in.nextLine();
        System.out.println("Let's check if these strings are identical");
        System.out.println("Using compareTo() method");
        if(str1.compareTo(str2)==0)
            System.out.println("The strings are equal");
        else
            System.out.println("The strings are not equal");
        System.out.println("Using equals() method");
        if(str1.equals(str2))
            System.out.println("The strings are equal");
        else
            System.out.println("The strings are not equal");

        System.out.println("Using equalsIgnoreCase() method");
        if(str1.equalsIgnoreCase(str2))
            System.out.println("The strings are equal");
        else
            System.out.println("The strings are not equal");

    }
}

/*
Output:
1)Enter two strings
sam
SAm
Let's check if these strings are identical
Using compareTo() method
The strings are not equal
Using equals() method
The strings are not equal
Using equalsIgnoreCase() method
The strings are equal
 */