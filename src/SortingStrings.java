import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class SortingStrings {
    public static void main (String[] args) throws Exception
    {
        Scanner keyboard = new Scanner(System.in);
        Car[] cars = new Car[5];
        Car[] temp = new Car[5];

        System.out.print("Which file do you want to read? ");
        String fileName = keyboard.next();
        File file = new File(fileName);
        System.out.println("Data loaded");
        System.out.println();
        BufferedReader br = new BufferedReader(new FileReader(file));

        for(int i=0; i<5; i++)
        {
            cars[i] = new Car();
            cars[i].make = br.readLine();
            cars[i].model = br.readLine();
            cars[i].year = Integer.parseInt(br.readLine());
            cars[i].plate = br.readLine();
        }
        br.close();

        for(int i=0; i<5; i++)
        {
            for(int j=0; j<5; j++)
            {
                if(cars[i].make.compareTo(cars[j].make) < 0)
                {
                    temp[j] = cars[i];
                    cars[i] = cars[j];
                    cars[j] = temp[j];
                }
            }
        }
        System.out.println("Data sorted");
        System.out.println();

        for(int i=0; i<5; i++)
        {
            System.out.println("Car " + (i+1));
            System.out.println("\tMake: " + cars[i].make);
            System.out.println("\tModel: " + cars[i].model);
            System.out.println("\tYear: " + cars[i].year);
            System.out.println("\tLicense: " + cars[i].plate);
            System.out.println();
        }

    }
}
