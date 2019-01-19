package com.codecool.servlet;

import java.util.ArrayList;
import java.util.List;

public class ItemStore {
    public static List<Item> itemList = new ArrayList<>();

    public static void addItem(Item item) {
        int listLength = itemList.size();
        itemList.add(listLength, item);
    }

    public static void removeItem(Item item) {
        itemList.remove(item);
    }
}
