import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

class Car
{
    String make;
    String model;
    int year;
    String plate;
}

public class StoringDataInAFile {
    public static void main (String[] args) throws Exception
    {
        Car[] cars = new Car[5];
        Scanner keyboard = new Scanner(System.in);

        for(int i=0; i<5; i++)
        {
            cars[i] = new Car();
            System.out.println("Car " + (i+1));
            System.out.print("\tMake: ");
            cars[i].make = keyboard.next();
            System.out.print("\tModel: ");
            cars[i].model = keyboard.next();
            System.out.print("\tYear: ");
            cars[i].year = keyboard.nextInt();
            System.out.print("\tLicense: ");
            cars[i].plate = keyboard.next();
            System.out.println();
        }

        System.out.print("To which file do you want to save this information? ");
        String fileName = keyboard.next();

        File file = new File(fileName);
        BufferedWriter br = new BufferedWriter(new FileWriter(file));

        for (int i=0; i<5; i++)
        {
            br.write(cars[i].make);
            br.newLine();
            br.write(cars[i].model);
            br.newLine();
            br.write(String.valueOf(cars[i].year));
            br.newLine();
            br.write(cars[i].plate);
            br.newLine();
        }

        br.close();

        System.out.println("Data saved");

    }

}
