package View;

import controller.OrderController;
import model.Order;
import model.OrderList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class BestCustomerForm extends JFrame {

    private final JLabel lblTitle;

    private JTable tableBestCust;

    private DefaultTableModel dtm;

    public BestCustomerForm(){
        setTitle("Burger Shop");
        setSize(800,600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        lblTitle = new JLabel();
        lblTitle .setText("Best Customer");
        lblTitle.setFont(new Font("Time New Roman",Font.BOLD,30));
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setBounds(0,0,800,50);
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        lblTitle.setVerticalAlignment(JLabel.CENTER);
        lblTitle.setBackground(Color.RED);
        lblTitle.setOpaque(true);

        String [] Columns = {"Customer Id","Name","Total"};

        dtm = new DefaultTableModel(Columns,0);
        tableBestCust = new JTable(dtm);

        JScrollPane tblPane = new JScrollPane(tableBestCust);
        tblPane.setBounds(70,80,650,400);

        add(tblPane);
        add(lblTitle);

        loadTable();
    }
    private void loadTable(){
        Order[] customers = OrderController.getBestCustomer();

        dtm.setRowCount(0);

        for (int i = 0; i < customers.length; i++) {
            Order obj = customers[i];

            System.out.println("customer Id:"+obj.getCustomerID());
            System.out.println("customer Name:"+obj.getCustomerName());
            System.out.println("Total Value:"+obj.getTotalValue());

            Object[] rowdata ={
                    obj.getCustomerID(),
                    obj.getCustomerName(),
                    obj.getTotalValue()
            };
            dtm.addRow(rowdata);
        }
    }
}
