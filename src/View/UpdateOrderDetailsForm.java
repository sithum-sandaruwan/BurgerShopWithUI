package View;

import controller.OrderController;
import model.Order;

import javax.swing.*;
import java.awt.*;

public class UpdateOrderDetailsForm extends JFrame {
    private final JLabel lblTitle = new JLabel();
    private final JLabel lblOrderID = new JLabel();
    private final JLabel lblCustomerID = new JLabel();
    private final JLabel lblCustomerName = new JLabel();
    private final JLabel lblQty = new JLabel();
    private final JLabel lblTotal = new JLabel();
    private final JLabel lblOrderStatus = new JLabel();

    private final JTextField txtOrderID = new JTextField();
    private final JTextField txtCustomerID = new JTextField();
    private final JTextField txtCustomerName = new JTextField();
    private final JTextField txtQty = new JTextField();
    private final JTextField txtTotal = new JTextField();

    private final JButton btnUpdate;
    private final JButton btnBack;

    private int qty;

    public UpdateOrderDetailsForm() {
        setTitle("Update Order Details Form");
        setSize(600,400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        Font lblFont = new Font("Arial",Font.BOLD,13);

        lblTitle.setText("Update Order Details");
        lblTitle.setFont(new Font("Arial",Font.BOLD,25));
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setBackground(Color.RED);
        lblTitle.setBounds(0,0,600,50);
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        lblTitle.setVerticalAlignment(JLabel.CENTER);
        lblTitle.setOpaque(true);

        lblOrderStatus.setText("Order Status");
        lblOrderStatus.setFont(lblFont);
        lblOrderStatus.setBounds(50,90,150,20);

        lblOrderID.setText("Order ID");
        lblOrderID.setFont(lblFont);
        lblOrderID.setBounds(50,150,150,20);

        lblCustomerID.setText("Customer ID");
        lblCustomerID.setFont(lblFont);
        lblCustomerID.setBounds(50,180,150,20);

        lblCustomerName .setText("Name");
        lblCustomerName.setFont(lblFont);
        lblCustomerName.setBounds(50,210,150,20);

        lblQty.setText("Burger QTY");
        lblQty.setFont(lblFont);
        lblQty.setBounds(50,240,150,20);

        lblTotal .setText("Total");
        lblTotal.setFont(lblFont);
        lblTotal.setBounds(50,270,150,20);

        String[] orderStatuses = {"Pending","Delivered","Cancelled"};

        JComboBox<String> status = new JComboBox<> (orderStatuses);
        status.setBounds(150,90,120,25);

        txtOrderID.setEditable(true);
        txtOrderID.setBounds(150,150, 120,25);
        txtOrderID.setBackground(Color.WHITE);
        txtOrderID.setBorder(null);
        txtOrderID.addActionListener(evt -> {
            String userInput = txtOrderID.getText();
            Order order = OrderController.searchOrder(userInput);
            if(order != null) {
                // Order found. Use the order object.
            } else {
                // Order not found. Handle this case.
            }
        });

        txtCustomerID.setEditable(false);
        txtCustomerID.setBounds(150,180,120,25);
        txtCustomerID.setBackground(Color.WHITE);
        txtCustomerID.setBorder(null);

        txtCustomerName.setEditable(false);
        txtCustomerName.setBounds(150,210,120,25);
        txtCustomerName.setBackground(Color.WHITE);
        txtCustomerName.setBorder(null);

        txtQty.setEditable(true);
        txtQty.setBounds(150,240,120,25);
        txtQty.setBackground(Color.WHITE);
        txtQty.setBorder(null);

        txtTotal.setEditable(false);
        txtTotal.setBounds(150,270,120,25);
        txtTotal.setBackground(Color.WHITE);
        txtTotal.setBorder(null);

        btnUpdate = new JButton("Update");
        btnUpdate.setFont(lblFont);
        btnUpdate.setForeground(Color.WHITE);
        btnUpdate.setBackground(Color.RED);
        btnUpdate.setBounds(250,310,120,25);
        btnUpdate.setBorderPainted(true);
        btnUpdate.setFocusable(false);
        btnUpdate.addActionListener(evt -> {
            Order orderObj = new Order(
                    txtOrderID.getText(),
                    txtCustomerID.getText(),
                    txtCustomerName.getText(),
                    1,
                    Integer.parseInt(txtQty.getText()),
                    qty
            );
        });

        btnBack = new JButton("Back");
        btnBack.setFont(lblFont);
        btnBack.setForeground(Color.WHITE);
        btnBack.setBackground(Color.GRAY);
        btnBack.setBounds(400,310,120,25);
        btnBack.setBorderPainted(true);
        btnBack.setFocusable(false);
        btnBack.addActionListener(evt -> {
            new HomePageForm().setVisible(true);
        });

        add(lblTitle);
        add(lblOrderID);
        add(lblCustomerID);
        add(lblCustomerName);
        add(lblQty);
        add(lblTotal);
        add(lblOrderStatus);

        add(status);

        add(txtOrderID);
        add(txtCustomerID);
        add(txtCustomerName);
        add(txtQty);
        add(txtTotal);
    }
}