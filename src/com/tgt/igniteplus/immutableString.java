//Demonstrating that strings are immutable

package com.tgt.igniteplus;
import java.util.Scanner;

public class immutableString {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        System.out.println("The string you entered is " + str1);
        System.out.println("Now we will try to modify this string");
        System.out.println("Enter another string");
        String str2 = in.nextLine();
        System.out.println("Let's try concatenating second string to first string");
        System.out.println("str1.concat(str2)");
        str1.concat(str2);
        System.out.println("Now the new string is " + str1);
        System.out.println("The string has not been modified because strings are immutable(cannot be altered)");

    }
}

/*
Output:
Enter a string
Avengers
The string you entered is Avengers
Now we will try to modify this string
Enter another string
Assemble
Let's try concatenating second string to first string
str1.concat(str2)
Now the new string is Avengers
The string has not been modified because strings are immutable(cannot be altered)
 */
