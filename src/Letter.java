import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Letter {

    public static void main(String[] args) throws Exception
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Which file do you wanna read numbers from: ");
        String name = keyboard.next();
        System.out.println("Reading numbers from file '" + name + "'");
        System.out.println();

        String fileName = name;
        String line = null;
        int sum = 0;

        FileReader fileReader = new FileReader(fileName);

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while ((line = bufferedReader.readLine()) != null)
        {
            System.out.print(line + " + ");
            sum += Integer.valueOf(line);
        }

        System.out.print("\b\b\b" + " = " + sum);

        bufferedReader.close();
    }

}
