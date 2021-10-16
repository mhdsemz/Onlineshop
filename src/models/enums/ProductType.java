package models.enums;

public enum ProductType {

    ELECTRONIC(1,"electronic"),
    SHOES(2,"shoes"),
    READABLE_ITEM(3,"readableItems"),
    UNKNOWN(4,"unknown");

    private int idProduct;
    private String name;

    ProductType(int idProduct, String name) {
        this.idProduct = idProduct;
        this.name = name;
    }

}
