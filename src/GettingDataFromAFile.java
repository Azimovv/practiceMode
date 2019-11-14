import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

class Doggos
{
    String breed;
    int age;
    double weight;
}

public class GettingDataFromAFile {
    public static void main (String[] args) throws Exception
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Which file to open: ");
        String choice = keyboard.next();
        System.out.println("Reading data from " + choice);
        System.out.println();

        File file = new File(choice);
        BufferedReader br = new BufferedReader(new FileReader(file));

        Doggos first = new Doggos();
        first.breed = br.readLine();
        first.age = Integer.parseInt(br.readLine());
        first.weight = Double.parseDouble(br.readLine());

        Doggos second = new Doggos();
        second.breed = br.readLine();
        second.age = Integer.parseInt(br.readLine());
        second.weight = Double.parseDouble(br.readLine());

        br.close();

        System.out.println("First doggo: " + first.breed + ", " + first.age + ", " + first.weight);
        System.out.println("Second doggo: " + second.breed + ", " + second.age + ", " + second.weight);
    }

}
