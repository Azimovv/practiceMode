import java.util.Scanner;

class Student
{
    String name;
    int grade;
    float average;
}

public class BasicRecords {

    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner (System.in);
        Student first = new Student();
        System.out.print("Enter the first student's name: ");
        first.name = keyboard.nextLine();
        System.out.print("Enter the first student's grade: ");
        first.grade = keyboard.nextInt();
        System.out.print("Enter the first student's average: ");
        first.average = keyboard.nextFloat();

        Student second = new Student();
        System.out.print("\nEnter the second student's name: ");
        second.name = keyboard.next();
        System.out.print("Enter the second student's grade: ");
        second.grade = keyboard.nextInt();
        System.out.print("Enter the second student's average: ");
        second.average = keyboard.nextFloat();

        Student third = new Student();
        System.out.print("\nEnter the third student's name: ");
        third.name = keyboard.next();
        System.out.print("Enter the third student's grade: ");
        third.grade = keyboard.nextInt();
        System.out.print("Enter the third student's average: ");
        third.average = keyboard.nextFloat();

        System.out.println("\nThe names are: " + first.name + ", " + second.name + ", and " + third.name);
        System.out.println("The grades are: " + first.grade + ", " + second.grade + ", and " + third.grade);
        System.out.println("The averages are: " + first.average + ", " + second.average + ", and " + third.average);

        System.out.println("\nThe average for the three students is: " + ((first.average+second.average+third.average)/3));

    }

}
