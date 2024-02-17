package db;

import model.OrderList;

public class DBConnection {
    private OrderList orderList;
    private static DBConnection dbConnection;

    private DBConnection(){
        orderList = new OrderList();
    }

    public static DBConnection getInstance(){
        if(dbConnection == null) {
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }

    public OrderList getOrderList(){
        return orderList;
    }
}
