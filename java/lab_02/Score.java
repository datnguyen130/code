package lab_02;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        int Math1, Science1, Enlish1, Math2, Science2, Enlish2, Per1, Per2 ,Total1, Total2;
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter Math1 : ");
        Math1 = scan.nextInt();
        System.out.printf(" \nEnter Science1 : ");
        Science1 = scan.nextInt();
        System.out.printf("\n Enter English1 : ");
        Enlish1 = scan.nextInt();

        Total1 = (Math1 + Science1 + Enlish1);
        Per1 = Total1 * 100 / 300;

        System.out.println("\nTotal Mark1 = " + Total1 );
        System.out.println( Per1 );


        System.out.print("\nSchoolarshio Amoun tfor Mark1 = $");
        System.out.println(Per1 > 75? 2000 : (Per1<=75 && Per1>=60)? 1000 : 0);
    }
}
