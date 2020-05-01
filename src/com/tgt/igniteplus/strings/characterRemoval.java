//Program to remove a particular character from a string

package com.tgt.igniteplus.strings;
import java.util.Scanner;

public class characterRemoval {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner in = new Scanner(System.in);
        String str= in.nextLine();
        System.out.println("Enter the character you want to remove");
        String ch = in.nextLine();
        int i=0;
        str= str.replace(ch, "");
        str=str.replace(ch.tolowerCase(),"");
        str = str.replace(ch.toUpperCase(),"");
        System.out.println("The string after character removal is " + str);
    }
}

/*
Output:
Enter a string
Avengers Endgame
Enter the character you want to remove in lowercase
a
The string after character removal is vengers Endgme
 */
