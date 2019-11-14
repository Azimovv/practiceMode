import java.util.ArrayList;
import java.util.Random;

public class BasicArrayLists0 {
    public static void main (String[] args)
    {
        ArrayList<Integer> num = new ArrayList<Integer>();
        Random r = new Random();
        int k=0;

        for (int i=0; i<1000; i++)
            num.add(r.nextInt((99-10)+1)+10);

        for (int i=0; i<50; i++)
        {
            for (int j=0; j<20; j++)
            {
                System.out.print(num.get(k) + " ");
                k++;
            }
            System.out.println();

        }
    }

}
