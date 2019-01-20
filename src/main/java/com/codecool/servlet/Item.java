package com.codecool.servlet;

public class Item {
    private int id;
    private String name;
    private float price;

    private static int counter = 0;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public static int getCounter() {
        return counter;
    }

    public Item(String name, float price) {
        this.id = ++counter;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
