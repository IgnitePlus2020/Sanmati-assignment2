//To find the length of the entered string

package com.tgt.igniteplus;
import java.util.Scanner;

public class stringLength {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str= in.nextLine();
        System.out.println("The length of the entered string is " + str.length());
    }
}
 /*
 Output:
1) Enter a string
Avengers Assemble
The length of the entered string is 17

2)Enter a string

The length of the entered string is 0
 */