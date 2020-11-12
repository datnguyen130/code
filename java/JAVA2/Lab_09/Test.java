package JAVA2.Lab_09;

import java.sql.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        try (
                Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
                Statement stmt = conn.createStatement();
        ){
            try {

                conn.setAutoCommit(false);
                int idOrder ;
                int id =9999;

                stmt.addBatch("INSERT INTO Orders(IdCus, Status, Total, TimeOrder, Created)\n" +
                        " VALUES ( " + id +" , 1, " + 99999 +
                        " , CURRENT_DATE() , CURRENT_DATE())");

                ResultSet rset = stmt.executeQuery("select max(IdOrders) AS idnew from orders");
                while (rset.next()){
                    idOrder = rset.getInt("idnew");
                }

                  stmt.executeBatch();
                System.out.println("updated");
//                System.out.println("Updated books");
//                stmt.addBatch("INSERT INTO Orders(IdCus, Status, Total, TimeOrder, Created)\n" +
//                        " VALUES ( " + objUser.getId()+" , 1, " + totalCash +
//                        " , CURRENT_DATE() , CURRENT_DATE())");
//                System.out.println("inserted Orders");
//                ResultSet rset = stmt.executeQuery("select max(IdOrders) AS idnew from orders");
//                while (rset.next()){
//                    idOrder = rset.getInt("idnew");
//                }
//                System.out.println("take new IdOrders");
//                for (int i = 0; i < listBag.size(); i++){
//                    String strInsertOrderDetail = "INSERT INTO OrderDetail(IdOrder, IdBook, Qty, Price, Created) VALUES " +
//                            "("+idOrder+" , "+listBag.get(i).getIdBook()+" , "+listBag.get(i).getQty()+
//                            " , "+listBag.get(i).getPrice()+" , CURRENT_DATE())";
//                    stmt.addBatch(strInsertOrderDetail);
//                }
//                System.out.println("Inserted orderDetails");
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
    }
}
