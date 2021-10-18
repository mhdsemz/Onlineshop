package models.enums;

public enum OrderStatus {

    WAITING(0,"waiting"),
    END(1,"end");

    private final int number;
    private final String title;

    OrderStatus(int index, String title) {
        this.number = index;
        this.title = title;
    }

    public int getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }
}

