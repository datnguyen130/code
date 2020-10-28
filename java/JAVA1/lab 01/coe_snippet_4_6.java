package session1;

import java.util.Scanner;

public class coe_snippet_4_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number interger from 1 to 4 : ");
        int choice = input.nextInt();
        switch (choice){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
