package session1;

import java.util.Scanner;

public class code_snippet_4_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        if (num % 3 == 0){
            System.out.println("Inside Outer if Block");
            if (num % 5 == 0){
                System.out.println("Number is divisible by 3 and 5");  }
                else {
                    System.out.println(" Numbe ris divisible by 3 but not by 5");
                }
        }
        else{
            System.out.println("Numbe ris not divisible by 3");
        }

    }
}
