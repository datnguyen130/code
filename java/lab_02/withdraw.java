package lab_02;

import java.util.Scanner;

public class withdraw {
    public static void main(String[] args) {
        double accountBalance = 10000.00;
        double withdraw = 0.00;
        double possible = 0;
        System.out.println("Enter the number : ");
        Scanner input = new Scanner(System.in);
        withdraw = input.nextDouble();
        if (withdraw <= accountBalance){
            possible = accountBalance - withdraw;
            System.out.println("Current account balance : " + possible);
            System.out.println("Transaction Successful : True " );
        }
        else {
            System.out.println("Current account balance : " + accountBalance);
            System.out.println(" false");
        }
    }
}
