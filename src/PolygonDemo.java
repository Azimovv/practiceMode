import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class PolygonDemo extends Canvas
{
    public void paint( Graphics g)
    {
        Random r = new Random();
        int x1 = 512;
        int x2 = 146;
        int x3 = 876;
        int y1 = 109;
        int y2 = 654;
        int y3 = 654;
        int x = 512;
        int y = 382;
        int dx = 0;
        int dy = 0;

        for (int n=1; n<=50000; n++)
        {
            g.drawLine(x,y,x,y);
            int rand = 1+r.nextInt(3);
            if (rand == 1)
            {
                dx = x-x1;
                dy = y-y1;
            }
            else if (rand == 2)
            {
                dx = x-x2;
                dy = y-y2;
            }
            else if (rand == 3)
            {
                dx = x-x3;
                dy = y-y3;
            }
            x = x - dx/2;
            y = y - dy/2;
        }
        g.drawString("Sierpinski Triangle",462,484);
    }

    public static void main(String[] args)
    {
        JFrame win = new JFrame("Polygon Demo");
        win.setSize(1024,768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add( new PolygonDemo() );
        win.setVisible(true);
    }

}
