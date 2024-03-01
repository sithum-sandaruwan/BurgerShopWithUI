package View;

import controller.OrderController;
import model.Order;

import javax.swing.*;
import java.awt.*;

public class SearchOrderForm extends JFrame {
    private JLabel lblTitle = new JLabel();
    private JLabel lblOrderID = new JLabel();
    private JLabel lblCustomerID = new JLabel();
    private JLabel lblCustomerName = new JLabel();
    private JLabel lblQty = new JLabel();
    private  JLabel lblTotal = new JLabel();
    private JLabel lblOrderStatus = new JLabel();

    private JTextField txtOrderID = new JTextField();
    private JTextField txtCustomerID = new JTextField();
    private JTextField txtCustomerName = new JTextField();
    private  JTextField txtQty = new JTextField();
    private JTextField txtTotal = new JTextField();
    private JTextField txtOrderStatus = new JTextField();

    private final JButton btnSearch;
    private final JButton btnBack;

    private int qty;

    private String orderID;

    public SearchOrderForm() {
        setTitle("Search Order Details Form");
        setSize(600,400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        Font lblFont = new Font("Arial",Font.BOLD,13);

        lblTitle.setText("Search Order Details");
        lblTitle.setFont(new Font("Arial",Font.BOLD,25));
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setBackground(Color.RED);
        lblTitle.setBounds(0,0,600,50);
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        lblTitle.setVerticalAlignment(JLabel.CENTER);
        lblTitle.setOpaque(true);

        lblOrderID.setText("Enter Order ID");
        lblOrderID.setFont(lblFont);
        lblOrderID.setBounds(50,95,150,20);

        lblCustomerID .setText("Customer ID");
        lblCustomerID.setFont(lblFont);
        lblCustomerID.setBounds(50,150,150,20);

        lblCustomerName.setText("Name");
        lblCustomerName.setFont(lblFont);
        lblCustomerName.setBounds(50,180,150,20);

        lblQty.setText("Burger QTY");
        lblQty.setFont(lblFont);
        lblQty.setBounds(50,210,150,20);

        lblTotal.setText("Net Total");
        lblTotal.setFont(lblFont);
        lblTotal.setBounds(50,240,150,20);

        lblOrderStatus .setText("Order Status");
        lblOrderStatus.setFont(lblFont);
        lblOrderStatus.setBounds(50,270,150,20);

        txtOrderID.setEditable(true);
        txtOrderID.setBounds(150,95,120,20);
        txtOrderID.setBorder(null);

        txtCustomerID.setEditable(false);
        txtCustomerID.setBounds(150,150,120,20);
        txtCustomerID.setBorder(null);

        txtCustomerName.setEditable(false);
        txtCustomerName.setBounds(150,180,120,20);
        txtCustomerName.setBorder(null);

        txtQty.setEditable(false);
        txtQty.setBounds(150,210,120,20);
        txtQty.setBorder(null);

        txtTotal.setEditable(false);
        txtTotal.setBounds(150,240,120,20);
        txtTotal.setBorder(null);

        txtOrderStatus.setEditable(false);
        txtOrderStatus.setBounds(150,270,120,20);
        txtOrderStatus.setBorder(null);

        btnSearch = new JButton("Search");
        btnSearch.setFont(lblFont);
        btnSearch.setForeground(Color.WHITE);
        btnSearch.setBackground(Color.RED);
        btnSearch.setBounds(275,310,120,25);
        btnSearch.setBorderPainted(true);
        btnSearch.setFocusable(false);
        btnSearch.addActionListener(evt -> {
            orderID = txtOrderID.getText();
            txtCustomerID.setText(String.valueOf(OrderController.searchOrder(orderID)));
            //txtCustomerID.getText();
            txtCustomerName.setText(String.valueOf(OrderController.searchOrder(orderID)));
            txtQty.setText(String.valueOf(OrderController.searchOrder(orderID)));
            txtTotal.setText(String.valueOf(OrderController.searchOrder(orderID)));
            txtOrderStatus.setText(String.valueOf(OrderController.searchOrder(orderID)));

//            Order orderObj = new Order(
//                    txtOrderID.getText(),
//                    txtCustomerID.getText(),
//                    txtCustomerName.getText(),
//                    1,
//                    Integer.parseInt(txtQty.getText()),
//                    qty
//            );
        });

        btnBack = new JButton("Back");
        btnBack.setFont(lblFont);
        btnBack.setForeground(Color.WHITE);
        btnBack.setBackground(Color.GRAY);
        btnBack.setBounds(425,310,120,25);
        btnBack.setBorderPainted(true);
        btnBack.setFocusable(false);
        btnBack.addActionListener(evt -> {
            new Search().setVisible(true);
        });

        add(lblTitle);
        add(lblOrderID);
        add(lblCustomerID);
        add(lblCustomerName);
        add(lblQty);
        add(lblTotal);
        add(lblOrderStatus);

        add(txtOrderID);
        add(txtCustomerID);
        add(txtCustomerName);
        add(txtQty);
        add(txtTotal);
        add(txtOrderStatus);

        add(btnSearch);
        add(btnBack);
    }
}