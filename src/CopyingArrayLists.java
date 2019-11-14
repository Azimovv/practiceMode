import java.util.ArrayList;
import java.util.Random;

public class CopyingArrayLists {
    public static void main(String[] args) throws Exception
    {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();

        Random r = new Random();

        for (int i=0; i<10; i++)
            list1.add(r.nextInt(100-1)+1);

        list2 = (ArrayList)list1.clone();
        list2.set(list2.size()-1, -7);

        System.out.println("ArrayList 1: " + list1);
        System.out.println("ArrayList 2: " + list2);
    }

}
