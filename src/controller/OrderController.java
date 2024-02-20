package controller;

import db.DBConnection;
import model.Order;
import model.OrderList;

import java.util.*;

public class OrderController {
    public static controller.OrderController OrderController;

    public static double burgerPrice = 500;
    public static String generateCustomerId() {
        return "C001";
    }

    public static String generateOrderId() {
        return "O001";
    }

//    public static Order[] toArray() {
//        return Order[];
//    }
}
