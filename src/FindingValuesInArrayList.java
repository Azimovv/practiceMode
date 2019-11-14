import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FindingValuesInArrayList {
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        ArrayList list = new ArrayList();
        Random r = new Random();

        for (int i=0; i<10; i++)
            list.add(r.nextInt(50-1)+1);

        System.out.println("ArrayList: " + list);
        System.out.print("Value to find: ");
        int find = keyboard.nextInt();
        System.out.println();

        for (int i=0; i<10; i++)
        {
            if (list.get(i).equals(find))
                System.out.println(find + " is in the ArrayList at index: " + i);
        }
        if (!list.contains(find))
            System.out.println("Naw bruh");

    }
}
