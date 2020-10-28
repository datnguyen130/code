package JAVA2.Lab_02.Ex1;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        int size;
        double sum = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("How many day's temperatures ? \t");
        size = input.nextInt();
        int[] temp = new int[size];
        for (int i =0; i<size; i ++){
            System.out.printf("Day %d's high temp: ",i);
            temp[i] = input.nextInt();
            sum += temp[i];
        }
        double average = (double) sum / size;
        System.out.println("\n Average = " + average);
        for (int i:
             temp) {
            if (i > average){
                count ++;
            }
        }
        System.out.println(count + " days above average");
    }
}
