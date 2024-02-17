package View;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class HomePageForm extends JFrame {
    private JLabel label1 = new JLabel();


    private JButton PlaceOrderB = new JButton();
    private JButton SearchB = new JButton();
    private JButton ViewOrdersB = new JButton();
    private JButton UpdateOrderDetailsB = new JButton();
    private JButton ExitB = new JButton();

    public HomePageForm(){
        setTitle("Burger Shop");
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.WHITE);
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.WHITE);
        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.WHITE);
        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.WHITE);
        JPanel panel5 = new JPanel();
        panel5.setBackground(Color.WHITE);
        JPanel panel6 = new JPanel();
        panel6.setBackground(Color.WHITE);

        ImageIcon imageIcon = new ImageIcon("C:\\Users\\User\\Downloads\\BurgerShopPhoto.jpg");

        Image image = imageIcon.getImage();
        Image scaledImage = image.getScaledInstance(350,300,Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(scaledImage);
        JLabel imageLabel = new JLabel(imageIcon);
        panel5.add(imageLabel);
        add(panel5,BorderLayout.WEST);



        label1 = new JLabel("WELCOME TO BURGER SHOP");
        label1.setFont(new Font("Time New Roman",Font.BOLD,30));
        label1.setBackground(Color.YELLOW);
        label1.setHorizontalAlignment(JLabel.CENTER);
        panel1.add(label1);


        JPanel buttonPanel = new JPanel();
        Box buttonbox = Box.createVerticalBox();

        buttonPanel.setBackground(Color.WHITE);
        buttonPanel.add(buttonbox);

        PlaceOrderB = new JButton("Place Order");
        PlaceOrderB.setFont(new Font("Arial",Font.BOLD,15));
        PlaceOrderB.setMargin(new Insets(2,47,2,47));
        PlaceOrderB.setForeground(Color.WHITE);
        PlaceOrderB.setBackground(Color.RED);
        buttonbox.add(PlaceOrderB);
        buttonbox.add(Box.createVerticalStrut(10));
        PlaceOrderB.addActionListener(evt->
                new AddOrder().setVisible(true)
        );

        SearchB = new JButton("Search");
        SearchB.setFont(new Font("Arial",Font.BOLD,15));
        SearchB.setMargin(new Insets(2,64,2,64));
        SearchB.setForeground(Color.WHITE);
        SearchB.setBackground(Color.RED);
        buttonbox.add(SearchB);
        buttonbox.add(Box.createVerticalStrut(10));
        SearchB.addActionListener(evt->
                new Search().setVisible(true)
        );

        ViewOrdersB = new JButton("View Order");
        ViewOrdersB.setFont(new Font("Arial",Font.BOLD,15));
        ViewOrdersB.setMargin(new Insets(2,50,2,50));
        ViewOrdersB.setForeground(Color.WHITE);
        ViewOrdersB.setBackground(Color.RED);
        buttonbox.add(ViewOrdersB);
        buttonbox.add(Box.createVerticalStrut(10));
        ViewOrdersB.addActionListener(evt->
                new ViewOrderDetailsForm().setVisible(true)
        );

        UpdateOrderDetailsB = new JButton("Update Order Details");
        UpdateOrderDetailsB.setFont(new Font("Arial",Font.BOLD,15));
        UpdateOrderDetailsB.setForeground(Color.WHITE);
        UpdateOrderDetailsB.setBackground(Color.RED);
        buttonbox.add(UpdateOrderDetailsB);
        buttonbox.add(Box.createVerticalStrut(110));
        UpdateOrderDetailsB.addActionListener(evt->
                new UpdateOrderDetailsForm().setVisible(true)
        );

        ExitB = new JButton("Exit");
        ExitB.setFont(new Font("Arial",Font.BOLD,15));
        ExitB.setForeground(Color.WHITE);
        ExitB.setBackground(Color.RED);
        buttonbox.add(ExitB);
        ExitB.getAlignmentX();
        ExitB.addActionListener(evt->
                System.exit(0)
        );

        panel4.add(buttonPanel);
        panel3.add("North",panel4);


        add(panel3,BorderLayout.EAST);

        add("North",panel1);
    }
}