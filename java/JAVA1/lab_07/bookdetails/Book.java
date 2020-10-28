package lab_07.bookdetails;

import java.util.Scanner;

public class Book {
    int books[][];
    byte bookCount;

    public Book(){
        books = new int[3][3];
        bookCount = 0;
    }

    public void addBook(){
        Scanner input = new Scanner(System.in);

        if (bookCount < books.length){
            System.out.println("Enter the ISBN number of the book : ");
            books[bookCount][0] = input.nextInt();

            System.out.println("Enter the number of pages in the book : ");
            books[bookCount][1] = input.nextInt();

            System.out.println("Enter the year of publication : ");
            books[bookCount][2] = input.nextInt();

            bookCount ++;
        }
        else {
            System.out.println("Sorry! unable to add more books.\n");
        }

    }

    public void displayBooks(){
        if (bookCount > 0){
            System.out.println("\n ISBN \t\tPages \t Publication Year ");
            System.out.println("_____________________________________________________");

            for (int rowIndex = 0; rowIndex<bookCount; rowIndex++){
                System.out.printf("%d\t\t", books[rowIndex][0]);
                System.out.printf("%d\t\t", books[rowIndex][1]);
                System.out.printf("%d\t\t", books[rowIndex][2]);
            }
        } else {
            System.out.println("No books to display!");
        }
    };


    public void searchByIsbn(){
        boolean bookFound = false;

        if (bookCount > 0){
            Scanner input  = new Scanner(System.in);
            System.out.println("\nEnter the ISBN number of the book you want to search for : ");
            int searchISBN = input.nextInt();
            System.out.println(" ISBN \t\tPAges \t Publication Year :");
            System.out.println("_______________________________________________");
            for (int rowIndex = 0; rowIndex < bookCount; rowIndex++){
                if (books[rowIndex][0] == searchISBN){
                    System.out.printf("%d\t\t", books[rowIndex][0]);
                    System.out.printf("%d\t\t", books[rowIndex][1]);
                    System.out.printf("%d\n", books[rowIndex][2]);
                    bookFound = true;
                    break;
                }
            }
            if (!bookFound){
                System.out.println("Book not found");
            }
        }
        else {
            System.out.println("No books to found");
        }
    };

    public void searchByYears(){
        boolean bookFound = false;

        if (bookCount > 0){
            Scanner input  = new Scanner(System.in);
            System.out.println("\nEnter the publication year of the book you want to search for : ");
            int searchYear = input.nextInt();
            System.out.println(" ISBN \t\tPAges \t Publication Year :");
            System.out.println("_______________________________________________");
            for (int rowIndex = 0; rowIndex < bookCount; rowIndex++){
                if (books[rowIndex][2] == searchYear){
                    System.out.printf("%d\t\t", books[rowIndex][0]);
                    System.out.printf("%d\t\t", books[rowIndex][1]);
                    System.out.printf("%d\n", books[rowIndex][2]);
                    bookFound = true;
                    break;
                }
            }
            if (!bookFound){
                System.out.println("Book not found");
            }
        }
        else {
            System.out.println("No books to found");
        }
    };


}
