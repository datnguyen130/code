package JAVA2.Lab_02.Ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactList obj = new ContactList();
        System.out.println("Starting phone... \n");
        Scanner input = new Scanner(System.in);
        int choice;

        System.out.println("Available actions: \n Press");
        System.out.println("0  - to shutdown");
        System.out.println("1  - to print contacts");
        System.out.println("2  - to add a new contact");
        System.out.println("3  - to update existing an existing contact");
        System.out.println("4  - to remove an existing contact");
        System.out.println("5  - to query if an contact exists");
        System.out.println("6  - to print a list of available actions.");
        System.out.println("Choose your action: ");
        System.out.println("Enter action: (6 to show available actions)");
        do {
            choice = input.nextInt();
            switch (choice){
                case 1:
                    obj.printContact();
                    System.out.println("\nEnter action: (6 to show available actions)");
                    break;
                case 2:
                    obj.addContact();
                    System.out.println("\nEnter action: (6 to show available actions)");
                    break;
                case 3:
                    obj.updateContact();
                    System.out.println("\nEnter action: (6 to show available actions)");
                    break;
                case 4:
                    obj.removeContact();
                    System.out.println("\nEnter action: (6 to show available actions)");
                    break;
                case 5:
                    obj.searchContact();
                    System.out.println("\nEnter action: (6 to show available actions)");
                    break;
                case 6:
                    System.out.println("Available actions: \n Press");
                    System.out.println("0  - to shutdown");
                    System.out.println("1  - to print contacts");
                    System.out.println("2  - to add a new contact");
                    System.out.println("3  - to update existing an existing contact");
                    System.out.println("4  - to remove an existing contact");
                    System.out.println("5  - to query if an contact exists");
                    System.out.println("6  - to print a list of available actions.");
                    System.out.println("Choose your action: ");
                    System.out.println("Enter action: (6 to show available actions)");
                    break;
                default:
                    System.out.println("Invalid Choice! ");
                    break;
            }
        }while (choice != 0);

    }
}
