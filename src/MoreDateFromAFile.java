import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

class Person
{
    String name;
    int age;
}

public class MoreDateFromAFile {
    public static void main (String[] args) throws Exception
    {
        Scanner keyboard = new Scanner(System.in);
        Person[] persons = new Person[5];
        System.out.print("Which file to open: ");
        String fileName = keyboard.next();
        System.out.println("Reading data from " + fileName);
        System.out.println();

        File file = new File(fileName);
        BufferedReader br = new BufferedReader(new FileReader(file));

        for(int i=0; i<5; i++)
        {
            persons[i] = new Person();
            persons[i].name = br.readLine();
            persons[i].age = Integer.parseInt(br.readLine());
            System.out.println(persons[i].name + " is " + persons[i].age);
        }

        br.close();
    }

}
