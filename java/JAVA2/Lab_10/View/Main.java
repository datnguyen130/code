package JAVA2.Lab_10.View;

import JAVA2.Lab_10.Controller.*;
import JAVA2.Lab_10.Object.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BookController objBookController = new BookController();
        CustomerController objCustomerController = new CustomerController();
        BagController objBagController = new BagController();
        UserController objUserController = new UserController();
        OrderController objOrderController = new OrderController();
        BookView objBookView = new BookView();
        CustomerView objCustomerView = new CustomerView();
        OrderView objOrderView = new OrderView();
        UserView objUserView = new UserView();
        int choice3 = 0;
        do {
            List<Books> listBooks = objBookController.loadingBooks();
            List<Customers> listCustomers = objCustomerController.loadingCustomer();
            List<Users> listUsers = objUserController.loadingUsers();
            List<Order> listOrders = objOrderController.loadingOrders();
            List<OrderDetail> listOrderDetails = objOrderController.loadingOrderDetail();
            List<Bag> listBag = new ArrayList<>();
            Users objUser = new Users();
            CheckOut objCheck = new CheckOut();
            System.out.println("============================");
            System.out.println("||  Welcome to Books Shop ||");
            System.out.println("============================\n");
            System.out.println("Choose your action : ");
            System.out.println("1. Go for Shopping Book\n" +
                    "2. Search Book by Category\n" +
                    "3. Search Book by Author\n" +
                    "4. Search Book by ID Book\n" +
                    "5. Display all Books in shop\n" +
                    "6. Display top 3 new Book\n" +
                    "7. Display top 3 best sale Book\n" +
                    "8. Go to Sign in/ Sign up\n" +
                    "0. Exit shop");
            choice3 = input.nextInt();
            switch (choice3){
                case 1:
                    int choice = 1;
                    int choice2 = 1;
                        do {
                            listBooks = objBookController.loadingBooks();
                            listCustomers = objCustomerController.loadingCustomer();
                            listUsers = objUserController.loadingUsers();
                            listOrders = objOrderController.loadingOrders();
                            listOrderDetails = objOrderController.loadingOrderDetail();
                            listBag = objBagController.CreateListBag(listBooks);
                            int checkQty = 0;
                            for (int i = 0; i< listBag.size(); i++){
                                if (listBag.get(i).getQty() != 0) {
                                    checkQty = 1;
                                    break;
                                }
                            }
                            switch (checkQty){
                                case 1:
                                    objUser = objUserController.SignIn(objUserView.PreSignIn());
                                    objCheck = objBagController.CheckOut(objUser,listBooks,listBag);
                                    objBagController.DisplayReview(objCheck);
                                    break;
                                case 0:
                                    System.out.println("You have not choose any book yet!" +
                                            "\nSo you do not have any book to check out!");
                                    break;
                                default:
                                    System.out.println();
                            }
                            System.out.println("What activities that you want? Choose it :");
                            System.out.println("1. Go back to Shop for shopping");
                            System.out.println("2. Go to MENU ");
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
                    break;
                case 2:
                    objBookView.searchByCategory();
                    break;
                case 3:
                    objBookView.searchByAuthor();
                    break;
                case 4:
                    objBookView.searchByIdBook();
                    break;
                case 5:
                    objBookController.DisplayBooks(listBooks);
                    break;
                case 6:
                    objBookView.top3NewBook();
                    break;
                case 7:
                    objBookView.top3BestSale();
                    break;
                case 8:
                    int choice5 = 0;
                    do {
                        listCustomers = objCustomerController.loadingCustomer();
                        listUsers = objUserController.loadingUsers();
                        System.out.println("===============================================");
                        System.out.println("||   1. SIGN UP FOR FREE                     ||");
                        System.out.println("||   2. ALREADY HAVE ACCOUNT, SIGN IN !      ||");
                        System.out.println("||   0. EXIT                                 ||");
                        System.out.println("===============================================");
                        choice5 = input.nextInt();
                        input.nextLine();
                        switch (choice5){
                            case 1:
                                System.out.println("SIGN UP");
                                Users objUser1 = new Users();
                                Customers objCustomer1 = new Customers();
                                objUser1 = objUserView.PreSignUp(listUsers);
                                objCustomer1 = objCustomerView.PreCreateCustomer(listCustomers);

                                if (objUserController.SignUp(objUser1,objCustomer1)){
                                    System.out.println("Sign up successfully ! Please Sign in !");
                                    objUser = new Users();
                                } else {
                                    System.out.println("Try Again!!!");
                                }
                                break;
                            case 2:
                                System.out.println("SIGN IN");
                                objUser = objUserController.SignIn(objUserView.PreSignIn());
                                int role = 0;
                                int choice4 = 0;
                                if (objUser.getRole() == 1){
                                    System.out.println("Welcome to Admin mode");
                                    do { listBooks = objBookController.loadingBooks();
                                        listCustomers = objCustomerController.loadingCustomer();
                                        listUsers = objUserController.loadingUsers();
                                        listOrders = objOrderController.loadingOrders();
                                        listOrderDetails = objOrderController.loadingOrderDetail();
                                        System.out.println("Choose your action :");
                                        System.out.println("1.  Display all Books\n" +
                                                "2.  Display all Customers\n" +
                                                "3.  Display all Orders\n" +
                                                "4.  Display all Orders Detail\n" +
                                                "5.  Add Book\n" +
                                                "6.  Update Book\n" +
                                                "7.  DeleteBooks\n" +
                                                "8.  Add Customer\n" +
                                                "9.  Update Customer\n" +
                                                "10. Delete Customer\n" +
                                                "11. Add Order\n" +
                                                "12. Update Order\n" +
                                                "13. Delete Order\n" +
                                                "0.  Exit");
                                        choice4 = input.nextInt();
                                        input.nextLine();
                                        switch (choice4){
                                            case 1:
                                                objBookController.DisplayBooks(listBooks);
                                                break;
                                            case 2:
                                                objCustomerController.DisplayCustomer(listCustomers);
                                                break;
                                            case 3:
                                                objOrderController.DisplayAllOrders(listOrders);
                                                break;
                                            case 4:
                                                objOrderController.DisplayAllOrderDetails(listOrderDetails);
                                                break;
                                            case 5:
                                                objBookController.AddBook(objBookView.PreAddBook());
                                                break;
                                            case 6:
                                                objBookController.UpdateBook(objBookView.PreUpdateBook());
                                                break;
                                            case 7:
                                                objBookController.DeleteBook(objBookView.PreDeleteBook());
                                                break;
                                            case 8:
                                                objCustomerController.AddCustomer(objCustomerView.PreAddCustomer());
                                                break;
                                            case 9:
                                                objCustomerController.UpdateCustomer(objCustomerView.PreUpdateCustomer());
                                                break;
                                            case 10:
                                                objCustomerController.DeleteCustomer(objCustomerView.PreDeleteCustomer());
                                                break;
                                            case 11:
                                                objOrderController.AddOrder(objOrderView.PreAddOrder());
                                                break;
                                            case 12:
                                                objOrderController.UpdateOrder(objOrderView.PreUpdateOrder());
                                                break;
                                            case 13:
                                                objOrderController.DeleteOrder(objOrderView.PreDeleteOrder());
                                                break;
                                            case 0:
                                                System.out.println("you Signed out!");
                                                break;
                                            default:
                                                System.out.println("invalid choice!!!");
                                        }
                                    } while (choice4 != 0);
                                }
                                else if (objUser.getRole() == 2){
                                    System.out.println("Welcome to Customer mode");
                                    do {
                                        listOrders = objOrderController.loadingOrders();
                                        listOrderDetails = objOrderController.loadingOrderDetail();
                                        System.out.println("Choose your action ");
                                        System.out.println("1. View all your Orders\n" +
                                                "2. View all your Orders Details\n" +
                                                "0. Exit");
                                        choice4 = input.nextInt();
                                        input.nextLine();
                                        switch (choice4){
                                            case 1:
                                                objOrderController.DisplayOrderByIdUser(objUser,listOrders);
                                                break;
                                            case 2:
                                                objOrderController.DisplayOrderDetailByIdOrder(objUser,listOrders,listOrderDetails);
                                                break;
                                            case 0:
                                                System.out.println("You Signed out!");
                                                break;
                                            default:
                                                System.out.println("Invalid choice!!!");
                                                break;
                                        }
                                    }while (choice4 != 0);
                                }
                                break;
                            case 0 :
                                System.out.println("Pai Pai!!!");
                                break;
                            default:
                                System.out.println("Invalid Choice");
                                break;
                        }
                    }while (choice5 != 0);
                    break;
                case 0:
                    System.out.println("Thanks for your kind !!!");
                    break;
                default:
                    System.out.println("Invalid Choice!!!");
                    break;
            }
        }while (choice3 != 0);
    }
}
