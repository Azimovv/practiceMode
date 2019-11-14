import javax.swing.*;
import java.awt.*;
import java.util.Random;

class ForestAndTrees extends Canvas
{
    public void paint (Graphics g)
    {
        int x = 1;
        int y = 1;
        int w = 1;
        int h = 1;
        drawForest(g,x,y,w,h);
    }

    public void drawForest (Graphics g, int x, int y, int w, int h)
    {
        Random r = new Random();
        g.setColor(Color.black);
        x=1+r.nextInt(800);
        y=1+r.nextInt(600);
        w=1+r.nextInt(600);
        h=1+r.nextInt(600);
        for (int n = 1; n<=5; n++)
        {
            g.setColor(Color.black);
            g.drawRect(x, y, w, h);
            for (int j = 1; j<=50; j++)
            {
                drawTree(g,1+r.nextInt(x),1+r.nextInt(y));
            }
            x=1+r.nextInt(800);
            y=1+r.nextInt(600);
            w=1+r.nextInt(600);
            h=1+r.nextInt(600);
        }

    }

    public void drawTree ( Graphics g, int x, int y)
    {
        Color brown = new Color(165,42,42);
        g.setColor(brown);
        g.fillRect(x+17, y+50, 16, 50);
        g.setColor(Color.green);
        Polygon tri = new Polygon();
        tri.addPoint(x+25,y);
        tri.addPoint(x+50,y+75);
        tri.addPoint(x,y+75);
        g.fillPolygon(tri);
    }

    public static void main( String[] args )
    {
        Canvas canvas = new ForestAndTrees();
        JFrame win = new JFrame("Boxy3 - write and use function - boxes different sizes");
        win.setSize(1000,800);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvas.setBackground(Color.WHITE);
        win.add( canvas );
        win.setVisible(true);
    }

}
