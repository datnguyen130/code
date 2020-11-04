package JAVA2.Lab_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import JAVA2.Lab_05.GiftController;
public class GiftShop extends GiftController {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("1. Select All Books\n" +
                    "2. Insert A Book\n" +
                    "3. Delete A Book By ID\n");
            System.out.println("Enter choice : ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    selectGift();
                    break;
                case 2:
                    insertGift();
                    break;
                case 3:
                    deleteBookWithId();
                    break;
                case 0:
                    System.out.println("tks");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while (choice!=0);
    }


}
