package View;

import controller.OrderController;
import model.Order;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class SearchCustForm extends JFrame {
    private final JLabel lblTitle = new JLabel();
    private final JLabel lblSubTitle = new JLabel();
    private final JLabel lblCustomerID = new JLabel();
    private final JLabel lblCustomerName = new JLabel();

    private final JTextField txtCustomerID = new JTextField();
    private final JTextField txtCustomerName = new JTextField();

    private final JTable tableOrder;

    private final DefaultTableModel dtm;

    private final JButton btnSearch;
    private final JButton btnBack;

    private  String customerID;

    private String[] columns = {"Order ID","Burger QTY"," Net Total","Order Status"};

    public SearchCustForm() {
        setTitle("Search Customer Details Form");
        setSize(800,600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        Font lblFont = new Font("Arial",Font.BOLD,13);

        lblTitle.setText("Search Customer Details");
        lblTitle.setFont(new Font("Arial",Font.BOLD,25));
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setBackground(Color.RED);
        lblTitle.setBounds(0,0,800,50);
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        lblTitle.setVerticalAlignment(JLabel.CENTER);
        lblTitle.setOpaque(true);

        lblSubTitle.setText("Customer's Order Details");
        lblSubTitle.setFont(new Font("Arial",Font.BOLD,25));
        lblSubTitle.setForeground(Color.WHITE);
        lblSubTitle.setBackground(Color.RED);
        lblSubTitle.setBounds(0,220,800,50);
        lblSubTitle.setHorizontalAlignment(JLabel.CENTER);
        lblSubTitle.setVerticalAlignment(JLabel.CENTER);
        lblSubTitle.setOpaque(true);

        lblCustomerID.setText("Enter Customer ID");
        lblCustomerID.setFont(lblFont);
        lblCustomerID.setBounds(30,95,120,25);

        lblCustomerName .setText("Name");
        lblCustomerName.setFont(lblFont);
        lblCustomerName.setBounds(30,130,120,25);

        txtCustomerID.setEditable(true);
        txtCustomerID.setBounds(160,95,120,25);
        txtCustomerID.setBorder(null);

        txtCustomerName.setEditable(false);
        txtCustomerName.setBounds(160,130,120,25);
        txtCustomerName.setBorder(null);

        btnSearch = new JButton("Search");
        btnSearch.setFont(lblFont);
        btnSearch.setForeground(Color.WHITE);
        btnSearch.setBackground(Color.RED);
        btnSearch.setBounds(400,170,120,25);
        btnSearch.setBorderPainted(true);
        btnSearch.setFocusable(false);
        btnSearch.addActionListener(evt -> {
            customerID = txtCustomerID.getText();
            System.out.println(customerID);
            txtCustomerName.setText(String.valueOf(OrderController.searchCustomer(customerID)));

            loadTable();
        });

        btnBack = new JButton("Back");
        btnBack.setFont(lblFont);
        btnBack.setForeground(Color.WHITE);
        btnBack.setBackground(Color.GRAY);
        btnBack.setBounds(550,170,120,25);
        btnBack.setBorderPainted(true);
        btnBack.setFocusable(false);
        btnBack.addActionListener(evt -> {
            new Search().setVisible(true);
        });

        dtm = new DefaultTableModel(columns,0);
        tableOrder = new JTable(dtm);

        JScrollPane paneTbl = new JScrollPane(tableOrder);
        paneTbl.setBounds(70,300,650,400);

        add(lblTitle);
        add(lblSubTitle);
        add(lblCustomerName);
        add(lblCustomerID);

        add(txtCustomerID);
        add(txtCustomerName);

        add(btnSearch);
        add(btnBack);

        add(paneTbl);
    }

    private void loadTable() {
        Order[] ordersArr = OrderController.toArray();

        dtm.setRowCount(0);

        for(int i = 0; i < ordersArr.length; i++) {
            Order obj = ordersArr[i];

            Object[] rowData = {
                    obj.getOrderID(),
                    obj.getTotalValue(),
                    obj.getOrderStatus(),
                    obj.getQuantity()
            };
            dtm.addRow(rowData);
        }
    }
}