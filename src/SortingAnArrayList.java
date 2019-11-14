import java.util.ArrayList;
import java.util.Random;

public class SortingAnArrayList {

    public static void sort (ArrayList a)
    {
        int temp = 0;
        for (int i=0; i<a.size(); i++)
        {
            for (int j=0; j<a.size(); j++)
            {
                if ((Integer)a.get(i) > (Integer)a.get(j))
                {
                    temp = (Integer)a.get(i);
                    a.set(i,a.get(j));
                    a.set(j,temp);
                }
            }
        }
        System.out.println("ArrayList after: " + a);
    }

    public static void main (String[] args)
    {
        ArrayList list = new ArrayList();
        Random r = new Random();

        for (int i=0; i<10; i++)
            list.add((r.nextInt(99-10)+1)+10);

        System.out.println("ArrayList before: " + list);
        sort(list);

    }
}
