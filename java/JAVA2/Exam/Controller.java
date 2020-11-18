package JAVA2.Exam;

import JAVA1.lab_03.Student;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.Scanner;

public class Controller {


    public List<student> addStudent(){
        List<student> studentList = new ArrayList<>();
        student objStudent = new student();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Student ID to add :");
        String id = input.nextLine();
        System.out.println("Enter Student Name to add :");
        String name = input.nextLine();
        System.out.println("Enter Student address to add :");
        String address = input.nextLine();
        System.out.println("Enter Student phone to add :");
        String phone  = input.nextLine();
        objStudent = new student(id, name, address, phone);
        studentList.add(objStudent);
        System.out.println("Add successfully !!! ");
        return studentList;
    }

    public void display(List<student> studentList){
        System.out.printf("%-30s%-30s%-30s%-30s\n","Student ID ","Student name","Address","Phone");
        for (int i = 0; i < studentList.size(); i++){
            System.out.println(studentList.get(i));
        }
    }

    public boolean insertStudent(List<student> studentList){
        try (Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/class","root","");
             Statement stmt = conn.createStatement()){
                for (int i = 0; i< studentList.size(); i++){
                    String strInsert = "INSERT INTO student VALUES ('" +
                            studentList.get(i).getIdStudent() + "', ' " +
                            studentList.get(i).getName() + "', '" +
                            studentList.get(i).getAddress() + "', '" +
                            studentList.get(i).getPhone() + "')";
                    int count = stmt.executeUpdate(strInsert);
                }
                return true;
        }
        catch (SQLException ex){
            ex.printStackTrace();
            return false;
        }
    }


}
