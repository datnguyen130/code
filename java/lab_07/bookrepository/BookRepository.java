package lab_07.bookrepository;

import java.util.Scanner;

public class BookRepository {
    Book[] books;
    byte bookCount ;
    public BookRepository(){
        this.books = new Book[5];
        for (int i =0; i < books.length; i++){
            books[i] = new Book();
        }
        this.bookCount = 0;
    }
    public void addBook() {
        Scanner input = new Scanner(System.in);
        if (bookCount < books.length) {
            System.out.println("Enter book name: ");
            books[bookCount].name = input.nextLine();
            System.out.println("Enter author name: ");
            books[bookCount].authorName = input.nextLine();
            System.out.println("Enter book price: ");
            books[bookCount].price = input.nextFloat();
            System.out.println("Enter ISBN od the book:");
            books[bookCount].isbn = input.nextInt();
            System.out.println("Enter year of publication:");
            books[bookCount].yearPublished = input.nextShort();
            bookCount++;
        } else {
            System.out.println("Sorry! unable to add more books.\n");
        }
    }

    public void searchByBookName(){
        System.out.println("Enter a book name to search for: ");
        Scanner input = new Scanner(System.in);
        String nameFind = input.nextLine();
        boolean Found = false;
        if (bookCount > 0){
            System.out.println("ISBN \t\t Book Name \t\t\t\t Author Name \t\t\t\t Price($) \t\t Year of Publication");
            System.out.println("____________________________________________________________________________________________________________________________________________");
            for (int index = 0; index < bookCount; index++){
                if (books[index].name == nameFind){
                    System.out.printf("%d \t\t ",books[index].isbn);
                    System.out.printf("%s \t\t\t\t",books[index].name);
                    System.out.printf("%s \t\t\t\t",books[index].authorName);
                    System.out.printf("%.2f \t\t",books[index].price);
                    System.out.printf("%d \t\t",books[index].yearPublished);
                    Found = true;
                }
            }
            if (!Found){
                System.out.println("No data about this book name!");
            }
        } else {
            System.out.println("The system is empty!");
        }
    }

    public void displayBooks(){
        if (bookCount >0 ) {
            System.out.println("ISBN \t\t Book Name \t\t\t\t Author Name \t\t\t\t Price($) \t\t Year of Publication");
            System.out.println("____________________________________________________________________________________________________________________________________________");
            for (int index = 0; index < bookCount; index++) {
                System.out.printf("%d \t\t\t ", books[index].isbn);
                System.out.printf("%s \t\t\t\t", books[index].name);
                System.out.printf("%s \t\t\t\t\t    ", books[index].authorName);
                System.out.printf("%.2f \t\t\t", books[index].price);
                System.out.printf("%d \t\t \n", books[index].yearPublished);

            }
        } else {
            System.out.println("The system is empty! ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        BookRepository obj1 = new BookRepository();
        do {
            System.out.println("\n Welcome to E-Repository.");
            System.out.println("Select the operation that you want to perform:");
            System.out.println("***********************************************************");
            System.out.println("1. Add book");
            System.out.println("2. Search book by name");
            System.out.println("3. Display all books");
            System.out.println("4. Exit");
            System.out.println("***********************************************************");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    obj1.addBook();
                    break;
                case 2:
                    obj1.searchByBookName();
                    break;
                case 3:
                    obj1.displayBooks();
                    break;
                case 4:
                    System.out.println("Thanks kiu!!!");
                    break;
                default:
                    System.out.println("Invalid Choice ");
                    break;
            }
        }while (choice != 4);

        System.out.println(obj1.toString());
    }
}
