package JAVA2.Lab_10.View;

import JAVA2.Lab_09.*;

import java.util.List;
import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Controller objController = new Controller();
        objController.loadingUsers();
        objController.loadingCustomer();
        Scanner input = new Scanner(System.in);
        int choice = 1;
        int choice2 = 1;
        do {
            do {
                List<Books> listBooks = objController.loadingBooks();
                List<Bag> listBag = objController.CreateListBag(listBooks);
                int checkQty = 0;
                for (int i = 0; i< listBag.size(); i++){
                    if (listBag.get(i).getQty() != 0) {
                        checkQty = 1;
                        break;
                    }
                }
                switch (checkQty){
                    case 1:
                        Users objUer = objController.SignIn();
                        CheckOut objCheck = objController.CheckOut(objUer,listBooks,listBag);
                        objController.DisplayReview(objCheck);
                        break;
                    case 0:
                        System.out.println("You have not choose any book yet!" +
                                "\nSo you do not have any book to check out!");
                        break;
                    default:
                        System.out.println();
                }
                System.out.println("What activity that you want? Choose it :");
                System.out.println("1. Go back to Shop for shopping");
                System.out.println("2. Go to MENU to Sign up / Sign in");
                choice2 = input.nextInt();
                switch (choice2){
                    case 1:
                        System.out.println("Welcome back for shopping");
                        break;
                    case 2:
                        System.out.println("Welcome to MENU");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            } while (choice2 != 2);

            System.out.println("===============================================");
            System.out.println("||   1. SIGN UP FOR FREE                     ||");
            System.out.println("||   2. ALREADY HAVE ACCOUNT, SIGN IN !      ||");
            System.out.println("||   0. EXIT                                 ||");
            System.out.println("===============================================");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("SIGN UP");
                    if (objController.SignUp(objController.PreSignUp())){
                        System.out.println("Sign up successfully ! Please Sign in !");
                    } else {
                        System.out.println("Try Again!!!");
                    }
                    break;
                case 2:
                    System.out.println("SIGN IN");
                    Users objUser = objController.SignIn();
                    objController.checkUser(objUser);
                    break;
                case 0 :
                    System.out.println("Pai Pai!!!");
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }while (choice != 0);

    }

}
