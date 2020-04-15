/*
Use case – Check Swiggy delivery to your area.
• Develop a method that accepts a zip code and validates against non-deliverable zip codes.
• If the customer resides at a non-deliverable zip code, throw a custom exception.
• Handle the exception and display an appropriate message to the customer.
• If the customer resides at a deliverable zip code, display a message “Delivery available in your area! “.
• Invoke this method from public static void main(String[] args) which takes the zip code as an input parameter.
 */

package com.tgt.igniteplus;
import java.util.Scanner;

public class checkDeliery extends Throwable {
    static int pinCode;

    public static void main(String[] args) throws ExceptionHandling {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any 6 digit pincode to check if delivery is available in the area or not");
        pinCode = in.nextInt();
        try {
            Foodgasm(pinCode);
        }
        catch(Exception e) {
        }
        finally{
            System.out.print("\nThankyou for choosing FOODGASM!!");
        }
    }

    public static void Foodgasm(int pincode) throws ExceptionHandling {
        int flag=0;
        int invalidCode[]= {560056,560005,562157};
        for(int i=0;i<invalidCode.length;i++) {
            if (pincode == invalidCode[i]) {
                flag = 1;
                break;
            } else
                flag = 0;
        }
        if(flag==1)
            System.out.println("Delivery is not available in this area");
        else
            System.out.println("Delivery is available in this area");
        System.out.print("We currently do not deliver in these areas:- ");
        for(int i=0;i<invalidCode.length;i++)
            System.out.print(invalidCode[i] + "\t");
    }
}
class ExceptionHandling extends Exception {
    ExceptionHandling(String msg) {
        super(msg);
    }
}

/*
Output:
1)Enter any 6 digit pincode to check if delivery is available in the area or not
560064
Delivery is available in this area
We currently do not deliver in these areas:- 560056	560005	562157
Thankyou for choosing FOODGASM!!

2)Enter any 6 digit pincode to check if delivery is available in the area or not
560005
Delivery is not available in this area
We currently do not deliver in these areas:- 560056	560005	562157
Thankyou for choosing FOODGASM!!
 */



