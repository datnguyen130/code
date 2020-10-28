package JAVA2.Lab_02.Ex2;

import java.util.Scanner;

public class Calculator {
    public int[] numbers;
    public int sum = 0;
    public Calculator(){
        this.numbers = new int[5];
    }
    public int[] intArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 integer values.");
        for (int i = 0 ; i < numbers.length; i ++ ){
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }
        return numbers;
    }
    public double getAverage(){
        return(double) sum / numbers.length;
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.intArray();
        for (int i = 0; i < obj.numbers.length; i ++){
            System.out.printf(" Element %d , typed value was %d \n",i,obj.numbers[i]);
        }
        System.out.println("average is " + obj.getAverage());
    }
}
