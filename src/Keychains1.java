import java.util.Scanner;

public class Keychains1
{
    public static void main( String [] args )
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ye Olde Keychain Shoppe");
        int choice = 0;
        int keychains = 0;
        double price = 10;
        double tax = 0.0825;
        int baseShipping = 5;
        int addShipping = 1;

        do
        {
            System.out.println("\n1. Add keychains to Order");
            System.out.println("2. Remove Keychains from Order");
            System.out.println("3. View Current Order");
            System.out.println("4. Checkout");
            System.out.println();
            System.out.print("Please enter your choice: ");
            choice = keyboard.nextInt();
            System.out.println();
            if (choice == 1)
                keychains = add_keychains(keychains);
            else if (choice == 2)
                keychains = remove_keychains(keychains);
            else if (choice == 3)
                view_order(keychains, price, tax, baseShipping, addShipping);
            else if (choice == 4)
                checkout(keychains, price, tax, baseShipping, addShipping);
            else
                System.out.println("Please pick a choice between 1 and 4");

        }while(choice!=4);

    }

    public static int add_keychains(int keychains)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("You have " + keychains + " keychains. How many to add? ");
        int add = keyboard.nextInt();
        while (add < 0)
        {
            System.out.println("You cannot have a negative amount of keychains, please try again");
            System.out.print("Keychains to add: ");
            add = keyboard.nextInt();
        }
        keychains = keychains + add;
        System.out.println("You now have " + keychains + " keychains.");
        return keychains;
    }

    public static int remove_keychains(int keychains)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("You have " + keychains + " keychains. How many to remove? ");
        int remove = keyboard.nextInt();
        while (keychains-remove < 0)
        {
            System.out.println("You cannot have a negative amount of keychains, please try again");
            System.out.print("Keychains to remove: ");
            remove = keyboard.nextInt();
        }
        keychains = keychains - remove;
        System.out.println("You now have " + keychains + " keychains.");
        return keychains;
    }

    public static void view_order(int keychains, double price, double tax, int base_shipping, int add_shipping)
    {
        double chainsAndPrice = keychains*price;
        double shipping = base_shipping+(keychains-1)*add_shipping;
        double total = chainsAndPrice+shipping;
        double taxedTotal = total+(total*tax);
        System.out.println("You have " + keychains + " keychains.");
        System.out.println("Keychains cost $10 each.");
        System.out.println("Your total shipping costs are: $" + shipping);
        System.out.println("Your subtotal is: $" + total);
        System.out.println("The tax on the order is: $" + total*tax);
        System.out.println("Total cost is: $" + taxedTotal);
    }

    public static void checkout(int keychains, double price, double tax, int base_shipping, int add_shipping)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = keyboard.nextLine();
        view_order(keychains, price, tax, base_shipping, add_shipping);
        System.out.println("Thanks for your order " + name);
    }

}
