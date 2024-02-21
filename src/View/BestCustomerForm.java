package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class BestCustomerForm extends JFrame {

    private final JLabel lblTitle;

    private JTable tableBestCust;

    private DefaultTableModel dtm;

    BestCustomerForm(){
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

    }
}
