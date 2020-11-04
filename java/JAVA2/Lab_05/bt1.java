package JAVA2.Lab_05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class bt1 {
    public static void deleteIdOver8000 (){
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root","");
            Statement stmt = conn.createStatement();
        ){
            String sqlDelete = "delete from books where id > 3000 and id < 4000 ";
            int countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted + " records deleted. \n");
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    public static void insertTwoRecords (){
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root","");
            Statement stmt = conn.createStatement();
        ){
            String sqlInsert = "insert into books values (8001, 'Java Core', 'Dang Kim Thi', 15.55, 55), (8002, 'Java Advanced', 'James Gosling', 25.55, 55)";
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    public static void insertOneBook(){
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root","");
            Statement stmt = conn.createStatement();
        ){
            String sqlInsert = "insert into books(id, title, author) values (2001,'Java JDBC MySQL', 'ThiDK')";
            System.out.printf("The SQL statement is: " + sqlInsert+ "\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted. \n");

        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    public static void deleteBookWithId(){
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root","");
            Statement stmt = conn.createStatement();
        ){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter ID Book that you want to delete : ");
            int id = input.nextInt();
            String sqlDelete = "delete from books where id =  " + id;
            int countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted + " records deleted. \n");
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    public static void insertBookByUser(){
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root","");
            Statement stmt = conn.createStatement();
        ){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter ID Book that you want to insert :");
            int id = Integer.parseInt(input.nextLine());
            System.out.println("Enter Title Book that you want to insert :");
            String titleBook = input.nextLine();
            System.out.println("Enter Author that you want to insert : ");
            String author = input.nextLine();
            System.out.println("Enter Price that you want to insert :");
            double price = Double.parseDouble(input.nextLine());
            System.out.println("Enter Qty that you want to insert : ");
            int qty = Integer.parseInt(input.nextLine());
            String sqlInsert = "insert into books values (" + id + ", '" +titleBook+ "', '"+ author +"'," +price+ "," +qty+ ")";
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {


      insertBookByUser();

    }
}
