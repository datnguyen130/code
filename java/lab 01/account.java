package session1;

import java.util.Scanner;

public class account {
    public static void main(String[] args) {
        // declaring variables
        int accountNumber;
        double accountBalance;

        // initializing the variables
        System.out.println("Enter the details for the new Account to be create:");
        System.out.println("Enter the Account Number:");
        Scanner scan = new Scanner(System.in);
        accountNumber = scan.nextInt();
        System.out.println("Enter the Account Balance:");
        accountBalance = scan.nextDouble();


    }
}
