package View;

import controller.OrderController;
import model.Order;

import javax.swing.*;
import java.awt.*;

public class SearchOrderForm extends JFrame {

    private final JButton SearchBtn;
    private final JButton btnBack;
    private JLabel lblTitle,lblOrderId,lblCustomerId,lblName,lblQty,lblTotal,lblOrderStatus;

        private JTextField txtOrderId,txtCustIdValue,txtNameValue,txtQtyValue,txtTotValue,txtStatusValue;
    public SearchOrderForm(){

        setTitle("Burger Shop");
        setSize(600,400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        Font lblFont = new Font("Time New Roman",Font.PLAIN,15);

        lblTitle = new JLabel();
        lblTitle .setText("Search Order Details");
        lblTitle.setFont(new Font("Time New Roman",Font.BOLD,30));
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setBounds(0,0,600,50);
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        lblTitle.setVerticalAlignment(JLabel.CENTER);
        lblTitle.setBackground(Color.RED);
        lblTitle.setOpaque(true);

        lblOrderId = new JLabel();
        lblOrderId .setText("Enter Order Id: ");
        lblOrderId.setFont(lblFont);
        lblOrderId.setForeground(Color.BLACK);
        lblOrderId.setBounds(30,95,150,20);

        lblCustomerId = new JLabel();
        lblCustomerId .setText("Customer Id: ");
        lblCustomerId.setFont(lblFont);
        lblCustomerId.setForeground(Color.BLACK);
        lblCustomerId.setBounds(60,150,150,20);

        lblName = new JLabel();
        lblName .setText("Name : ");
        lblName.setFont(lblFont);
        lblName.setForeground(Color.BLACK);
        lblName.setBounds(60,180,150,20);

        lblQty = new JLabel();
        lblQty .setText("QTY : ");
        lblQty.setFont(lblFont);
        lblQty.setForeground(Color.BLACK);
        lblQty.setBounds(60,210,150,20);

        lblTotal = new JLabel();
        lblTotal .setText("Total : ");
        lblTotal.setFont(lblFont);
        lblTotal.setForeground(Color.BLACK);
        lblTotal.setBounds(60,240,150,20);

        lblOrderStatus = new JLabel();
        lblOrderStatus .setText("Order Status : ");
        lblOrderStatus.setFont(lblFont);
        lblOrderStatus.setForeground(Color.BLACK);
        lblOrderStatus.setBounds(60,270,150,20);


        txtOrderId = new JTextField();
        txtOrderId.setEditable(true);
        txtOrderId.setBounds(150,95, 100,25);
        txtOrderId.setBackground(Color.WHITE);
        txtOrderId.setBorder(null);

        txtCustIdValue = new JTextField();
        txtCustIdValue.setEditable(false);
        txtCustIdValue.setBounds(150,150, 100,20);
        txtCustIdValue.setBorder(null);

        txtNameValue = new JTextField();
        txtNameValue.setEditable(false);
        txtNameValue.setBounds(120,180, 100,20);
        txtNameValue.setBorder(null);

        txtQtyValue = new JTextField();
        txtQtyValue.setEditable(false);
        txtQtyValue.setBounds(120,210, 100,20);
        txtQtyValue.setBorder(null);

        txtTotValue = new JTextField();
        txtTotValue.setEditable(false);
        txtTotValue.setBounds(120,240, 100,20);
        txtTotValue.setBorder(null);

        txtStatusValue = new JTextField();
        txtStatusValue.setEditable(false);
        txtStatusValue.setBounds(160,270, 100,20);
        txtStatusValue.setBorder(null);

        SearchBtn = new JButton("Search");
        SearchBtn.setFont(lblFont);
        SearchBtn.setBackground(Color.RED);
        SearchBtn.setForeground(Color.WHITE);
        SearchBtn.setBounds(420,310,100,25);
        SearchBtn.setBorderPainted(true);
        SearchBtn.setFocusable(false);
        SearchBtn.addActionListener(evt -> {


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






        add(lblTitle);
        add(lblOrderId);
        add(lblCustomerId);
        add(lblName);
        add(lblQty);
        add(lblTotal);
        add(lblOrderStatus);

        add(txtNameValue);
        add(txtCustIdValue);
        add(txtStatusValue);
        add(txtQtyValue);
        add(txtTotValue);
        add(txtOrderId);

        add(SearchBtn);
        add(btnBack);
    }
}
