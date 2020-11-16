package JAVA2.Lab_10.Controller;

import JAVA2.Lab_10.Object.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CustomerController {
    List<Customers> listCuscomers = new ArrayList<>();

    public List<Customers> loadingCustomer(){
        try (Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
             Statement stmt = conn.createStatement()){
            ResultSet rset = stmt.executeQuery("SELECT * FROM customer");
            while (rset.next()){
                int idCus = rset.getInt("IdCus");
                String nameCus = rset.getString("NameCus");
                String address = rset.getString("Address");
                String email = rset.getString("Email");
                int phone = rset.getInt("Phone");
                int level = rset.getInt("level");
                Customers objCustomer = new Customers(idCus,nameCus,address,email,phone,level);
                listCuscomers.add(objCustomer);

            }
        }  catch (SQLException ex){
            ex.printStackTrace();
        }
        return listCuscomers;
    }

    public boolean AddCustomer(Customers objCustomer){
        try (Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
             Statement stmt = conn.createStatement()){
            String addCustomer = "INSERT INTO Customer (IdCus, NameCus, Address, Email, Phone, level, Created) VALUES ( " +
                    objCustomer.getIdCus() + " , '" + objCustomer.getNameCus() + "', '" + objCustomer.getAddress() + "', '" +
                    objCustomer.getEmail() + "', " + objCustomer.getPhone()+ ", " + objCustomer.getLevel() + ", CURRENT_DATE())";
            int countAdd = stmt.executeUpdate(addCustomer);
            loadingCustomer();
            return true;
        }
        catch (SQLException ex){
            ex.printStackTrace();
            return false;
        }
    }

    public int UpdateCustomer(Customers objCustomer){
        try (Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
             Statement stmt = conn.createStatement()){
            String strUpdate = "update customer set Email = '" + objCustomer.getEmail() + "', Phone = "+ objCustomer.getPhone() +", level = " + objCustomer.getLevel() + " where IdCus =  " + objCustomer.getIdCus() ;
            int countUpdate = stmt.executeUpdate(strUpdate);
            if (countUpdate == 0){
                return 0;
            }
            else {
                loadingCustomer();
                return 1;

            }
        }catch (SQLException ex){
            ex.printStackTrace();
            return -1;
        }
    }

    public int DeleteCustomer(Customers objCustomer){
        try (Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
             Statement stmt = conn.createStatement()){
            String strDelete = "DELETE FROM customer WHERE IdCus = " + objCustomer.getIdCus() +  " and IdCus NOT IN (SELECT IdCus FROM orders)";
            int countDeleted = stmt.executeUpdate(strDelete);
            if (countDeleted == 0) {
                return 0;
            }
            else {
                loadingCustomer();
                return 1;
            }

        } catch (SQLException ex){
            ex.printStackTrace();
            return -1;
        }
    }

    public void DisplayCustomer(List<Customers> obj){
        System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s\n","idCus","nameCus","address","email","phone","level");
        for (int i = 0; i < obj.size(); i++){
            System.out.println(obj.get(i).toString());
        }

    }

}
