package JAVA2.Lab_02.Ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactList {
    List<Contact> list = new ArrayList<>();
    String nameEx;
    int phoneEx;
    public void addContact(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter new contact name :");
        nameEx = input.nextLine();
        System.out.println("Enter phone number :");
        phoneEx = input.nextInt();
        boolean boo = false;
        for (int i = 0; i < list.size();i++){
            if (list.get(i).name.compareToIgnoreCase(nameEx) == 0 || list.get(i).phone == phoneEx){
                boo = true;
                break;
            }
        }
        if (boo){
            System.out.println("Already have that kind of contact in the list ! ");
        }
        else {
            list.add(new Contact(nameEx, phoneEx));
            System.out.println("New contact added: name = " + nameEx + ", phone = " + phoneEx);
        }
    }
    public void printContact(){
        Scanner input = new Scanner(System.in);
        System.out.println("Contact List :");
        for (int i = 0; i < list.size(); i++){
            System.out.println(i+1+". "+ list.get(i).name + " -> " + list.get(i).phone);
        }
    }
    public void updateContact(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter existing contact name: ");
        nameEx = input.nextLine();
        boolean boo = false;
        int index = 0;
        for (int i = 0; i < list.size();i++){
            if (list.get(i).name.compareToIgnoreCase(nameEx) == 0 ){
                boo = true;
                index = i;
                break;
            }
        }
        if (boo){
            String nameEx1 ;
            int phoneEx1;
            boolean boo1 = false;
            System.out.print("Enter new contact name: ");
            nameEx1 = input.nextLine();
            System.out.print("Enter new contact phone number: ");
            phoneEx1 = input.nextInt();
            for (int i=0; i < list.size() ; i++){
                if (list.get(i).phone == phoneEx1 && i != index){
                    boo1 = true;
                    break;
                }
            }
            if (boo1){
                System.out.println("Already have that number in the other contact!!!");
            }
            else if (!boo1){
                System.out.println(nameEx + ", was replaced with " + nameEx1);
                System.out.println("Successfully updated record.");
                list.get(index).name = nameEx1;
                list.get(index).phone = phoneEx1;
            }
        }
        else {
            System.out.println("That name does not existing in list.");
        }
    }
    public void removeContact(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter existing contact name:");
        nameEx = input.nextLine();
        boolean boo = false;
        int index = 0;
        for (int i = 0; i < list.size();i++){
            if (list.get(i).name.compareToIgnoreCase(nameEx) == 0 ){
                boo = true;
                index = i;
                break;
            }
        }
        if (boo){
            System.out.println(nameEx + ", was deleted. \n Successfully deleted.");
            list.remove(index);
        }
        else {
            System.out.println("That name does not existing in list.");
        }
    }
    public void searchContact(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter existing contact name: ");
        nameEx = input.nextLine();
        boolean boo = false;
        int index = 0;
        for (int i = 0; i < list.size();i++){
            if (list.get(i).name.compareToIgnoreCase(nameEx) == 0 ){
                boo = true;
                index = i;
                break;
            }
        }
        if (boo){
            System.out.println("Name: "+ list.get(index).name + " phone number is " + list.get(index).phone);
        }
        else {
            System.out.println("That name does not existing in list.");
        }
    }
}
