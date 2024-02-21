package View;

import controller.OrderController;

import javax.swing.*;
import java.awt.*;

public class SearchOrderForm extends JFrame {

        private JLabel lblTitle,lblOrderId,lblCustomerId,lblName,lblQty,lblTotal,lblOrderStatus,lblCustIdValue,lblNameValue,lblQtyValue,lblTotValue,lblStatusValue;

        private JTextField txtOrderId;
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

        lblCustIdValue = new JLabel();
        lblCustIdValue .setText("Order Status : ");
        lblCustIdValue.setFont(lblFont);
        lblCustIdValue.setForeground(Color.BLACK);
        lblCustIdValue.setBounds(60,270,150,20);

        lblNameValue = new JLabel();
        lblNameValue .setText("Order Status : ");
        lblNameValue.setFont(lblFont);
        lblNameValue.setForeground(Color.BLACK);
        lblNameValue.setBounds(60,270,150,20);

        lblQtyValue = new JLabel();
        lblQtyValue .setText("Order Status : ");
        lblQtyValue.setFont(lblFont);
        lblQtyValue.setForeground(Color.BLACK);
        lblQtyValue.setBounds(60,270,150,20);

        lblTotValue = new JLabel();
        lblTotValue .setText("Order Status : ");
        lblTotValue.setFont(lblFont);
        lblTotValue.setForeground(Color.BLACK);
        lblTotValue.setBounds(60,270,150,20);

        lblStatusValue = new JLabel();
        lblStatusValue.setText("Order Status : ");
        lblStatusValue.setFont(lblFont);
        lblStatusValue.setForeground(Color.BLACK);
        lblStatusValue.setBounds(60,270,150,20);

        txtOrderId = new JTextField();
        txtOrderId.setEditable(true);
        txtOrderId.setBounds(150,95, 100,25);
        txtOrderId.setBackground(Color.WHITE);
        //txtOrderId.setBorder();


        add(lblTitle);
        add(lblOrderId);
        add(lblCustomerId);
        add(lblName);
        add(lblQty);
        add(lblTotal);
        add(lblOrderStatus);

        add(lblNameValue);
        add(lblCustIdValue);
        add(lblQtyValue);
        add(lblStatusValue);
        add(lblTotValue);

        add(txtOrderId);
    }
}
