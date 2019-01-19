package com.codecool.servlet;

public class Item {
    private int id;
    private String name;
    private float price;

    private static int counter;

    public Item(int id, String name, float price) {
        this.id = ++counter;
        this.name = name;
        this.price = price;
    }
}
