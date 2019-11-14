import java.util.ArrayList;
import java.util.Random;

public class FindingLargestValueInArrayList {
    public static void main (String[] args)
    {
        ArrayList list = new ArrayList();
        Random r = new Random();

        for (int i=0; i<10; i++)
            list.add(r.nextInt(100-1)+1);

        System.out.println("ArrayList: " + list);
        System.out.println();

        int largest = 0;

        for (int i=0; i<10; i++)
        {
            if ((Integer)list.get(i) > largest)
                largest = (Integer)list.get(i);
        }

        System.out.println("Largest value is: " + largest + " at index " + list.indexOf(largest));
    }
}
