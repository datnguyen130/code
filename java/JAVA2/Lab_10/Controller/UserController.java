package JAVA2.Lab_10.Controller;

import JAVA2.Lab_10.Object.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserController {
    List<Users> listUser = new ArrayList<>();

    public List<Users> loadingUsers(){
        try (Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
             Statement stmt = conn.createStatement()){

            ResultSet rset = stmt.executeQuery("select * from Users");
            while (rset.next()){
                int id = rset.getInt("IdUser");
                String userName = rset.getString("Username");
                String password = rset.getString("Password");
                int role = rset.getInt("Role");
                String created = rset.getString("Created");
                String updated = rset.getString("Updated");

                Users obj = new Users(id,userName,password,role,created,updated);
                listUser.add(obj);


            }
        } catch (SQLException ex){
            ex.printStackTrace();
        }
        return  listUser;
    }

    public boolean SignUp(Users user, Customers customer){
        try (Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
             Statement stmt = conn.createStatement()){
            try {
                int idUser = -1;
                conn.setAutoCommit(false);
                String signup = "insert into Users(Username,Password,Role,Created) values('"+user.getUserName()+"','"+user.getPassword()+"',"+user.getRole()+", "+ "CURRENT_DATE()"+")";
                int countInsert = stmt.executeUpdate(signup);
                ResultSet rset = stmt.executeQuery("select max(IdUser) AS idnew from Users");
                while (rset.next()){
                    idUser = rset.getInt("idnew");
                }
                String strAddCustomer = "INSERT INTO Customer(IdCus, NameCus, Address, Email, Phone, level, Created) VALUES (" +
                        idUser + ", '" + customer.getNameCus() +"' , '"+ customer.getAddress()+ "' , '" +
                        customer.getEmail()+ "' , " + customer.getPhone()+ ", 1, CURRENT_DATE())";
                countInsert = stmt.executeUpdate(strAddCustomer);
                conn.commit();
                loadingUsers();
                return true;
            }catch (SQLException ex){
                ex.printStackTrace();
                return false;
            }

        }catch (SQLException ex){
            ex.printStackTrace();
            return false;
        }
    }

    public Users SignIn(Users objUser){
        Users obj = new Users();
        try (Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
             Statement stmt = conn.createStatement()){
            String signIn = "SELECT * FROM Users WHERE Username = '" + objUser.getUserName() + "' AND Password = '" + objUser.getPassword() + "'";
            ResultSet rset = stmt.executeQuery(signIn);

            if (rset.next()){
                int id = rset.getInt("IdUser");
                String userName = rset.getString("Username");
                String password = rset.getString("Password");
                int role = rset.getInt("Role");
                String created = rset.getString("Created");
                String updated = rset.getString("Updated");
                obj.setUser(id,userName,password,role,created,updated);
            }
            else {
                System.out.println("Invalid Username or Password");
            }
        } catch (SQLException ex){
            ex.printStackTrace();
        }
        return obj;
    }


}
