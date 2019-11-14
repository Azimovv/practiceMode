import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class DisplayingAFile {
    public static void main (String[] args) throws Exception
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Which file you wanna open: ");
        String choice = keyboard.next();
        System.out.println();
        char ch;
        int counter=0;

        String line;

        FileReader fileReader = new FileReader(choice);
        BufferedReader reader = new BufferedReader((fileReader));

        while ((line = reader.readLine()) != null)
        {
            for (int n = 0; n<=(line.length()-1); n++)
            {
                counter++;
                ch = line.charAt(n);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    ch = Character.toUpperCase(ch);
                    System.out.print(ch);
                }
                else
                    System.out.print(ch);
            }
            System.out.println();
        }

    }

}
