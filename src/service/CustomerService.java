package service;

import dao.CustomerDao;
import models.Customer;

import java.sql.SQLException;
import java.util.Scanner;

public class CustomerService {
    Scanner scanner = new Scanner(System.in);
    CustomerDao customerDao = new CustomerDao();


    public void register() {
        System.out.println("please enter your information here ");
        System.out.println("nationalCode :");
        int id = scanner.nextInt();
        System.out.println("fullName :");
        String name = scanner.next();
        System.out.println("phoneNumber");
        int phoneNumber = scanner.nextInt();
    }

    public void addNewCustomer(Customer customer) throws SQLException {
        customerDao.creat(customer);
    }

}
