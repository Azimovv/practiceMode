import java.util.Scanner;

public class AreaCalculator {

    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        int choice = 1;
        int b, h, w ,l, s, r;

        do {
            System.out.println("1) Triangle");
            System.out.println("2) Rectangle");
            System.out.println("3) Square");
            System.out.println("4) Circle");
            System.out.println("5) Quit");
            System.out.print("Which shape: ");
            choice = keyboard.nextInt();

            if (choice == 1)
            {
                System.out.print("Base: ");
                b = keyboard.nextInt();
                System.out.print("Height: ");
                h = keyboard.nextInt();
                System.out.println("The area is " + area_triangle(b,h));
            }
            if (choice == 2)
            {
                System.out.print("Length: ");
                l = keyboard.nextInt();
                System.out.print("Width: ");
                w = keyboard.nextInt();
                System.out.println("The area is: " + area_rectangle(l,w));
            }
            if (choice == 3)
            {
                System.out.print("Side length: ");
                s = keyboard.nextInt();
                System.out.println("The area is: "+ area_square(s));
            }
            if (choice == 4)
            {
                System.out.print("Radius: ");
                r = keyboard.nextInt();
                System.out.println("The area is: " + area_circle(r));
            }

        }while(choice!=5);

        System.out.println("\nGoodbye");

    }

    public static double area_circle (int radius)
    {
        return Math.PI * radius * radius;
    }

    public static int area_rectangle (int length, int width)
    {
        return length * width;
    }

    public static int area_square (int side)
    {
        return side * side;
    }

    public static double area_triangle (int base, int height)
    {
        return (0.5) * base * height;
    }

}
