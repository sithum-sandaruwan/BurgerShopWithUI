package View;

import controller.OrderController;
import model.Order;
import model.OrderList;

import javax.swing.*;
import java.awt.*;

public class UpdateOrderDetailsForm extends JFrame {

    private JLabel lblTitle;
    private JLabel lblOrderId;
    private JLabel lblCustomerId;
    private JLabel lblName;
    private JLabel lblQty;
    private JLabel lblTotal;
    private JLabel lblOrderStatus;
    private JTextField txtOrderId;
    private JTextField txtCustIdValue;
    private JTextField txtNameValue;
    private JTextField txtQtyValue;
    private JTextField txtTotValue;
    private JButton btnUpdate;
    private JButton btnBack;

    public UpdateOrderDetailsForm(){
        setTitle("Burger Shop");
        setSize(600,400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        Font lblFont = new Font("Time New Roman",Font.PLAIN,15);

        lblTitle = new JLabel();
        lblTitle .setText("Update Order Details");
        lblTitle.setFont(new Font("Time New Roman",Font.BOLD,30));
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setBounds(0,0,600,50);
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        lblTitle.setVerticalAlignment(JLabel.CENTER);
        lblTitle.setBackground(Color.RED);
        lblTitle.setOpaque(true);

        lblOrderStatus = new JLabel();
        lblOrderStatus .setText("Order Status ");
        lblOrderStatus.setFont(lblFont);
        lblOrderStatus.setForeground(Color.BLACK);
        lblOrderStatus.setBounds(70,90,150,20);

        lblOrderId = new JLabel();
        lblOrderId .setText("Order Id ");
        lblOrderId.setFont(lblFont);
        lblOrderId.setForeground(Color.BLACK);
        lblOrderId.setBounds(60,150,150,20);

        lblCustomerId = new JLabel();
        lblCustomerId .setText("Customer ID  ");
        lblCustomerId.setFont(lblFont);
        lblCustomerId.setForeground(Color.BLACK);
        lblCustomerId.setBounds(60,180,150,20);

        lblName = new JLabel();
        lblName .setText("Name ");
        lblName.setFont(lblFont);
        lblName.setForeground(Color.BLACK);
        lblName.setBounds(60,210,150,20);

        lblQty = new JLabel();
        lblQty .setText("Order Qty");
        lblQty.setFont(lblFont);
        lblQty.setForeground(Color.BLACK);
        lblQty.setBounds(60,240,150,20);

        lblTotal = new JLabel();
        lblTotal .setText("Total ");
        lblTotal.setFont(lblFont);
        lblTotal.setForeground(Color.BLACK);
        lblTotal.setBounds(60,270,150,20);


        txtOrderId = new JTextField();
        txtOrderId.setEditable(true);
        txtOrderId.setBounds(140,150, 95,20);
        txtOrderId.setBackground(Color.WHITE);
        txtOrderId.setBorder(null);
        txtOrderId.addActionListener(e -> {

            String userInput = txtOrderId.getText();
            Order order = OrderController.searchOrder(userInput);

            if (order != null) {
                txtCustIdValue.setText(order.getCustomerID());
                txtNameValue.setText(order.getCustomerName());
                txtQtyValue.setText(String.valueOf(order.getQuantity()));
                txtTotValue.setText(order.getCustomerID());
            } else {

            }
        });

        txtCustIdValue = new JTextField();
        txtCustIdValue.setEditable(false);
        txtCustIdValue.setBounds(160,180, 100,20);
        //txtCustIdValue.setBackground(Color.WHITE);
        txtCustIdValue.setBorder(null);

        txtNameValue = new JTextField();
        txtNameValue.setEditable(false);
        txtNameValue.setBounds(120,210, 120,20);
        txtNameValue.setBackground(Color.WHITE);
        txtNameValue.setBorder(null);

        txtQtyValue = new JTextField();
        txtQtyValue.setEditable(true);
        txtQtyValue.setBounds(150,240, 100,20);
        txtQtyValue.setBackground(Color.WHITE);
        txtQtyValue.setBorder(null);

        txtTotValue = new JTextField();
        txtTotValue.setEditable(false);
        txtTotValue.setBounds(100,270, 100,20);
        txtTotValue.setBackground(Color.WHITE);
        txtTotValue.setBorder(null);

        //String[]orderStatuses = {"Deiliverd","Canceled","Pending"};

        JComboBox<String> status = new JComboBox<>();
        status.setBounds(170, 90, 160, 25);

        status.addItem("Pending");
        status.addItem("Processing");
        status.addItem("Delivered");

        try {
            int orderId = Integer.parseInt(txtOrderId.getText());
            status.setSelectedIndex(orderId);
        } catch (NumberFormatException e) {
            System.err.println("Invalid order ID: " + txtOrderId.getText());
        }




        btnUpdate = new JButton("Search");
        btnUpdate.setFont(lblFont);
        btnUpdate.setBackground(Color.RED);
        btnUpdate.setForeground(Color.WHITE);
        btnUpdate.setBounds(420,310,100,25);
        btnUpdate.setBorderPainted(true);
        btnUpdate.setFocusable(false);
        btnUpdate.addActionListener(evt -> {


            Order orderObj = new Order();
            // txtOrderId.getText(),
            // txtCustomerId.getText(),
            // txtName.getText(),
            // 1,
            // Integer.parseInt(txtQty.getText()),
            // qty
        });

        btnBack = new JButton("Back");
        btnBack.setFont(lblFont);
        btnBack.setBackground(Color.GRAY);
        btnBack.setForeground(Color.WHITE);
        btnBack.setBounds(295,310,100,25);
        btnBack.setBorderPainted(true);
        btnBack.setFocusable(false);
        btnBack.addActionListener(evt -> {

        });

        add(lblOrderStatus);
        add(lblTitle);
        add(lblName);
        add(lblOrderId);
        add(lblCustomerId);
        add(lblQty);
        add(lblTotal);

        add(status);

        add(txtOrderId);
        add(txtCustIdValue);
        add(txtNameValue);
        add(txtQtyValue);
        add(txtTotValue);

    }
}
