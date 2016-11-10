/*********************************************
 * 
 * maggie sanborn
 * 9/23/16
 * license
 * 
 *********************************************/
 
 import java.util.*;
 import java.text.*;
 
public class license
{
    /**
     * Constructor for objects of class practice_prog
     */
    
    public static void main(String[] args)
    {
        Scanner Keyboard = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("#.##");
        
        double val, basecharge = 200.0, p, hold;
        
        
        
        System.out.print("\nvalue of car: ");
        val = Keyboard.nextDouble();
        /**/
        
        if (val > 10000){
            basecharge += .02 * 10000;
            if (val > 20000){
                hold = val - 20000;
                basecharge += .04 * hold;
                if (val > 40000){
                    hold = val - 40000;
                    basecharge += .06 * hold;
                }
            }
        }
        
        System.out.print("Total sticker cost: $" + fmt.format(basecharge) );
        
        /**/
        
       
    }
}






















