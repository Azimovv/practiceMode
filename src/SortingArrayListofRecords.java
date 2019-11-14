import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class cars
{
    String make;
    String model;
    int year;
    String plate;


    cars(String make, String model, int year, String plate)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.plate = plate;
    }

    public String toString()
    {
        return make + " " + model + " " + year + " " + plate;
    }
}

public class SortingArrayListofRecords {
    public static void main (String[] args) throws Exception
    {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<cars> list = new ArrayList<>();
        ArrayList<cars> temp = new ArrayList<>();
        System.out.print("From which file do you want to load this information: ");
        String fileName = keyboard.next();

        File file = new File(fileName);
        if (file.exists())
            System.out.println("Data loaded");
        System.out.println();
        BufferedReader br = new BufferedReader((new FileReader(file)));

        for (int i=0; i<5; i++)
        {
            list.add(new cars(br.readLine(),br.readLine(), Integer.parseInt(br.readLine()),br.readLine()));
        }
        temp.addAll(list);
        br.close();

        System.out.println("temp " + temp);

        Collections.sort(list, new Comparator<cars>() {
            @Override
            public int compare(cars o1, cars o2) {
                return o1.year - o2.year;
            }
        });

        System.out.println("ArrayList: " + list);

    }
}
