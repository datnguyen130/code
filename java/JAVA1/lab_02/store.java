package lab_02;

import java.util.Scanner;

public class store {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int shirtsQuan, trousersQuan , point;
        double shirtsPrice = 300;
        double trousersPrice = 700;
        double discount, shirtTotal, trouserTotal, netTotal, total;


        System.out.printf("Enter the number of Shirts to order : ");
        shirtsQuan = scan.nextInt();
        System.out.printf("Enter the number of Trousers to order : ");
        trousersQuan = scan.nextInt();

        shirtTotal = shirtsPrice * shirtsQuan;
        trouserTotal = trousersPrice * trousersQuan;
        total = shirtTotal + trouserTotal;
        discount = (total > 3000)? 0.1 : 0;
        netTotal = total - discount * total;
        point = (int) (netTotal / 100);

        System.out.println("Item       Quantity        Price       Total       ");
        System.out.println("______________________________________________________________");
        System.out.println("Shirts      " + shirtsQuan + "              " + (int)shirtsPrice + "       " + (int)shirtTotal );
        System.out.println("Trousers    " + trousersQuan + "             " + (int)trousersPrice + "       " + (int)trouserTotal  );
        System.out.printf("Discount                           %.2f \n" , discount * total );
        System.out.println("______________________________________________________________");
        System.out.printf("Net Total                           %09.2f\n" , netTotal );
        System.out.println("______________________________________________________________");
        System.out.println("Points Earned       " + point     );
        System.out.println("Thanks You!");
    }
}
