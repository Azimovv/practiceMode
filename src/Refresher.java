import java.util.Scanner;

public class Refresher {

    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Choose a number: ");
        int number = keyboard.nextInt();

        for (int n = 1; n <= 12; n++)
                System.out.println(number + "x" + n + " = " + number*n);
    }

}
