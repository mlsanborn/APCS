import TurtleGraphics.StandardPen;
import java.util.Random;
import java.awt.*;

public class DrawSquare
{
public static void main(String[] args)
{
    Random gen = new Random();
    StandardPen pen = new StandardPen();


    // puts the pen in the pos to start shape
    pen.up();
    pen.move(25);
    pen.turn(90); pen.move(25);
    pen.down();

    //drawing a square
    pen.setColor(Color.blue);
    
    pen.move(25);
    pen.turn(90);
    pen.move(25);
    pen.turn(90);
    pen.move(25);
    pen.turn(90);
    pen.move(25);
    
    //moves pen away
    pen.up();
    pen.move(-80);
    pen.down();
    
    //drawing a triangle
    pen.setColor(Color.red);
    
    pen.move(25);
    pen.turn(90);
    pen.move(25);
    pen.turn(135);
    pen.move(35);
    /**/
}//end of main
}//end of class























