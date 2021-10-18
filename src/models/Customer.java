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

    public Customer(int id, String nationalCode, String fullName, String phoneNumber, Date date, double balance, List<Product> boughtProducts) {
        this.id = id;
        this.nationalCode = nationalCode;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.date = date;
        this.balance = balance;
        this.boughtProducts = boughtProducts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getMaxiOrder() {
        return maxiOrder;
    }

    public List<Product> getBoughtProducts() {
        return boughtProducts;
    }

    public void setBoughtProducts(List<Product> boughtProducts) {
        this.boughtProducts = boughtProducts;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", nationalCode='" + nationalCode + '\'' +
                ", fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", date=" + date +
                ", balance=" + balance +
                ", maxiOrder=" + maxiOrder +
                ", boughtProducts=" + boughtProducts +
                '}';
    }
}
