package View;

import controller.OrderController;
import model.Order;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ViewOrderDetailsForm extends JFrame {
    private JTable TableOrders;
    private DefaultTableModel dtm;

    private JLabel lblTitle;
    public ViewOrderDetailsForm(){
        setTitle("Burger Shop");
        setSize(800,600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        lblTitle = new JLabel();
        lblTitle .setText("View Orders");
        lblTitle.setFont(new Font("Time New Roman",Font.BOLD,30));
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setBounds(0,0,800,50);

        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        lblTitle.setVerticalAlignment(JLabel.CENTER);
        lblTitle.setBackground(Color.RED);
        lblTitle.setOpaque(true);

        String [] columnNames = {"Order ID","Customer Id","Customer Name","Order Status","QTY","Total"};

        dtm = new DefaultTableModel(columnNames,0);
        TableOrders = new JTable(dtm);

        JScrollPane paneTbl = new JScrollPane(TableOrders);
        paneTbl.setBounds(70,80,650,400);

        add(paneTbl);
        add(lblTitle);

       // loadTable();
    }
//    private void loadTable(){
//        Order [] ordersArr = OrderController.toArray();
//
//        dtm.setRowCount(0);
//
//        for (int i = 0; i < ordersArr.length; i++) {
//            Order obj = ordersArr[i];
//            Object[] rowdata ={
//              obj.getOrderID(),
//              obj.getCustomerID(),
//              obj.getCustomerName(),
//              obj.getOrderStatus(),
//              obj.getQuantity(),
//              obj.getTotalValue()
//            };
//            dtm.addRow(rowdata);
//        }
//
//    }
}