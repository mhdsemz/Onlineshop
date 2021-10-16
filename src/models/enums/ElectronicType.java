package models.enums;

public enum ElectronicType {
    RADIO(1,"radio"),
    TELEVISION(2,"tv"),
    UNKNOWN(3,"unknown");

    private int number;
    private String name;

    ElectronicType(int number, String name) {
        this.number = number;
        this.name = name;
    }
}
