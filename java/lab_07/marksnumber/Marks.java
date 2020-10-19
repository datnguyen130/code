package lab_07.marksnumber;

import java.util.Scanner;

public class Marks {
    int marks[][];
    int countMark;

    public Marks(){
        marks = new int[4][4];
        countMark = 0;
    }

    public void addMarks(){
        Scanner input = new Scanner(System.in);
        if (countMark < marks.length){
            System.out.println("Enter the ID of student : ");
            marks[countMark][0] = input.nextInt();
            System.out.println("Enter the marks 1 : ");
            marks[countMark][1] = input.nextInt();
            System.out.println("Enter the marks 2 : ");
            marks[countMark][2] = input.nextInt();
            System.out.println("Enter the marks 3 : ");
            marks[countMark][3] = input.nextInt();
            countMark ++;
        }
        else {
            System.out.println("No free space in memory to add marks");
        }
    }

    public void displayMarks(){
        if (countMark > 0){
            System.out.println("Display all ID student and Marks of student :");
            System.out.println("ID \t\t\t mark1\t\t\t mark2\t\t\t mark3");
            for (int indexMark = 0; indexMark <countMark; indexMark ++){
                System.out.printf("%d \t\t\t",marks[indexMark][0]);
                System.out.printf("%d \t\t\t",marks[indexMark][1]);
                System.out.printf("%d \t\t\t",marks[indexMark][2]);
                System.out.printf("%d \n",marks[indexMark][3]);
            }
        } else {
            System.out.println("No information about ID and marks");
        }
    }

    public void findById(){
        boolean found = false;
        Scanner input = new Scanner(System.in);
        if (countMark > 0){
            System.out.println("Enter the student ID that you want to find :");
            int foundId = input.nextInt();
            for (int indexMark = 0; indexMark < countMark; indexMark++){
                if (marks[indexMark][0]==foundId){
                    System.out.println("ID \t\t\t mark1\t\t\t mark2\t\t\t mark3");
                    System.out.printf("%d \t\t\t",marks[indexMark][0]);
                    System.out.printf("%d \t\t\t",marks[indexMark][1]);
                    System.out.printf("%d \t\t\t",marks[indexMark][2]);
                    System.out.printf("%d \n",marks[indexMark][3]);
                    found = true;
                    break;
                }
            }
            if (!found){
                System.out.println("There is no ID match ...");
            }
        } else
        System.out.println("There is no information to search...");
    }
}
