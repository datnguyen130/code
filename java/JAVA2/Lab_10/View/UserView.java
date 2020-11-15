package JAVA2.Lab_10.View;

import JAVA2.Lab_10.Object.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserView {

    public Users PreSignUp(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter new UserName : ");
        String name = input.nextLine();
        System.out.println("Enter password :");
        String password = input.nextLine();
        int role = 2;
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
