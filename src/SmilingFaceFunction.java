import javax.swing.*;
import java.awt.*;

public class SmilingFaceFunction extends Canvas
{
    public void paint( Graphics g )
    {
        drawSmilingFace(g,100,100);
        drawSmilingFace(g,400,350);
        // etc
    }

    public void drawSmilingFace( Graphics g, int x, int y )
    {
        // Draws a smiling face on the screen, where the point (x,y) is
        //  the upper-left corner of a box containing the face.

        // draw circle for the head
        g.setColor(Color.blue);
        g.fillOval(x,y,200,200);
        // draw eyes
        g.setColor(Color.white);
        g.fillOval(x+40,y+20,30,30);
        g.fillOval(x+120,y+20,30,30);
        // draw mouth
        g.setColor(Color.red);
        g.fillArc(x+40,y+80,80,80,180,180);
    }

    public static void main(String[] args)
    {
        // You can change the title or size here if you want.
        JFrame win = new JFrame("Smiling Face Function");
        win.setSize(1024,768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add( new SmilingFaceFunction() );
        win.setVisible(true);
    }


}