/********************************************************************
 *     // These are the notes for ch 2 used in hayes class //     *
//********************************************************************/
//maggie sanborn
//8/19/2016
//chapter 2 notes
//these are notes for ch 2

import java.util.Random; // lets me use random class
import java.util. Scanner;

import java.util.*; // lets me use any class in the packgage java.text.*;

import java.text.NumberFormat;
import java.text.DecimalFormat;


public class ch2notes5{
    //enum is a special type of class
    enum Flavor {chocolate, strawberry, mitChocolateChip, razberry}
    enum classperiods {one,two,three,four,five,six,seven,eight}
    public static void main (String[] args)
{
        //class id     memory   constructor
        Scanner scan = new      Scanner (System.in);
        Scanner Keyboard = new Scanner(System.in);
    
        
        int length;
        int x = 9,y,z;
        int id = 789;
        double num = 5, num1 = 23.89765, num2 = 3.4;
        char letter = 'd';
        boolean choice = false;
        
        
        /*
        /**
        
        Integer  number = new    Integer(47);
        //  ^      ^       ^         ^
        //class|  |id||need memory|constructor|
        
        /**
        
        String word = new String("Homer Simpson");
        String word2 = new String("Homer Simpson");
        String word3 = new String("Bart");
        String name = new String("Mike");
        String lname = "Hayes",fname = "Kevin", mname;
        
        System.out.printf("Name:    %-20s \t ID: %5d \n", name,id);
        System.out.printf("Name:    %-20s \t ID: %5d \n", word,1234);
        System.out.printf("Name:    %-20s \t ID: %5.2f \n", "hi",12.567890);
        /*
        
        num = num % 3;
        System.out.println(num);
        
        /**
        
        double conversionFactor = x/5.0;
        final int BASE = 32;
        int celsiusTemp = 30;
        
        double fahrenTemp = celsiusTemp * conversionFactor + BASE;
        
        System.out.println("Celsuis Temp: " + celsiusTemp );
        System.out.println("Farenheit Equivalent: " + fahrenTemp );
        
        /**
                //Autoboxing
                Integer obj;
                int y = 56;
                obj = y;
                int z = obj;
        /**
        
            //pg. 78
            System.out.println( word.length() );
            
            boolean ans = word.equals(word2);
            System.out.println( ans );
            System.out.println( word == word2 );  //even though value is the same, they are two separate 
                                                  //objects! (two separate cars of the same model)
        /**                                          
            System.out.println(word3.compareTo(word) );  //compares value of first letters, 
                                                         //if positive num - comes after
                                                         //if equal - equal to
                                                         //if negative 
            System.out.println(word.indexOf("p") );      
        /**
        
        Random generator = new Random();
        
        //int range 0-99
        //adj the range by adding or subtracting
        x = generator.nextInt(100);
        System.out.println("the random number is " + x);
        
        //get a num between 0-1
        num = generator.nextDouble()*100; // now double between 0-99
        //adj the range by adding or subtracting
        System.out.println(num);
        
        
        /*
        
        //p 88 for math methods
        
        //Math silly = new Math();
        
        System.out.println(Math.abs(-4));
        System.out.println(Math.sqrt(12));
        System.out.println(Math.pow(2,3));
        System.out.println(Math.PI);
        System.out.println((int)(Math.random()*100));
        
        /**
        
        System.out.print("Enter a number ");
        x = Keyboard.nextInt ();
        System.out.println(x);
        /**
        System.out.print("Enter a word ");
        
        
        
        //word = Keyboard.next ();
        
        word = Keyboard.nextLine ();
        
        System.out.println(word);
        
        /**/
        
        num1 = 23.89765; num2 = 3.4;
        
        //Formatting objects
        NumberFormat money = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();
        DecimalFormat fmt = new DecimalFormat("0.####");
        DecimalFormat fmt2 = new DecimalFormat("0.00"); //## vs 00
        
        System.out.println( "Sub Total: " + money.format(num1) );
        System.out.println( "Sub Total: " + percent.format(num1) );
        
        System.out.println( "Sub Total: " + fmt.format(num1) );
        System.out.println( "Sub Total: " + fmt2.format(num2) );
        
        /**/
    }//end of main

}//end of class

