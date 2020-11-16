package JAVA2.Lab_10.View;

import JAVA2.Lab_10.Controller.UserController;
import JAVA2.Lab_10.Object.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserView {
    public Users PreSignUp(List<Users> listUsers){
        Scanner input = new Scanner(System.in);
        boolean valid  = false;
        String name = null;
        int role = 2;
        String password = null;
        do {
            System.out.println("Enter new UserName : ");
            name = input.nextLine();
            for (int i = 0; i< listUsers.size(); i++){
                if (listUsers.get(i).getUserName().equals(name)) {
                    System.out.println("Already had this user name!!! Please try the other name.");
                    valid = false;
                    break;
                }else {
                    valid = true;
                }
            }

        } while (!valid);
        System.out.println("Enter password :");
        password = input.nextLine();
        Users obj = new Users(name,password,role);
        return obj;
    }

    public Users PreSignIn(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your UserName to LogIn : ");
        String name = input.nextLine();
        System.out.println("Enter your PassWord to Login : ");
        String pass = input.nextLine();
        Users objUser = new Users();
        objUser.setUserName(name);
        objUser.setPassword(pass);
        return objUser;
    }
}
