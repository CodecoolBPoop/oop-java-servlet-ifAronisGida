package com.codecool.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

@WebServlet (name = "Shopping Cart", urlPatterns = {"/shoppingCart"})
public class ShoppingCartServlet extends HttpServlet {

    public static List<Item> shoppingCartList = new ArrayList<>();

    public static void addToCart(int id) {
        int listSize = shoppingCartList.size();
        for (Item item: ItemStore.itemList) {
            if (item.getId() == id) {
                shoppingCartList.add(listSize, item);
            }
        }
        for (Item item: shoppingCartList) {
            System.out.println(item.toString());
        }
    }

    public static void removeFromCart(int id) {
        for (Item item: ItemStore.itemList) {
            if (item.getId() == id) {
                shoppingCartList.remove(item);
            }
        }
    }
}
