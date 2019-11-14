import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortingSentences {
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        ArrayList list = new ArrayList();
        System.out.print("Sentence: ");
        String sentence = keyboard.nextLine();
        String[] splitSentence = sentence.toLowerCase().split(" ");

        for (int i=0; i<splitSentence.length; i++)
            list.add(splitSentence[i]);

        Collections.sort(list);

        System.out.println(list);

    }

}
