package lab_07.bookisbn;

import java.util.Scanner;

public class Book {
    int[] isbn;

    public Book(){
        isbn = new int[5];
    }


    public void setIsbn() {
        System.out.println("Enter five ISBN numbers:");
        Scanner input = new Scanner(System.in);
        for (int index = 0; index<isbn.length; index ++){
            isbn[index] = input.nextInt();
        }
    }

    public void getIsbn() {
        System.out.println("The ISBN number of the books are:");
        for (int x =0; x< isbn.length; x++){
            System.out.println(isbn[x]);
        }
    }

    public void sortIsbn(){
        int x;
        for (int i = 0; i < isbn.length; i++){
            for (int j = i+1; j < isbn.length ; j++){
                if (isbn[i] > isbn[j]){
                    x = isbn[i];
                    isbn[i] = isbn[j];
                    isbn[j] = x;
                }
            }
        }
        getIsbn();
    }
}
