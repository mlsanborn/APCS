/**
 * Write a description of class timeconvert here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


//maggie sanborn
//8/23/2016
//time convert
//this program will allow the user to enter in seconds and 
//the program will print out the hours, minutes, and seconds

import java.util.Scanner;


public class timeconvert
{
    /**
     * Constructor for objects of class timeconvert
     */
    public static void main (String[] args)
{       
        Scanner Keyboard = new Scanner(System.in);
        
        int sec, min, hr;
        int shold, minhold, hhold;
        
        System.out.println("Enter the amount of seconds: ");
        shold = Keyboard.nextInt();
        
        //
        minhold = shold/60;
        
        sec = shold%60;
        
        hr = minhold/60;
        
        min = minhold%60;
        
        System.out.println("Seconds: " + sec);
        System.out.println("Minutes: " + min);
        System.out.println("Hours: " + hr);
    
    }//end of main
}//end of class



















