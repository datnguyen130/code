package JAVA2.Lab_10.Controller;

import JAVA2.Lab_10.Object.*;
import JAVA2.Lab_10.View.BookView;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class BagController {

    BookController objBookController = new BookController();

    BookView objBookView = new BookView();

    public void DisplayBag(List<Bag> listBag){
        System.out.printf("%-30s%-30s%-30s%-30s%-30s\n","idBook","nameBook","price","qty","discount");
        for (int i = 0; i < listBag.size(); i++){
            if (listBag.get(i).getQty() > 0){
                System.out.printf(listBag.get(i).toString());
            }

        }
    }

    public List<Bag> PreCreateBag(List<Books> listBooks){
        List<Bag> listBags = new ArrayList<>();
        for (int i = 0; i < listBooks.size() ; i ++){
            Bag objBag = new Bag(listBooks.get(i).getBookID(),listBooks.get(i).getTitle(),listBooks.get(i).getPrice(),0);
            listBags.add(i,objBag);
        }
        return listBags;
    }

    public List<Bag> CreateListBag(List<Books> listBooks){
        List<Bag> listBags = PreCreateBag(listBooks);
        System.out.println("================================");
        System.out.println("||  Welcome to Store Shopping ||");
        System.out.println("================================\n");
        char choiceIn = 'n';
        char choiceOut = 'y';
        int idChoice = 0;
        int qtyChoice = 0;
        int index = -1;
        String nameChoice = "";
        System.out.println("There are books on Shop : \n");
        objBookController.DisplayBooks(listBooks);
        do{

            Scanner input = new Scanner(System.in);
            do {
                System.out.println("Do you want to buy some books ? : ");
                System.out.println("Enter 'y' to Continue to choose book");
                System.out.println("Enter 'n' to Stop choose book" );
                choiceIn = input.next().charAt(0);
                switch (choiceIn) {
                    case 'y' -> {
                        System.out.println("Enter the ID Book that you want to buy : ");
                        idChoice = input.nextInt();
                        input.nextLine();
                        for (int i = 0; i < listBooks.size(); i++) {

                            if (listBooks.get(i).getBookID() == idChoice) {
                                if (listBags.get(i).getQty() == 0){
                                    qtyChoice = listBooks.get(i).getQty();

                                }
                                else if (listBags.get(i).getQty() != 0){
                                    qtyChoice = listBooks.get(i).getQty() - listBags.get(i).getQty();
                                }
                                nameChoice = listBooks.get(i).getTitle();
                                index = i;
                                break;

                            }
                        }
                        if (index < 0) {
                            System.out.println("You entered incorrect ID Book. Please try again");
                        } else {
                            if (qtyChoice == 0) {
                                System.out.println("The Qty of this book is zero ! Please try other Books");
                            } else {
                                System.out.println("The Qty of this book is " + qtyChoice + "\nHow many '" + nameChoice + "' book that you want to buy");
                                int qtyOrder = input.nextInt();
                                if (qtyOrder > qtyChoice ) {
                                    System.out.println("Sorry. Your choice is over the Qty of this book!\nPlease try again");
                                } else {
                                    qtyChoice -= qtyOrder;
                                    listBags.get(index).plusQty(qtyOrder);
                                    System.out.println("Thank for your good choice");
                                }
                            }
                        }
                    }
                    case 'n' -> System.out.println("Thanks you very much!!!");
                    default -> System.out.println("Invalid choice");
                }

            }  while (choiceIn != 'n' );

            System.out.println("Do you want to go to Check out step ?");
            System.out.println("Enter 'y' to go to Check out");
            System.out.println("Enter 'n' to turn back for shopping");
            choiceOut = input.next().charAt(0);
        } while (choiceIn == 'n' & choiceOut != 'y');
        return listBags;
    }

    public Customers ReturnCustomerByUser(Users objUser){
        Customers objCus = new Customers();
        try (Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
             Statement stmt = conn.createStatement()){
            String strSelect = "SELECT * FROM customer where IdCus = " + objUser.getId();
            ResultSet rset = stmt.executeQuery(strSelect);
            if (rset.next()){
                objCus.setIdCus(rset.getInt("IdCus"));
                objCus.setAddress(rset.getString("Address"));
                objCus.setEmail(rset.getString("Email"));
                objCus.setLevel(rset.getInt("level"));
                objCus.setNameCus(rset.getString("NameCus"));
                objCus.setPhone(rset.getInt("Phone"));
            }

        } catch (SQLException ex){
            ex.printStackTrace();
        }
        return objCus;
    }

    public double TotalCash (List<Bag> listBag){
        double total = 0;
        for (int i = 0; i < listBag.size(); i++){
            total += listBag.get(i).getPrice() * listBag.get(i).getQty();
        }
        return total;
    }

    public CheckOut CheckOut(Users objUser, List<Books> listBooks, List<Bag> listBag){
        // Work with SQL
        double totalCash = TotalCash(listBag);
        try (
                Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
                Statement stmt = conn.createStatement();
        ){
            try {
                int idOrder = -1;
                conn.setAutoCommit(false);
                for (int i = 0; i < listBooks.size(); i++){
                    String strUpdateBooks = "update books set qty = "+ (listBooks.get(i).getQty() - listBag.get(i).getQty()) + " where IdBook =  " + listBooks.get(i).getBookID() ;
                    stmt.addBatch(strUpdateBooks);
                }

                stmt.addBatch("INSERT INTO Orders(IdCus, Status, Total, TimeOrder, Created)\n" +
                        " VALUES ( " + objUser.getId()+" , 1, " + totalCash +
                        " , CURRENT_DATE() , CURRENT_DATE())");
                stmt.executeBatch();
                ResultSet rset = stmt.executeQuery("select max(IdOrders) AS idnew from orders");
                while (rset.next()){
                    idOrder = rset.getInt("idnew");
                }
                for (int i = 0; i < listBag.size(); i++){
                    if (listBag.get(i).getQty() == 0){
                        continue;
                    }
                    String strInsertOrderDetail = "INSERT INTO OrderDetail(IdOrder, IdBook, Qty, Price, Created) VALUES " +
                            "("+idOrder+" , "+listBag.get(i).getIdBook()+" , "+listBag.get(i).getQty()+
                            " , "+listBag.get(i).getPrice()+" , CURRENT_DATE())";
                    stmt.addBatch(strInsertOrderDetail);
                }
                stmt.executeBatch();
                conn.commit();
            } catch (SQLException ex){
                System.out.println("Update SQL failed");
                conn.rollback();
                ex.printStackTrace();
            }

        }  catch (SQLException ex){
            System.out.println("ERR SQL Exception");
            ex.printStackTrace();
        }

        // Return CheckOut Obj
        Customers objCus = ReturnCustomerByUser(objUser);
        Scanner input = new Scanner(System.in);
        int choice = 0;
        int sign = 0;
        String mail = "";
        if (objCus.getEmail() == null ){
            System.out.println("Enter email to check out :");
            mail = input.nextLine();
        }
        else {
            System.out.println("Your email is : " + objCus.getEmail());
            System.out.println("Do you want to use that email to check out or the other email ?");
            do {
                System.out.println("Choose your choice :");
                System.out.println("1. Use " + objCus.getEmail() + " to check out");
                System.out.println("2. Enter the other email to check out");
                choice = input.nextInt();
                switch (choice){
                    case 1:
                        mail = objCus.getEmail();
                        sign = 1;
                        break;
                    case 2:
                        mail = input.nextLine();
                        sign = 1;
                        break;
                    default:
                        System.out.println("invalid choice");
                }
            }while (sign != 1);
        }
        String paymentMethod = "";
        do {
            System.out.println("Choose your payment methods");
            System.out.println("1. COD method");
            System.out.println("2. Visa method");
            choice = input.nextInt();
            input.nextLine();
            switch (choice){
                case 1:
                    System.out.println("You choose COD method");
                    paymentMethod = " COD Method ";
                    sign = 2;
                    break;
                case 2:
                    System.out.println("You choose Visa method");
                    sign = 2;
                    paymentMethod = " Visa method ";
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (sign != 2);
        String addressShip = "";
        System.out.println("Enter your address that you want to ship :");
        addressShip = input.nextLine();
        return new CheckOut(listBag, mail,paymentMethod,addressShip,totalCash);
    }

    public void DisplayReview(CheckOut ObjCheck){

        System.out.println("Let Review your Bag");
        System.out.println("List Books you ordered");
        DisplayBag(ObjCheck.getListBag());
        System.out.println();
        System.out.println("The total money that you need paying is : " + ObjCheck.getPrice() );
        System.out.println("The address ship is : " + ObjCheck.getAddress());
    }
}
