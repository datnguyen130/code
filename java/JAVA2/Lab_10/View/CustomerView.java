package JAVA2.Lab_10.View;

import JAVA2.Lab_10.Object.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CustomerView {

    public Customers PreAddCustomer(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Customer ID that you want to add :");
        int idCus = input.nextInt();
        input.nextLine();
        System.out.println("Enter new Customer name :");
        String nameCus = input.nextLine();
        System.out.println("Enter new Customer email : ");
        String email = input.nextLine();
        System.out.println("Enter new Customer Address :");
        String address = input.nextLine();
        System.out.println("Enter new Customer phone : ");
        int phone = input.nextInt();
        input.nextLine();
        System.out.println("Enter new Customer Level :");
        int level = input.nextInt();
        Customers objCustomer = new Customers(idCus,nameCus,address,email,phone,level);
        return objCustomer;
    }

    public Customers PreUpdateCustomer(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Customer ID to update :");
        int idCus = input.nextInt();
        input.nextLine();
        System.out.println("Enter new Customer Email :");
        String email = input.nextLine();
        System.out.println("Enter new Customer Phone :");
        int phone = input.nextInt();
        input.nextLine();
        System.out.println("Enter new Customer level :");
        int level = input.nextInt();
        input.nextLine();
        Customers objCustomer = new Customers();
        objCustomer.setIdCus(idCus);
        objCustomer.setEmail(email);
        objCustomer.setLevel(level);
        objCustomer.setPhone(phone);
        return objCustomer;
    }

    public Customers PreDeleteCustomer(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Customer ID to delete : ");
        int id = input.nextInt();
        input.nextLine();
        Customers objCustomer = new Customers();
        objCustomer.setIdCus(id);
        return objCustomer;
    }


}
