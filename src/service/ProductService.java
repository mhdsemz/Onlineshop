package service;

import java.util.Scanner;

public class ProductService {
    Scanner scanner=new Scanner(System.in);

    public void addProduct() {
        System.out.println("please enter how many product you wanna add");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("please enter product name : ");
            String name = scanner.next();
            System.out.println("please enter price of product : ");
            int price = scanner.nextInt();


        }
    }

}
