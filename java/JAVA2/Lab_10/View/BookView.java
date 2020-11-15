package JAVA2.Lab_10.View;

import JAVA2.Lab_10.Controller.BookController;
import JAVA2.Lab_10.Object.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class BookView {

    public Books PreAddBook(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter new Book ID : ");
        int bookID = input.nextInt();
        input.nextLine();
        System.out.println("Enter new Book Name : ");
        String title = input.nextLine();
        System.out.println("Enter new Book Price :");
        double price = input.nextDouble();
        input.nextLine();
        System.out.println("Enter new book qty :");
        int qty = input.nextInt();
        input.nextLine();
        System.out.println("Enter new book author :");
        String author = input.nextLine();
        Books objBook = new Books(bookID, title, author, price,qty);
        return objBook;

    }

    public Books PreUpdateBook(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter BookID to update : ");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Enter new Price of Book :");
        double price = input.nextDouble();
        input.nextLine();
        System.out.println("Enter new Qty of Book : ");
        int qty = input.nextInt();
        input.nextLine();
        Books objBook = new Books();
        objBook.setBookID(id);
        objBook.setPrice(price);
        objBook.setQty(qty);
        return objBook;
    }

    public Books PreDeleteBook(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter BookID to delete : ");
        int id = input.nextInt();
        input.nextLine();
        Books objBook = new Books();
        objBook.setBookID(id);
        return objBook;
    }

    public void top3NewBook(){
        try (Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
             Statement stmt = conn.createStatement();) {
            String strSelect = "SELECT * FROM `books` ORDER BY YearPushlish DESC LIMIT 3";
            ResultSet sresult = stmt.executeQuery(strSelect);
            System.out.println("\n IdBook \t\t  NameBook \t\t Author \t\t YearPushlish \t\t Category \t\t Price \t\t Qty \t\t Status  ");

            while (sresult.next()){
                int idBook = sresult.getInt("IdBook");
                String nameBook = sresult.getString("NameBook");
                String author = sresult.getString("Author");
                int yearPushlish = sresult.getInt("YearPushlish");
                String category = sresult.getString("Category");
                double price = sresult.getDouble("Price");
                int qty = sresult.getInt("Qty");
                int status = sresult.getInt("Status");
                System.out.println("\n" + idBook + "\t\t\t" + nameBook + "\t\t\t" + author + "\t\t\t" + yearPushlish + "\t\t\t" + category + "\t\t\t" + price + "\t\t\t" + qty + "\t\t\t" + status + "\n");
            }
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public void top3BestSale(){
        try (Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
             Statement stmt = conn.createStatement();
        ){
            String strSelectTop3BestSale ="SELECT books.IdBook, NameBook, Category, books.Price, SUM(orderdetail.Qty) AS TotalQty FROM books INNER JOIN orderdetail ON books.IdBook = orderdetail.IdBook INNER JOIN orders ON orderdetail.IdOrder = orders.IdOrders WHERE orders.Status != 0 GROUP BY books.IdBook, NameBook, Category, books.Price ORDER BY TotalQty DESC LIMIT 3";
            ResultSet sresult = stmt.executeQuery(strSelectTop3BestSale);
            System.out.println("\n IdBook \t\t NameBook \t\t Category \t\t Price  \t\t Qty");

            while (sresult.next()){
                int idBook = sresult.getInt("books.IdBook");
                String nameBook = sresult.getString("NameBook");
                String category = sresult.getString("Category");
                Double price = sresult.getDouble("books.Price");
                int qty = sresult.getInt("TotalQty");
                System.out.println("\n" + idBook + "\t\t\t" + nameBook + "\t\t\t" + category + "\t\t\t" + price + "\t\t\t" +qty + "\n");
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public void searchByCategory(){
        try (
                Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
                Statement stmt = conn.createStatement();
        ) {
            String categorySearch = "";
            Scanner input = new Scanner(System.in);
            System.out.println("\n Enter the kind of category that you want to search : ");
            categorySearch = input.nextLine();
            String strSelect = "SELECT IdBook, NameBook, Category FROM books WHERE Category LIKE \'%" + categorySearch + "%\'" ;
            ResultSet sresult = stmt.executeQuery(strSelect);
            if ( !sresult.next()){
                System.out.println("No search found!!! " );
                System.out.println("Try again later!!! ");
            }
            else {
                System.out.println("IdBook \t\t NameBook \t\t Category");

                while (sresult.next()){
                    int id = sresult.getInt("IdBook");
                    String name = sresult.getString("NameBook");
                    String category = sresult.getString("Category");
                    System.out.println(id + "\t\t\t" + name + "\t\t\t" + category);
                }
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public void searchByAuthor(){
        try (
                Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
                Statement stmt = conn.createStatement();
        ) {
            String categorySearch = "";
            Scanner input = new Scanner(System.in);
            System.out.println("\n Enter the author's name that you want to search : ");
            categorySearch = input.nextLine();
            String strSelect = "SELECT IdBook, NameBook,Author, Category FROM books WHERE Author LIKE \'%" + categorySearch + "%\'" ;
            ResultSet sresult = stmt.executeQuery(strSelect);
            if ( !sresult.next()){
                System.out.println("No search found!!! " );
                System.out.println("Try again later!!! ");
            }
            else {
                System.out.println("\nIdBook \t\t NameBook \t\t Author \t\t Category");
                while (sresult.next()){
                    int id = sresult.getInt("IdBook");
                    String name = sresult.getString("NameBook");
                    String author = sresult.getString("Author");
                    String category = sresult.getString("Category");
                    System.out.println(id +"\t\t\t" + name + "\t\t\t" + author + "\t\t\t" + category);
                }
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public void searchByIdBook(){
        try (
                Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
                Statement stmt = conn.createStatement();
        ) {
            int idSearch = 0 ;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the ID Book that you want to search: ");
            idSearch = input.nextInt();
            String strSelect = "SELECT IdBook, NameBook, Author, Category, Price, Qty, YearPushlish  FROM books WHERE IdBook = " +  idSearch ;
            ResultSet sresult = stmt.executeQuery(strSelect);
            System.out.println("IdBook \t\t NameBook \t\t Author \t\t Category \t\t Price \t\t Qty \t\t YearPushLish");

            while (sresult.next()){
                int id = sresult.getInt("IdBook");
                String name = sresult.getString("NameBook");
                String author = sresult.getString("Author");
                String category = sresult.getString("Category");
                double price = sresult.getDouble("Price");
                int qty = sresult.getInt("Qty");
                String year = sresult.getString("YearPushlish");
                System.out.println(id + "\t\t\t" + name + "\t\t\t" + author + "\t\t\t" + category +"\t\t\t" + price + "\t\t\t" + qty + "\t\t\t" + year);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
