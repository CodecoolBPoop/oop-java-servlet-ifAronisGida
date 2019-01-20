package com.codecool.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Webshop", urlPatterns = {"/webshop"}, loadOnStartup = 1)
public class WebshopServlet extends HttpServlet {

    @Override
    public void init() {
        ItemStore.addItem(new Item("Bible", 9999));
        ItemStore.addItem(new Item("iPhone", 10));
        ItemStore.addItem(new Item("Cocaine", 1000));
        ItemStore.addItem(new Item("appleJuice", 5000));
        ItemStore.addItem(new Item("Apple Juice", 1000));
    }

   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

       PrintWriter out = response.getWriter();
       String title = "Items to buy!!";
   }
}
