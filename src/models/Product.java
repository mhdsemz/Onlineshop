package models;

public class Product {

    private String id;
    private double price;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product(String id, double price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public Product() {
    }
}
