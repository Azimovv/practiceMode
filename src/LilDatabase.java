import java.util.Scanner;

public class LilDatabase {

    public static void main(String[] args)
    {
        Student[] studRecords = new Student[3];

        Scanner keyboard = new Scanner (System.in);

        for(int i = 0; i<3; i++)
        {
            studRecords[i] = new Student();
            System.out.print("Enter student " + (i+1) + "'s name: ");
            studRecords[i].name = keyboard.next();
            System.out.print("Enter student " + (i+1) + "'s grade: ");
            studRecords[i].grade = keyboard.nextInt();
            System.out.print("Enter student " + (i+1) + "'s average: ");
            studRecords[i].average = keyboard.nextFloat();
            System.out.println();
        }

        System.out.println("\nThe names are: " + studRecords[0].name + ", " + studRecords[1].name + ", and " + studRecords[2].name);
        System.out.println("The grades are: " + studRecords[0].grade + ", " + studRecords[1].grade + ", and " + studRecords[2].grade);
        System.out.println("The averages are: " + studRecords[0].average + ", " + studRecords[1].average + ", and " + studRecords[2].average);

    }

}
