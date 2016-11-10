/**
 * Write a description of class circle here.
 *******************************************
 * maggie sanborn
 * 8/25/16
 * project 2.9
 * find area & circumference of a circle
 *******************************************
/**/
import java.util.Scanner;

import java.util.*;

import java.text.NumberFormat;
import java.text.DecimalFormat;

public class circle
{
    /**
     * Constructor for objects of class circle
     */
    public static void main (String[] args)
    {
        /**
         *** variables ***
         * r - radius
         * circ - final circumference
         * circhold - a hold to find the circumference
         * area - the area of a circle
         **/
         
        Scanner Keyboard = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("0.##");
        
        double r, circ, circhold, area;
        
        //asks for radius input
        System.out.println("Enter the radius of the circle: ");
        r = Keyboard.nextDouble();
        
        //to find area
        area = 2*Math.PI*r;
        System.out.println("Area: " + fmt.format(area));
        
        //to find circumference
        circhold = Math.pow(r, 2);
        circ = Math.PI*circhold;
        System.out.println("Circumference: " + fmt.format(circ));
    }
}









