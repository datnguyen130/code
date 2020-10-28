package JAVA2.Lab_02.Ex3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MoveList {
    List<String> movie = new ArrayList<>();

    public void addMovie(){
        Scanner input = new Scanner(System.in);
        String movietemp;
        System.out.println("Add name of movie : ");
        movietemp = input.nextLine();
        if (movie.contains(movietemp)){
            System.out.println("That movie already in the movie list!!!");
        }
        else {
            movie.add(movietemp);
            System.out.println("Adding movie done !");
        }
    }

    public void printMovie(){
        System.out.println("List of movies is : ");
        movie.forEach(movietemp -> {
            System.out.println(movietemp);
        });
    }

    public void modifierMovie(){
        Scanner input = new Scanner(System.in);
        String movietemp;
        System.out.println("Enter the movie's name that you want to modifier :");
        movietemp = input.nextLine();
        if (movie.contains(movietemp)){
            movie.remove(movietemp);
            System.out.println("Enter new name for that movie that you choose : ");
            String movietemp1 = input.nextLine();
            movie.add(movietemp1);
        }
        else {
            System.out.println("The movie name that you found is not in movie list ! Please checking again!");
        }
    }
    public void deleteMovie(){
        Scanner input = new Scanner(System.in);
        String movietemp;
        System.out.println("Enter the movie that you want to remove from movie list :");
        movietemp = input.nextLine();
        if (movie.contains(movietemp)){
            movie.remove(movietemp);
            System.out.println("Remove movie from list : Done ");
        } else {
            System.out.println("That movie does not exist in movie list! ");
        }
    }
    public void searchMovie(){
        Scanner input = new Scanner(System.in);
        String movietemp;
        System.out.println("Enter the movie that you want to search : ");
        movietemp = input.nextLine();
        if (movie.contains(movietemp)){
            System.out.println("Yes! That movie in the movie list ! It is :  " + movietemp);
        }
        else {
            System.out.println("The movie that you search does not exist in movie list! ");
        }
    }

    public static void main(String[] args) {
        MoveList obj = new MoveList();
        Scanner input = new Scanner(System.in);
        int choice = 0;
        try {


        do {
            System.out.println("Welcome to favorite movie list ! \n Select the operation that you want to perform: ");
            System.out.println("***********************************************************");
            System.out.println("1. Add movie  ");
            System.out.println("2. Print movie list");
            System.out.println("3. Modifier movie name");
            System.out.println("4. Delete movie from list");
            System.out.println("5. Search movie name");
            System.out.println("6. Exit ");
            System.out.println("***********************************************************");
            choice = input.nextInt();
             switch (choice){
                case 1 :
                    obj.addMovie();
                    break;
                case 2 :
                    obj.printMovie();
                    break;
                case 3 :
                    obj.modifierMovie();
                    break;
                case 4:
                    obj.deleteMovie();
                    break;
                case 5:
                    obj.searchMovie();
                    break;
                default:
                    System.out.println("Invalid choice ");
                    break;
            }
        }while (choice != 6);

    } catch (InputMismatchException ex){
            ex.printStackTrace();
            System.out.println("Invalid type input ");

        }
    }
}
