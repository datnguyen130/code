package JAVA2.Lab_10.Controller;

import JAVA2.Lab_10.Object.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookController {
    List<Books> listBooks = new ArrayList<>();

    public List<Books> loadingBooks(){
        try (Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
             Statement stmt = conn.createStatement()){
            ResultSet rset = stmt.executeQuery("select * from books");
            listBooks.clear();
            while (rset.next()){
                int id = rset.getInt("IdBook");
                String nameBook = rset.getString("NameBook");
                String author = rset.getString("Author");
                int year = rset.getInt("YearPushlish");
                String category = rset.getString("Category");
                double price = rset.getDouble("Price");
                int qty = rset.getInt("Qty");
                int stt = rset.getInt("Status");
                String created = rset.getString("Created");
                String updated = rset.getString("Updated");
                Books objBook = new Books(id, nameBook,author,year,category,stt,qty,price,created,updated);
                listBooks.add(objBook);
            }
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
        return listBooks;
    }


    public boolean AddBook(Books objBook){
        try (Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
             Statement stmt = conn.createStatement()){
            String addBook = "INSERT INTO books(IdBook, NameBook, Author, Qty, Price, Created) VALUES ( " + objBook.getBookID() +", '" + objBook.getTitle()
                    + "', '" + objBook.getAuthor() + "', " + objBook.getQty() + ", " + objBook.getPrice() + ",  CURRENT_DATE() )";
            int countInsert = stmt.executeUpdate(addBook);
            loadingBooks();
            return true;
        }catch (SQLException ex){
            ex.printStackTrace();
            return false;
        }
    }


    public int UpdateBook(Books objBook){

        try (Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
             Statement stmt = conn.createStatement()){
            String strUpdate = "update books set price = " + objBook.getPrice() + " , qty = "+ objBook.getQty() + " where IdBook =  " + objBook.getBookID() ;
            int countUpdate = stmt.executeUpdate(strUpdate);
            if (countUpdate == 0){
                return 0;
            }
            else {
                loadingBooks();
                return 1;

            }
        }catch (SQLException ex){
            ex.printStackTrace();
            return -1;
        }
    }


    public int DeleteBook(Books objBook){
        try (Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
             Statement stmt = conn.createStatement()){
            String strDelete = "DELETE FROM books WHERE idBook = " + objBook.getBookID() +  " and idBook NOT IN (SELECT idBook FROM orderdetail)";
            int countDeleted = stmt.executeUpdate(strDelete);
            if (countDeleted == 0) {
                return 0;
            }
            else {
                loadingBooks();
                return 1;
            }

        } catch (SQLException ex){
            ex.printStackTrace();
            return -1;
        }
    }

    public void DisplayBooks(List<Books> listBooks){
        System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s%-30s\n","bookID","title","author","category","years","price","qty");
        for (int i = 0; i < listBooks.size(); i++){
            System.out.printf(listBooks.get(i).toString());
        }
    }


}
