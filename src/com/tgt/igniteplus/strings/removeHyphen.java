//To remove hyphen from string only if it in between digits

package com.tgt.igniteplus.strings;
import java.util.Scanner;

public class removeHyphen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str= in.nextLine();
        char[] s = str.toCharArray();
        char[] newStr = new char[str.length()];
        int j=0,i;
        for(i=0;i<str.length();i++)
        {
            if(s[i] == '-' && s[i-1]<65 && s[i+1]<65);
            else
                newStr[j++]= s[i];
        }

        System.out.print("The string after hyphen removal is ");
        System.out.println(newStr);
    }

}

/*
Output:
Enter a string
134-10/5566 A-block,Manyata Tech-Park
The string after hyphen removal is 13410/5566 A-block,Manyata Tech-Park

 */