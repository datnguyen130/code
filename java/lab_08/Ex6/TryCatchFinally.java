package lab_08.Ex6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            System.out.println("Start of the main logic");
            System.out.println("Try opening a file");
            Scanner in = new Scanner(new File("test.in"));
            System.out.println("File Found, Processing the file... ");
            System.out.println("End of the main logic");
        }
        catch (FileNotFoundException ex){
            System.out.println("File not found caught...");
        }
        finally {
            System.out.println("finally block runs regardless of the state of exception");
        }
        System.out.println("after try-catch-finally, life goes on...");
    }
}
