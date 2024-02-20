package model;

public class Order {
    private String customerID;
    private String customerName;
    private String orderID;
    private int qty;
    private int totalValue;
    private int orderStatus;

    private static final double BURGERPRICE = 500;

    public Order() {}

    public Order(String customerID, String customerName, String orderID, int qty, int totalValue, int orderStatus) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.orderID = orderID;
        this.qty = qty;
        this.totalValue = (int) BURGERPRICE*qty;
        this.orderStatus = orderStatus;
    }

    public String getCustomerID() { return customerID; }
    public String getCustomerName() { return customerName; }
    public String getOrderID() { return orderID; }
    public int getQuantity() { return qty; }
    public int getTotalValue() { return totalValue; }
    public int getOrderStatus() { return orderStatus; }

    public void setCustomerID(String customerID) { this.customerID = customerID; }
    public void setCustomerName(String name) { this.customerName = name; }
    public void setOrderID(String orderID) { this.orderID = orderID; }
    public void setQuantity(int qty) { this.qty = qty; }
    public void setTotalValue(int totalValue) { this.totalValue = totalValue; }
    public void setOrderStatus(int orderStatus) { this.orderStatus = orderStatus; }

    public void updateQuantity(int newQty) {
        this.qty = newQty;
        this.totalValue = (int) BURGERPRICE*newQty;
    }

    public void updateOrderStatus(int newStatus) {
        this.orderStatus = newStatus;
    }

//    public double calculateTotalPurchases(String customerID) {
//        double totalPurchases = 0;
//
//        for(int i = 0; i < OrderList.size(); i++) {
//            if(OrderList.get(i).getCustomerID().equals(customerID)) {
//                totalPurchases += OrderList.get(i).getQuantity()*BURGERPRICE;
//            }
//        }
//        return totalPurchases;
//    }

    public double calculateTotalPurchases(OrderList orderList) {
        double totalPurchases = 0;

        for(int i = 0; i < orderList.size(); i++) {
            if(orderList.get(i).getCustomerID().equals(this.customerID)) {
                totalPurchases += orderList.get(i).getQuantity() * BURGERPRICE;
            }
        }
        return totalPurchases;
    }

}