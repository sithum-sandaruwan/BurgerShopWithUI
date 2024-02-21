
package View;


import controller.OrderController;
import model.Order;

import javax.swing.*;
import java.awt.*;

public class Search extends JFrame {

    private JLabel label1;

    private JButton btnSearchBestCust;
    private final JButton btnSearchOrder;
    private final JButton btnSearchCust;

    public Search(){
        setTitle("Burger Shop");
        setSize(600,400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setBackground(Color.DARK_GRAY);

        Font btnFont = new Font("Time New Roman",Font.BOLD,20);

        label1 = new JLabel();
        label1 .setText("Search");
        label1.setFont(new Font("Time New Roman",Font.BOLD,20));
        label1.setForeground(Color.WHITE);
        label1.setBounds(0,0,600,40);
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setVerticalAlignment(JLabel.CENTER);
        label1.setBackground(Color.RED);
        label1.setOpaque(true);

        btnSearchBestCust = new JButton(" Best Customer");
        btnSearchBestCust.setFont(btnFont);
        btnSearchBestCust.setBackground(Color.RED);
        btnSearchBestCust.setForeground(Color.WHITE);
        btnSearchBestCust.setBounds(200,100,200,25);
        btnSearchBestCust.setBorderPainted(true);
        btnSearchBestCust.setFocusable(false);
        btnSearchBestCust.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnSearchBestCust.addActionListener(evt -> {
            new BestCustomerForm().setVisible(true);
        });

        btnSearchOrder = new JButton("Order Details");
        btnSearchOrder.setFont(btnFont);
        btnSearchOrder.setBackground(Color.RED);
        btnSearchOrder.setForeground(Color.WHITE);
        btnSearchOrder.setBounds(200,150,200,25);
        btnSearchOrder.setBorderPainted(true);
        btnSearchOrder.setFocusable(false);
        btnSearchOrder.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnSearchOrder.addActionListener(evt -> {
            new SearchOrderFrom().setVisible(true);
        });


        btnSearchCust = new JButton(" Search Customer ");
        btnSearchCust.setFont(btnFont);
        btnSearchCust.setBackground(Color.RED);
        btnSearchCust.setForeground(Color.WHITE);
        btnSearchCust.setBounds(200,200,200,25);
        btnSearchCust.setBorderPainted(true);
        btnSearchCust.setFocusable(false);
        btnSearchOrder.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnSearchCust.addActionListener(evt -> {
            new SearchCust().setVisible(true);
        });


        add(label1);

        add(btnSearchOrder);
        add(btnSearchBestCust);
        add(btnSearchCust);

    }
}
