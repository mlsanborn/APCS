
/**
 * Write a description of class coin here.
 *******************************************
 * maggie sanborn
 * 8/25/16
 * project 2.12
 * ask user for how many of each coin
 *******************************************
/**/
import java.util.Scanner;

import java.util.*;

import java.text.NumberFormat;
import java.text.DecimalFormat;

public class coin
{
    /**
     * Constructor for objects of class coin
     */
    public static void main (String[] args)
    {
        /**
         *** Variable List ***
         * pen - asks user for amt of pennies
         * nick - asks user for amt of nickels
         * dime - asks user of amt of dimes
         * qt - asks user for amt of quarters
         * total - the final amt
         **/
         
        Scanner Keyboard = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("0.00");
        
        double pen, nick, dime, qt, total;
        
        //finds amt of quarters
        System.out.print("Quarters: ");
        qt = Keyboard.nextInt();
        
        //finds amt of dimes
        System.out.print("Dimes: ");
        dime = Keyboard.nextInt();
        
        //finds amt of nickels
        System.out.print("Nickels: ");
        nick = Keyboard.nextInt();
        
        //finds amt of pennies
        System.out.print("Pennies: ");
        pen = Keyboard.nextInt();
        
        //finds the total amt of coins
        total = qt*.25 + dime*.10 + nick*.05 + pen*.01;
        
        System.out.println("Total: $" + fmt.format(total) );
    }
}














