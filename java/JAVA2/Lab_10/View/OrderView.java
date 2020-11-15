package JAVA2.Lab_10.View;

import JAVA2.Lab_10.Object.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderView {
    Scanner input = new Scanner(System.in);

    public Order PreAddOrder(){
        System.out.println("Enter new ID Order :");
        int idOrder = input.nextInt();
        input.nextLine();
        System.out.println("Enter ID Customer :");
        int idCustomer = input.nextInt();
        input.nextLine();
        System.out.println("Enter Status of Order :");
        int status = input.nextInt();
        input.nextLine();
        System.out.println("Enter Total Money :");
        double total = input.nextDouble();
        input.nextLine();
        System.out.println("Day Order Default is today !");
        String timeOrder = "CURRENT_DATE()";
        Order objOrder = new Order(idOrder, idCustomer, status, total, timeOrder );
        return objOrder;
    }

    public Order PreDeleteOrder(){
        System.out.println("Enter Order that you want to delete :");
        int id = input.nextInt();
        input.nextLine();
        Order objOrder = new Order();
        objOrder.setIdOrder(id);
        return objOrder;
    }

    public Order PreUpdateOrder(){
        System.out.println("Enter the Order ID that you want to Update :");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Enter new Status of Order : ");
        System.out.println("Status must in (1,2,3,4,5)");
        int status = input.nextInt();
        input.nextLine();
        System.out.println("Enter new Total money :");
        double total = input.nextDouble();
        input.nextLine();
        Order objOrder = new Order(id,0,status,total,null);
        return objOrder;
    }

}
