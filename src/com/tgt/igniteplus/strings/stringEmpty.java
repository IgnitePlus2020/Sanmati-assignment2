//To check if the string entered is empty or not

package com.tgt.igniteplus.strings;
import java.util.Scanner;

public class stringEmpty {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str= in.nextLine();
        System.out.println("Let's check whether the string you entered is empty");
        if(str.isEmpty())
            System.out.println("The string you entered is empty");
        else
            System.out.println("The string you entered is not empty");
    }
}

/*
Output:
1) Enter a string
Avengers
Let's check whether the string you entered is empty
The string you entered is not empty

2)Enter a string

Let's check whether the string you entered is empty
The string you entered is empty
 */