package models.enums;

public enum ShoesType {

    SPORT(1,"sportShoes"),
    FORMAL(2,"formalShoes"),
    UNKNOWN(3,"unknown");


    private int number;
    private String name;

    ShoesType(int number, String name) {
        this.number = number;
        this.name = name;
    }

}
