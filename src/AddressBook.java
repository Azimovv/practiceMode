import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class book
{
    String firstName;
    String lastName;
    String phone;
    String address;
    String email;

    book(String firstName, String lastName, String phone, String address, String email)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setLastName (String lastName)
    {
        this.lastName = lastName;
    }
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }

    public String toString()
    {
        return firstName + "\n" + lastName + "\n" + phone + "\n" + address + "\n" + email;
    }
}

public class AddressBook {

    public static ArrayList<book> load (String fileName) throws  Exception
    {
        ArrayList<book> list = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        File file;
        do
        {
            file = new File(fileName);
            if (file.exists())
                System.out.println("Data loaded");
            else
            {
                System.out.print("Error, file does not exist. Try again: ");
                fileName = keyboard.nextLine();
            }
        }while(!file.exists());

        String line = null;
        String[] sepName;
        BufferedReader br = new BufferedReader(new FileReader(file));
        while((line=br.readLine())!=null )
        {
            sepName = line.split(" ");
            list.add(new book(sepName[0], sepName[1], br.readLine(), br.readLine(), br.readLine()));
        }

        br.close();
        return(list);

    }

    public static void save (String fileName, ArrayList<book> list) throws Exception
    {
        Scanner keyboard = new Scanner(System.in);
        File file = new File(fileName);
        BufferedWriter wr;

        if (file.exists())
        {
            System.out.print("File already exists. \nWould you like to append to the file or overwrite it? Enter (append, or overwrite): ");
            String choice = keyboard.next();
            if (choice.equals("append"))
            {
                wr = new BufferedWriter(new FileWriter(file,true));
                wr.newLine();
            }
            else
                wr = new BufferedWriter(new FileWriter(file,false));
        }
        else
            wr = new BufferedWriter(new FileWriter(file));

        for (int i=0; i<list.size(); i++)
        {
            wr.write(list.get(i).firstName + " " + list.get(i).lastName + "\n");
            wr.write(list.get(i).phone + "\n");
            wr.write(list.get(i).address + "\n");
            wr.write(list.get(i).email );
            if((i+1)<list.size())
                wr.newLine();
        }

        System.out.println("Data written to file: " + fileName);
        wr.close();
    }

    public static void main (String[] args) throws  Exception
    {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<book> list = new ArrayList<>();
        int choice;

        do
        {
            System.out.println();
            System.out.println("1) Load from file");
            System.out.println("2) Save to a file");
            System.out.println("3) Add an entry");
            System.out.println("4) Remove an entry");
            System.out.println("5) Edit an existing entry");
            System.out.println("6) Sort the address book");
            System.out.println("7) Search for a specific entry");
            System.out.println("8) Quit");
            System.out.println();
            System.out.print("Please choose what you'd like to do with the database: ");
            choice = keyboard.nextInt();
            System.out.println();

            if (choice == 1)
            {
                System.out.print("Enter file name: ");
                String fileName = keyboard.next();
                list = load(fileName);
            }
            else if (choice == 2)
            {
                System.out.print("Enter file to save to: ");
                String fileName = keyboard.next();
                save(fileName,list);
            }
            else if (choice == 3)
            {
                keyboard.nextLine();
                System.out.print("Enter name(first last): ");
                String name = keyboard.nextLine();
                System.out.print("Enter phone number: ");
                String number = keyboard.nextLine();
                System.out.print("Enter address: ");
                String address = keyboard.nextLine();
                System.out.print("Enter email: ");
                String email = keyboard.nextLine();
                String[] sepName = name.split(" ");
                list.add(new book(sepName[0], sepName[1], number, address, email));
            }
            else if (choice == 4)
            {
                for (int i=0; i<list.size(); i++)
                    System.out.println("Entry " + i + " is: \n" + list.get(i) + "\n");

                System.out.println();
                System.out.print("Which entry number would you like to remove: ");
                int entryNumber = keyboard.nextInt();
                list.remove(entryNumber);
                System.out.println("Entry number " + entryNumber + " removed");
            }
            else if (choice == 5)
            {
                for (int i = 0; i < list.size(); i++)
                    System.out.println("Entry " + i + " is: \n" + list.get(i) + "\n");
                System.out.println();
                System.out.print("Which entry number would you like to edit: ");
                int entryNumber = keyboard.nextInt();
                keyboard.nextLine();
                System.out.print("What parameter would you like to edit (name,phone,address,email): ");
                String editParameter = keyboard.nextLine();
                while (!(editParameter.equals("name") || editParameter.equals("phone") || editParameter.equals("address") || editParameter.equals("email")) )
                {
                    System.out.print("Please enter either 'name', 'phone', 'address', or 'email': ");
                    editParameter = keyboard.nextLine();
                }
                String edit;
                System.out.print("What would you like to change it to: ");
                if (editParameter.equals("phone")) {
                    edit = keyboard.nextLine();
                    list.get(entryNumber).setPhone(edit);
                }
                else if (editParameter.equals("name")) {
                    edit = keyboard.nextLine();
                    String[] sepName = edit.split(" ");
                    list.get(entryNumber).setFirstName(sepName[0]);
                    list.get(entryNumber).setLastName(sepName[1]);
                }
                else if (editParameter.equals("address")) {
                    edit = keyboard.nextLine();
                    list.get(entryNumber).setAddress(edit);
                }
                else if (editParameter.equals("email")) {
                    edit = keyboard.nextLine();
                    list.get(entryNumber).setEmail(edit);
                }
            }
            else if (choice == 6)
            {
                Collections.sort(list, new Comparator<book>() {
                    public int compare(book o1, book o2) {
                        return o1.lastName.compareTo(o2.lastName);
                    }
                });
            }
            else if (choice == 7)
            {
                keyboard.nextLine();
                System.out.print("What would you like to search for (name, phone, address, email): ");
                String search = keyboard.nextLine();
                if (search.equals("name"))
                {
                    System.out.print("Enter the first initial of the last Name: ");
                    char initial = keyboard.next().charAt(0);
                    System.out.println("All entries with the last initial " + initial + "\n");
                    for (int i=0; i<list.size(); i++)
                    {
                        if ((list.get(i).lastName.charAt(0)) == initial)
                            System.out.println(list.get(i));
                        System.out.println();
                    }
                }
                else if (search.equals("phone"))
                {
                    System.out.print("Enter the number you would like to search for: ");
                    String number = keyboard.nextLine();
                    System.out.println("All entries with the number " + number + "\n");
                    for (int i=0; i<list.size(); i++)
                    {
                        if (list.get(i).phone == number)
                            System.out.println(list.get(i));
                        System.out.println();
                    }
                }
                else if (search.equals("address"))
                {
                    System.out.print("Enter the address you are searching for: ");
                    String address = keyboard.nextLine();
                    System.out.println("All entries with the address " + address + "\n");
                    for (int i=0; i<list.size(); i++)
                    {
                        if (list.get(i).address.equals(address))
                            System.out.println(list.get(i));
                        System.out.println();
                    }
                }
                else if(search.equals("email"))
                {
                    System.out.print("Enter the email you are searching for: ");
                    String email = keyboard.nextLine();
                    System.out.println("All entries with the email " + email + "\n");
                    for (int i=0; i<list.size(); i++)
                    {
                        if (list.get(i).email.equals(email))
                            System.out.println(list.get(i));
                        System.out.println();
                    }
                }
            }

        }while(choice != 8);
    }
}
