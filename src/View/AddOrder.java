
package View;

import controller.OrderController;
import model.Order;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.Color;
import java.awt.Font;

public class AddOrder extends JFrame {

     private JLabel lblHome;
     private JLabel lblOrderId;
     private JLabel lblCustomerId;
     private JLabel lblCustomerName;
     private JLabel lblQty;
     private JLabel lblNetTotal;
     private JLabel lblNetTotalValue;

     private JButton PlaceOrderBtn;
     private JButton AddCustomerBtn;
     private JButton AddTotalBtn;

     private JTextField txtOrderId;
     private JTextField txtName;
     private JTextField txtCustomerId;
     private JTextField txtQty;

     private int qty;

    public AddOrder(){
        setTitle("Burger Shop");
        setSize(600,400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        Font lblFont = new Font("Times New Roman",Font.BOLD,15);

        lblHome = new JLabel();
        lblHome .setText("Place Order");
        lblHome.setFont(new Font("Time New Roman",Font.BOLD,30));
        lblHome.setForeground(Color.WHITE);
        lblHome.setBounds(0,0,600,50);

        lblHome.setHorizontalAlignment(JLabel.CENTER);
        lblHome.setVerticalAlignment(JLabel.CENTER);
        lblHome.setBackground(Color.RED);
        lblHome.setOpaque(true);

        lblOrderId = new JLabel();
        lblOrderId .setText("Order Id : ");
        lblOrderId.setFont(lblFont);
        lblOrderId.setForeground(Color.BLACK);
        lblOrderId.setBounds(50,100,100,20);


        lblCustomerName = new JLabel();
        lblCustomerName .setText("Name or PH : ");
        lblCustomerName.setFont(lblFont);
        lblCustomerName.setForeground(Color.BLACK);
        lblCustomerName.setBounds(50,150,100,20);

        lblCustomerId = new JLabel();
        lblCustomerId .setText("Customer Id : ");
        lblCustomerId.setFont(lblFont);
        lblCustomerId.setForeground(Color.BLACK);
        lblCustomerId.setBounds(50,200,100,20);

        lblQty = new JLabel();
        lblQty .setText("Burger Qty : ");
        lblQty.setFont(lblFont);
        lblQty.setForeground(Color.BLACK);
        lblQty.setBounds(50,250,100,20);

        lblNetTotal = new JLabel();
        lblNetTotal .setText("Net Total : ");
        lblNetTotal.setFont(lblFont);
        lblNetTotal.setForeground(Color.BLACK);
        lblNetTotal.setBounds(50,300,100,20);

        lblNetTotalValue = new JLabel();
        lblNetTotalValue .setText(" 0 ");
        lblNetTotalValue.setFont(lblFont);
        lblNetTotalValue.setForeground(Color.RED);
        lblNetTotalValue.setBounds(150,300,100,20);

        txtOrderId = new JTextField("o0000");
        txtOrderId.setEditable(false);
        txtOrderId.setBounds(125,98, 100,25);
        txtOrderId.setBorder(null);
        txtOrderId.setText(OrderController.generateOrderId());


        txtName = new JTextField();
        txtName.setBounds(150,150, 150,25);

        txtCustomerId = new JTextField();
        txtCustomerId.setBounds(150,200, 150,25);
        txtCustomerId.setEditable(false);
        txtCustomerId.setText(OrderController.generateCustomerId());

        txtQty = new JTextField();
        txtQty.setBounds(150,250, 150,25);

        AddTotalBtn = new JButton("+");
        AddTotalBtn.setFont(lblFont);
        AddTotalBtn.setBackground(Color.GRAY);
        AddTotalBtn.setForeground(Color.BLACK);
        AddTotalBtn.setBounds(300,200,50,25);
        AddTotalBtn.setFocusable(false);
        AddTotalBtn.addActionListener(evt ->{
            qty = Integer.parseInt(txtQty.getText());
            qty*=OrderController.burgerPrice;
            lblNetTotalValue.setText(qty+"/=");
        });

        PlaceOrderBtn = new JButton("Place Order");
        PlaceOrderBtn.setFont(lblFont);
        PlaceOrderBtn.setBackground(Color.RED);
        PlaceOrderBtn.setForeground(Color.WHITE);
        PlaceOrderBtn.setBounds(380,170,150,25);
        PlaceOrderBtn.setBorderPainted(true);
        PlaceOrderBtn.setFocusable(false);
        PlaceOrderBtn.addActionListener(evt -> {
            System.out.println("Order Placed");
//            Order orderObj = new Order(
//                    txtOrderId.getText(),
//                    txtCustomerId.getText(),
//                    txtName.getText(),
//                    1,
//                    Integer.parseInt(txtQty.getText()),
//                    qty
//
//            );
//            System.out.println(orderObj);
     //       OrderController.add(orderObj);
            //       clearTxt();
           // setNextId();
        });

        add(lblCustomerName);
        add(lblCustomerId);
        add(lblOrderId);
        add(lblQty);
        add(lblNetTotal);
        add(lblNetTotalValue);
        add(lblHome);

        add(txtOrderId);
        add(txtName);
        add(txtCustomerId);
        add(txtQty);

        add(PlaceOrderBtn);
        add(AddTotalBtn);

    }
    private void clearTxt(){
        txtName.setText(null);
        txtQty.setText(null);
        lblNetTotalValue.setText("0");
    }
    private void setNextId(){
        txtCustomerId.setText(OrderController.generateCustomerId());
        txtOrderId.setText(OrderController.generateOrderId());
    }
}