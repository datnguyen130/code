package JAVA2.Lab_05;

import JAVA2.Lab_01.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GiftController {
    static List<Gift> listGift = new ArrayList<>();
    public static void selectGift(){
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root","");
            Statement stmt = conn.createStatement();
        ){
            listGift.removeAll(listGift);
            int giftNumber = 0;
            ResultSet rset = stmt.executeQuery("select * from books");
            ResultSetMetaData rsetMD = rset.getMetaData();
            int numColums = rsetMD.getColumnCount();
            for (int i =1; i <= numColums; i++){
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();
            while (rset.next()){
                Gift obj = new Gift();
                int id = rset.getInt("id");
                String title = rset.getString("title");
                String author = rset.getString("author");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                obj.setId(id);
                obj.setTitle(title);
                obj.setAuthor(author);
                obj.setPrice(price);
                obj.setQty(qty);
                listGift.add(giftNumber,obj);
               System.out.printf("%-30d %-30s %-30s %-30.2f %-30d \n", listGift.get(giftNumber).id, listGift.get(giftNumber).title, listGift.get(giftNumber).author, listGift.get(giftNumber).price, listGift.get(giftNumber).qty);
                giftNumber ++;
            }
            System.out.println("You have " + giftNumber + " record(s)");
            System.out.println("Size ListGift : " + listGift.size());
            System.out.println();
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public static void insertGift(){
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
            Gift obj = new Gift(id,titleBook,author,price,qty);
            listGift.add(obj);
            String sqlInsert = "insert into books values (" + id + ", '" +titleBook+ "', '"+ author +"'," +price+ "," +qty+ ")";
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");
            System.out.println("Size ListGift : " + listGift.size());
            System.out.println();

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
            if (countDeleted == 0){
                System.out.println("This ID does not exists!!!");
            }
            for (int i =0; i<listGift.size(); i++){
                if (listGift.get(i).id == id){
                    listGift.remove(i);
                    break;
                }
            }
            System.out.println("Size ListGift : " + listGift.size());
            System.out.println();

        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
