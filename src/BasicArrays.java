import java.util.Scanner;

public class BasicArrays {
    public static void main (String[] args) throws Exception
    {
        Scanner keyboard = new Scanner(System.in);
        String[] arr1 = {"Mitchell", "Ortiz", "Luu", "Zimmerman", "Brooks"};
        double[] arr2 = {99.5, 78.5, 95.6, 96.8, 82.7};
        int[] arr3 = {123456, 813225, 823669, 307760, 827131};

        System.out.print("Values:\n");
        for(int n=0; n<arr1.length; n++)
        {
            System.out.println("\t" + arr1[n] + " " + arr2[n] + " " + arr3[n]);
        }

        System.out.print("\nID number to find: ");
        int ID = keyboard.nextInt();

        for (int n = 0; n<arr1.length; n++)
        {
            if (ID == arr3[n])
            {
                System.out.println("\nFound in slot: " + n);
                System.out.println("\tName: " + arr1[n]);
                System.out.println("\tAverage: " + arr2[n]);
                System.out.println("\tID: " + arr3[n]);
            }
        }


    }
}
