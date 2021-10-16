package models;

import java.sql.Date;
import java.util.List;

public class Customer {

    private int id;
    private String nationalCode;
    private String fullName;
    private String phoneNumber;
    private Date date;
    private double balance;
    private final int maxiOrder = 5;
    private List<Product> boughtProducts;




}
