
/**
 * Write a description of class phone here.
 *******************************************
 * maggie sanborn
 * 8/29/16
 * project 2.14
 * generates a random phone number
 *******************************************
**/
import java.util.Random;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class phone
{
    /**
     * Constructor for objects of class phone
     */
    public static void main (String[] args)
    {
        /**
         *** Variable List ***
         * dig1 - first digit in the phone number
         * dig2 - second digit in phone number
         * dig3 - third digit in phone number
         * middig - middle 3 digits
         * lastdig - last 4 digits
         **/
        
        int dig1, dig2, dig3, middig, lastdig;
        
        DecimalFormat fmt1 = new DecimalFormat("0");
        DecimalFormat fmt2 = new DecimalFormat("000");
        DecimalFormat fmt3 = new DecimalFormat("0000");
        
        Random generator = new Random();
        
        dig1 = generator.nextInt(8);
        dig2 = generator.nextInt(8);
        dig3 = generator.nextInt(8);
        
        middig = generator.nextInt(743);
        
        lastdig = generator.nextInt(10000);
        
        System.out.println(fmt1.format(dig1) + fmt1.format(dig2) + fmt1.format(dig3) + "-" + fmt2.format(middig) + "-" + fmt3.format(lastdig) );
    }
}
