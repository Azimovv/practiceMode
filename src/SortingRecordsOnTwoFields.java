import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

class StudentRecords
{
    int ID;
    int grade;
    float score;
    String letterGrade;
}

public class SortingRecordsOnTwoFields {
    public static void main (String[] args) throws Exception
    {
        StudentRecords[] records = new StudentRecords[30];
        StudentRecords[] temp = new StudentRecords[30];
        StudentRecords[] temp2 = new StudentRecords[30];
        String[] storage = new String[4];
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Open which file: ");
        String fileName = keyboard.next();
        File file = new File(fileName);
        BufferedReader br = new BufferedReader(new FileReader(file));

        for(int i=0; i<30; i++)
        {
            records[i] = new StudentRecords();
            storage = br.readLine().split(" ");
            records[i].ID = Integer.parseInt(storage[0]);
            records[i].grade = Integer.parseInt(storage[1]);
            records[i].score = Float.parseFloat(storage[2]);
            records[i].letterGrade = storage[3];
        }

        br.close();

        System.out.println();
        System.out.println("Data loaded.");

        for(int i=0; i<30; i++)
        {
            for(int j=0; j<30; j++)
            {
                if(records[i].ID < records[j].ID)
                {
                        temp[j] = records[i];
                        records[i] = records[j];
                        records[j] = temp[j];
                }
            }
        }
        for(int i=0; i<30; i++)
        {
            for(int j=0; j<30; j++)
            {
                if(records[i].ID == records[j].ID)
                {
                    if(records[i].grade < records[j].grade)
                    {
                        temp[j] = records[i];
                        records[i] = records[j];
                        records[j] = temp[j];
                    }
                }
            }
        }

        System.out.println("Data sorted.");
        System.out.println();

        System.out.println("Here are the sorted grades: ");
        for(int i=0; i<30; i++)
        {
            System.out.println("\t" + records[i].ID + " " + records[i].grade + " " + records[i].score + " " + records[i].letterGrade);
        }

    }
}
