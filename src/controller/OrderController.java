package controller;

import db.DBConnection;
import model.Order;
import model.OrderList;

public class OrderController {
    public static controller.OrderController OrderController;
    public static final double BURGERPRICE = 500;

    private static controller.OrderController list;

    public static String generateCustomerID() {
        return "C" + String.format("%03d", DBConnection.getInstance().getOrderList().size() + 1);
    }

    public static String generateOrderID() {
        return "O" + String.format("%03d", DBConnection.getInstance().getOrderList().size() + 1);
    }

    public static boolean addOrder(Order order) {
        OrderList orderList = DBConnection.getInstance().getOrderList();
        orderList.add(order);
        return true;
    }

//    public static Order[] getBestCustomer() {
//        OrderList orderList = DBConnection.getInstance().getOrderList();
//        Order[] orderArray = orderList.toArray();
//
//        for(int i = 1; i < orderArray.length; i++) {
//            for(int j = 0; j < orderArray.length - i; j++) {
//                if(orderArray[j].calculateTotalPurchases() > orderArray[j + 1].calculateTotalPurchases()) {
//                    Order tempOrder = orderArray[j];
//                    orderArray[j] = orderArray[j + 1];
//                    orderArray[j + 1] = tempOrder;
//                }
//            }
//        }
//        return orderArray;
//    }

//    public static Order getBestCustomer() {
//        OrderList orderList = DBConnection.getInstance().getOrderList();
//        double maxTotalPurchases = 0;
//        Order bestCustomer = null;
//
//        for (Order order : orderList) {
//            double totalPurchases = order.calculateTotalPurchases(Order.getCustomerID());
//            if (totalPurchases > maxTotalPurchases) {
//                maxTotalPurchases = totalPurchases;
//                bestCustomer = order;
//            }
//        }
//
//        return bestCustomer;
//    }

    public static Order searchCustomer(String customerID) {
        OrderList orderList = DBConnection.getInstance().getOrderList();
        Order order = new Order(customerID, null, null, 0, 0, 0);
        int index = orderList.indexOf(String.valueOf(order));
        return orderList.get(index);
    }

    public static Order searchOrder(String orderID) {
        OrderList orderList = DBConnection.getInstance().getOrderList();
        Order order = new Order(null, null, orderID, 0, 0, 0);
        int index = orderList.indexOf(String.valueOf(order));
        return orderList.get(index);
    }

    public static boolean updateOrder(Order order) {
        OrderList orderList = DBConnection.getInstance().getOrderList();
        int index = orderList.indexOf(String.valueOf(order));
        orderList.remove(index);
        orderList.add(order);
        return true;
    }

    public static boolean removeOrder(Order order) {
        OrderList orderList = DBConnection.getInstance().getOrderList();
        int index = orderList.indexOf(String.valueOf(order));
        orderList.remove(index);
        return true;
    }

    public static Order[] toArray() {
        return list.toArray();
    }


//    public static Order[] toArray() {
//        return Order[]
//    }
}