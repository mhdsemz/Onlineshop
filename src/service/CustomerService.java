package service;

import java.util.Scanner;

public class CustomerService {
    Scanner scanner=new Scanner(System.in);

    public void register(){
        System.out.println("please enter your information here ");
        System.out.println("nationalCode :");
        int id=scanner.nextInt();
        System.out.println("fullName :");
        String name=scanner.next();
        System.out.println("phoneNumber");
        int phoneNumber=scanner.nextInt();
    }
}
