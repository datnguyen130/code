package lab_07.bookdetails;

import java.util.Scanner;

public class BookArrayTest {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);

        Book obj1 = new Book();

        do {
            System.out.println("\nWelcome to E=Repository. \n " + "Select the operation you want to perform:");
            System.out.println("***************************************************************");
            System.out.println("1. Add book");
            System.out.println("2. Search book by ISBN");
            System.out.println("3. Search book by Year");
            System.out.println("4. Display book details");
            System.out.println("5. Exit");
            System.out.println("***************************************************************");
            choice = input.nextInt();

            switch (choice){
                case 1:
                    obj1.addBook();
                    break;
                case 2:
                    obj1.searchByIsbn();
                    break;
                case 3:
                    obj1.searchByYears();
                    break;
                case 4:
                    obj1.displayBooks();
                    break;
                case 5:
                    System.out.println("Pai Pai");
                    break;
                default:
                    System.out.println("Invalid Choice ");
                    break;
            }
        } while (choice != 5);
    }
}
