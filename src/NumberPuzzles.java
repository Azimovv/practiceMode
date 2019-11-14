import java.util.Scanner;

public class NumberPuzzles {

    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1) Find two digit numbers <= 56 with sums of digits > 10");
            System.out.println("2) Find two digit number minus number reversed which equals sum of digits");
            System.out.println("3) Quit");
            System.out.print("\n> ");
            choice = keyboard.nextInt();
            System.out.println();

            if (choice == 1)
                sum();
            else if (choice == 2)
                difference();

            System.out.println();

        }while (choice!=3);
    }

    public static void sum()
    {
        for (int x = 0; x<=5; x++)
        {
            for (int y = 0; y<=9; y++)
            {
                if (x+y>10 && ((x*10)+y) <= 56)
                    System.out.println(x + "" + y);
            }
        }
    }

    public static void difference()
    {
        for (int x = 1; x<=9; x++)
        {
            for (int y = 1; y<=9; y++)
            {
                if (((x*10)+y)-((y*10)+x)==x+y)
                    System.out.println(x + "" + y);
            }
        }
    }

}
