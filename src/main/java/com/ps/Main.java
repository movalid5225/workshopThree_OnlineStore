package com.ps;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static private final Scanner userInput = new Scanner(System.in);
    static private final ArrayList<Product> inventory = new ArrayList<>();

    public static void main(String[] args) {
        loadInventory();
        displayHomeScreen();
    }


    private static void loadInventory() {
        try {
            BufferedReader buff = new BufferedReader(new FileReader("products.txt"));
            String input;

            while((input = buff.readLine()) != null){

            }
            buff.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    private static void displayHomeScreen() {
        short choice = -1;
        do {
            System.out.println("Enter a choice");
            System.out.println("1)Display products");
            System.out.println("2)Display cart");
            System.out.println("0)Exit out of application");

            while(true){
                if(userInput.hasNextShort()){
                    choice = userInput.nextShort();
                    break;
                }
                else{
                    System.out.print("Please enter a valid number: ");
                    userInput.nextLine();
                }
            }

            switch (choice) {
                case 1:
                    displayProducts();
                    break;
                case 2:
                    displayCart();
                    break;
                case 0:
                    System.out.println("Exiting the app...");
                    System.out.println("You are exited. Have a nice day");
                    break;
                default:
                    System.out.println("Please enter a number 0-2: ");
                    break;
            }
        }while(choice != 0);
    }

    private static void displayCart() {
        short choice = -1;
        do {
            for (Product product : inventory) {
                product.printProduct();
            }
            System.out.println("Please enter an option");
            System.out.println("1)Search");
            System.out.println("2)Add");
            System.out.println("0)Go back to home");

            while (true) {
                if (userInput.hasNextShort()) {
                    choice = userInput.nextShort();
                    break;
                } else {
                    System.out.print("Please enter a valid number: ");
                    userInput.nextLine();
                }
            }

            switch (choice) {
                case 1:
                    searchProducts();
                    break;
                case 2:
                    addProducts();
                    break;
                case 0:
                    System.out.println("Going back...");
                    break;
                default:
                    System.out.println("Please enter a number 0-2");
                    break;
            }
        }while(choice !=0);
    }

    private static void addProducts() {

    }

    private static void searchProducts() {

    }

    private static void displayProducts() {

    }

}