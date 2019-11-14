import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ReadingWhatYouWrote {
    public static void main (String[] args) throws Exception
    {
        Scanner keyboard = new Scanner(System.in);
        Car[] cars = new Car[5];
        System.out.print("What file do you want to open? ");
        String fileName = keyboard.next();
        if(fileName != null)
            System.out.println("Data Loaded");
        System.out.println();

        File file = new File(fileName);
        BufferedReader br = new BufferedReader(new FileReader(file));

        for(int i=0; i<5; i++)
        {
            cars[i] = new Car();
            System.out.println("Car " + (i+1));
            cars[i].make = br.readLine();
            System.out.println("\tMake: " + cars[i].make);
            cars[i].model = br.readLine();
            System.out.println("\tModel: " + cars[i].model);
            cars[i].year = Integer.parseInt(br.readLine());
            System.out.println("\tYear: " + cars[i].year);
            cars[i].plate = br.readLine();
            System.out.println("\tLicense: " + cars[i].plate);
            System.out.println();
        }
        br.close();

    }


}
