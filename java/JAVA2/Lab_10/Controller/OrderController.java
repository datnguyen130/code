package JAVA2.Lab_10.Controller;

import JAVA2.Lab_10.Object.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class OrderController {
    Scanner input = new Scanner(System.in);
    List<Order> listOrders = new ArrayList<>();
    List<OrderDetail> listOrderDetail = new ArrayList<>();

    public List<Order> loadingOrders(){
        try (Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
             Statement stmt = conn.createStatement()){
            ResultSet rset = stmt.executeQuery("select * from Orders");
            listOrders.clear();
            while (rset.next()){
                int idOrder = rset.getInt("IdOrders");
                int idCus = rset.getInt("IdCus");
                int status = rset.getInt("Status");
                double total = rset.getDouble("Total");
                String timeOrder = rset.getString("TimeOrder");
                Order objOrder = new Order(idOrder, idCus,status, total, timeOrder);
                listOrders.add(objOrder);
                }
            } catch (SQLException ex){
            ex.printStackTrace();
        }
        return listOrders;
    }

    public List<OrderDetail> loadingOrderDetail(){
        try (Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
             Statement stmt = conn.createStatement()){
            ResultSet rset = stmt.executeQuery("select * from OrderDetail");
            listOrderDetail.clear();
            while (rset.next()){
                int idOrder = rset.getInt("IdOrder");
                int idBook = rset.getInt("IdBook");
                int qty = rset.getInt("Qty");
                double price = rset.getDouble("Price");
                OrderDetail objOrderDetail = new OrderDetail(idOrder,idBook,qty,price);
                listOrderDetail.add(objOrderDetail);
            }
        }catch (SQLException ex){
            ex.printStackTrace();}
        return listOrderDetail;
    }

    public boolean AddOrder(Order objOrder){
        try (Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
             Statement stmt = conn.createStatement()){
            String addOrder = "INSERT INTO Orders( IdOrders,IdCus, Status, Total, TimeOrder, Created)\n" +
                    "VALUES (" + objOrder.getIdOrder()+ ", " + objOrder.getIdCus() + ", " + objOrder.getStatus()+ ", " + objOrder.getTotal()+ ", " + objOrder.getTimeOrder()+ ", CURRENT_DATE());";
            int countAdd = stmt.executeUpdate(addOrder);
            loadingOrders();
            return true;
        }
        catch (SQLException ex){
            ex.printStackTrace();
            return false;
        }
    }

    public int UpdateOrder(Order objOrder){
        try (Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
             Statement stmt = conn.createStatement()){
            String strUpdate = "update Orders set Status = " + objOrder.getStatus() + ", Total = " + objOrder.getTotal() + " where IdOrders = " + objOrder.getIdOrder();
            int countUpdate = stmt.executeUpdate(strUpdate);
            if (countUpdate == 0){
                return 0;
            }
            else {
                loadingOrders();
                return 1;

            }
        }catch (SQLException ex){
            ex.printStackTrace();
            return -1;
        }
    }

    public int DeleteOrder(Order objOrder) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/libary", "root", "");
             Statement stmt = conn.createStatement()) {
            String strDeleteOrder = "DELETE FROM Orders WHERE IdOrders = " + objOrder.getIdOrder();
            String strDeleteOrderDetail = "DELETE FROM OrderDetail WHERE IdOrder =  " + objOrder.getIdOrder();
            int countDeleteOrder = stmt.executeUpdate(strDeleteOrder);
            int countDeleteOrderDetail = stmt.executeUpdate(strDeleteOrderDetail);
            if (countDeleteOrder == 0) {
                return 0;
            } else {
                loadingOrders();
                return 1;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return -1;
        }
    }

    public void DisplayAllOrders (List<Order> listOrders){
        System.out.printf("%-30s%-30s%-30s%-30s%-30s\n","idOrder","idCus","status","total","timeOrder");
        for (int i = 0 ; i < listOrders.size(); i++){
            System.out.println(listOrders.get(i).toString());
        }
    }

    public void DisplayAllOrderDetails(List<OrderDetail> listOrderDetail){
        System.out.printf("%-30s%-30s%-30s%-30s\n","idOrder","idBook","qty","price");
        for (int i = 0 ; i < listOrderDetail.size(); i++){
            System.out.println(listOrderDetail.get(i).toString());
        }
    }

    public void DisplayOrderByIdUser(Users objUser, List<Order> listOrders ){

        System.out.println("This is all your Orders : ");
        System.out.printf("%-30s%-30s%-30s%-30s%-30s\n","idOrder","idCus","status","total","timeOrder");
        for (int i = 0 ; i < listOrders.size(); i++){
            if (listOrders.get(i).getIdCus() == objUser.getId()){
                System.out.println(listOrders.get(i).toString());
            }
        }
    }

    public void DisplayOrderDetailByIdOrder(Users objUser, List<Order> listOrders, List<OrderDetail> listOrderDetail){
        System.out.println("Enter the Order ID that you want to view :");
        int idOrder = input.nextInt();
        input.nextLine();
        System.out.printf("%-30s%-30s%-30s%-30s\n","idOrder","idBook","qty","price");
        for (int i = 0; i < listOrderDetail.size(); i++){
            for (int j = 0; j < listOrders.size(); j++){
                if (listOrderDetail.get(i).getIdOrder() == idOrder & listOrders.get(j).getIdCus() == objUser.getId()
                & listOrders.get(j).getIdOrder() == idOrder){
                    System.out.println(listOrderDetail.get(i).toString());
                }
            }
        }
    }
}

