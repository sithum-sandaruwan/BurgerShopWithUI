package View;

import controller.OrderController;
import model.Order;
import model.OrderList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class SearchCustForm extends JFrame {

    private final JLabel lblTitle;
    private final JLabel lblTitle2;
    private final JLabel lblCustomerId;
    private final JLabel lblName;
    private final JTextField txtCustId;
    private final JTextField txtName;
    private final DefaultTableModel dtm;
    private final JTable TableOrder;
    private final JButton SearchBtn;
    private final JButton btnBack;
    private  String custId;

    private String [] columns = {"Order ID","Order Qty","Total"};

    public SearchCustForm(){
        setTitle("Burger Shop");
        setSize(800,600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        Font lblFont =new Font("Time New Roman",Font.PLAIN,15);

        lblTitle = new JLabel();
        lblTitle .setText("Search Customer");
        lblTitle.setFont(new Font("Time New Roman",Font.BOLD,30));
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setBounds(0,0,800,50);
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        lblTitle.setVerticalAlignment(JLabel.CENTER);
        lblTitle.setBackground(Color.RED);
        lblTitle.setOpaque(true);

        lblTitle2 = new JLabel();
        lblTitle2 .setText("Order Details");
        lblTitle2.setFont(new Font("Time New Roman",Font.BOLD,20));
        lblTitle2.setForeground(Color.WHITE);
        lblTitle2.setBounds(0,230,800,40);
        lblTitle2.setHorizontalAlignment(JLabel.CENTER);
        lblTitle2.setVerticalAlignment(JLabel.CENTER);
        lblTitle2.setBackground(Color.RED);
        lblTitle2.setOpaque(true);

        lblCustomerId = new JLabel();
        lblCustomerId .setText("Enter Customer Id: ");
        lblCustomerId.setFont(lblFont);
        lblCustomerId.setForeground(Color.BLACK);
        lblCustomerId.setBounds(30,95,170,20);

        lblName = new JLabel();
        lblName .setText("Name : ");
        lblName.setFont(lblFont);
        lblName.setForeground(Color.BLACK);
        lblName.setBounds(30,130,100,20);

        txtCustId = new JTextField();
        txtCustId.setEditable(true);
        txtCustId.setBounds(200,95, 100,20);
        txtCustId.setBackground(Color.WHITE);
        txtCustId.setBorder(null);

        txtName = new JTextField();
        txtName.setEditable(false);
        txtName.setBounds(130,130, 100,20);
        txtName.setBorder(null);


        SearchBtn = new JButton("Search");
        SearchBtn.setFont(lblFont);
        SearchBtn.setBackground(Color.RED);
        SearchBtn.setForeground(Color.WHITE);
        SearchBtn.setBounds(540,190,100,25);
        SearchBtn.setBorderPainted(true);
        SearchBtn.setFocusable(false);
        SearchBtn.addActionListener(evt -> {

             custId = txtCustId.getText();
            System.out.println(custId);
            txtName.setText(String.valueOf(OrderController.searchCustomer(custId)));
        });

        btnBack = new JButton("Back");
        btnBack.setFont(lblFont);
        btnBack.setBackground(Color.GRAY);
        btnBack.setForeground(Color.WHITE);
        btnBack.setBounds(390,190,100,25);
        btnBack.setBorderPainted(true);
        btnBack.setFocusable(false);
        btnBack.addActionListener(evt -> {
            new Search().setVisible(true);
        });

        dtm = new DefaultTableModel(columns,0);
        TableOrder = new JTable(dtm);

        JScrollPane paneTbl = new JScrollPane(TableOrder);
        paneTbl.setBounds(70,300,650,400);

        add(lblTitle);
        add(lblTitle2);
        add(lblName);
        add(lblCustomerId);

        add(txtCustId);
        add(txtName);

        add(btnBack);
        add(SearchBtn);

        add(paneTbl);

        loadTable();
    }
    private void loadTable(){
        Order [] ordersArr = OrderController.toArray();

        dtm.setRowCount(0);

        for (int i = 0; i < ordersArr.length; i++) {
            Order obj = ordersArr[i];
            Object[] rowdata ={
              obj.getOrderID(),
              obj.getQuantity(),
              obj.getTotalValue()
            };
            dtm.addRow(rowdata);
        }

    }
}
