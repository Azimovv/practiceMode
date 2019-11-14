import java.util.ArrayList;
import java.util.Collections;

public class SortingAnArrayListOfStrings {

    public static void main (String[] args)
    {
        ArrayList list = new ArrayList();
        list.add("ask");
        list.add("not");
        list.add("what");
        list.add("your");
        list.add("country");
        list.add("can");
        list.add("do");
        list.add("for");
        list.add("you");
        list.add("but");

        System.out.println("ArrayList before: " + list);
        Collections.sort(list);
        System.out.println("ArrayList after: " + list);
    }
}
