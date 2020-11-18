package JAVA2.Exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Controller objController = new Controller();
        List<student> listStudent = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int choice = 0;
        System.out.println("Welcome to school management ");
        do {
            System.out.println("Enter your choice :");
            System.out.println("1. Add student records");
            System.out.println("2. Display student records");
            System.out.println("3. Save to SQL");
            System.out.println("4. Exit");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                   listStudent = objController.addStudent();
                    break;
                case 2:
                    objController.display(listStudent);
                    break;
                case 3:
                    if (objController.insertStudent(listStudent)) {
                        System.out.println("Save success!!!");
                    } else {
                        System.out.println("Save failed!!!");
                    }
                    break;
                case 4:
                    System.out.println("Pai pai");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 4);
    }
}
