
/**
 * Write a description of class name here.
 *******************************************
 * maggie sanborn
 * 8/29/16
 * name project
 * asks user for their name
 *******************************************
**/
import java.util.Scanner;
import java.util.Random;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class name
{
    /**
     * Constructor for objects of class name
     */
    public static void main (String[] args)
    {
        /**
         *** Variable List ***
         * full_name - allows user to input their full name
         * iname - the index used for the name
         **/
         
        int iname;
         
        Scanner Keyboard = new Scanner(System.in);
        
        System.out.println();
        System.out.println("What's your name?");
        String full_name = Keyboard.nextLine();
        
        System.out.println();
        
        //finds index of a space
        iname = full_name.indexOf( " " );
        
        //prints first name, middle initial
        System.out.println(full_name.substring(0,iname) + full_name.substring(iname, iname+2));
        
        //prints last name
        System.out.print(full_name.substring(iname+3, full_name.length()) );
        
        
    }
}



















