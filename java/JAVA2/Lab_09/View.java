package JAVA2.Lab_09;

import java.util.List;
import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        System.out.println("Just one time for shopping and end program! We will update later :))");
        Controller objController = new Controller();
        objController.loadingUsers();
        objController.loadingCustomer();
        int choice = 1;
        Scanner input = new Scanner(System.in);
        List<Books> listBooks = objController.loadingBooks();
        ListOfBooksBag objListBooksBag = objController.CreateListBooksBag(listBooks);
        Users objUer = objController.SignIn();
        objController.DisplayReview(objUer,objListBooksBag);
        System.out.println("END! what you waiting for??? :)))");
    }

}
