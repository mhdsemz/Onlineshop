package models;

import service.CustomerService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        CustomerService customerService=new CustomerService();
        System.out.println("***WELCOME TO MOHI ONLINE SHOP***");
        System.out.println("please first register ");
        customerService.register();
        int choice;
        choice:
        do {
           showMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:

                    printStar();
                    break;

                case 2:

                    printStar();
                    break;

                case 3:

                    printStar();
                    break;

                case 4:

                    printStar();
                    break;
            }
        } while (true);
    }
    public static void showMenu(){
        System.out.println("choose from below:\n" +
                "1.Add product to cart  \n" +
                "2.Remove product from cart  \n" +
                "3.Show a list of products with details \n" +
                "4.Show the total prices cart  \n" +
                "your choice is:");
    }
    public static void printStar() {
        System.out.println("**********************************************************");
    }
}
