package model;

public class Order {
    private String pNum;
    private String name;
    private int orderID;
    private int qty;
    private int totalValue;
    private int orderStatus;

    private static final double BURGER_PRICE = 500;

    public Order() {}

    public Order(String pNum, String name) {
        this.pNum = pNum;
        this.name = name;
    }

    public Order(int orderID, int qty, int totalValue, int orderStatus) {
        this.orderID = orderID;
        this.qty = qty;
        this.totalValue = (int) BURGER_PRICE*qty;
        this.orderStatus = orderStatus;
    }

    public String getCustomerID() { return pNum; }
    public String getCustomerName() { return name; }
    public int getOrderID() { return orderID; }
    public int getQuantity() { return qty; }
    public int getTotalValue() { return totalValue; }
    public int getOrderStatus() { return orderStatus; }

    public void setCustomerID(String pNum) { this.pNum = pNum; }
    public void setCustomerName(String name) { this.name = name; }
    public void setOrderID(int orderID) { this.orderID = orderID; }
    public void setQuantity(int qty) { this.qty = qty; }
    public void setTotalValue(int totalValue) { this.totalValue = totalValue; }
    public void setOrderStatus(int orderStatus) { this.orderStatus = orderStatus; }

    public void updateQuantity(int newQty) {
        this.qty = newQty;
        this.totalValue = (int) BURGER_PRICE*newQty;
    }

    public void updateOrderStatus(int newStatus) {
        this.orderStatus = newStatus;
    }
}