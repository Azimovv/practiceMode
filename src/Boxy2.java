import javax.swing.*;
import java.awt.*;

/************************************************************************************
 **                  B O X Y  2 - use function - all boxes same size               **
 ***********************************************************************************/

class Boxy2 extends Canvas
{
    public void paint( Graphics window )
    {
        //                  color    x    y
        drawBox( window, Color.RED, 200, 300 );
        drawBox( window, Color.BLUE, 100, 200 );
        drawBox( window, Color.BLACK, 150, 250 );
        drawBox( window, Color.CYAN, 250, 350 );

        // draw ten more boxes -- different colors, different places
    }

    public void drawBox( Graphics window, Color c, int x, int y )
    {
        // already finished; do not modify

        //this code draws a 100x100 box in color c at (x,y)
        window.setColor(c);
        window.fillRect(x,y,100,100);
        // this code "erases" the center of the box by painting over it in white
        window.setColor(Color.WHITE);
        window.fillRect(x+10,y+10,80,80);
    }


    public static void main( String[] args )
    {
        Canvas canvas = new Boxy2();
        JFrame win = new JFrame("Boxy2 - use function - all boxes same size");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvas.setBackground(Color.WHITE);
        win.add( canvas );
        win.setVisible(true);
    }
}