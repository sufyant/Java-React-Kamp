package Entities;

public class Game {
    private String id;
    private String name;
    private String detail;
    private int price;
    static  int numberOfSales;

    public Game(String id, String name, String detail, int price) {
        this.id = id;
        this.name = name;
        this.detail = detail;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberOfSales() {
        return numberOfSales;
    }

    public void increaseNumberOfSales() {
        Game.numberOfSales++;
    }

    public void decreaseNumberOfSales() {
        Game.numberOfSales--;
    }
}