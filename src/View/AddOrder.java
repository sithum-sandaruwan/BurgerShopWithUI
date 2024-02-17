
package View;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class AddOrder extends JFrame {

    JPanel panel1= new JPanel(new BorderLayout());
    JPanel panel2= new JPanel(new BorderLayout());
    JButton placeOrderB = new JButton();
    JButton backHome = new JButton();
    JButton cancel = new JButton();
    JLabel NetTot = new JLabel();
    JLabel BurgerQt = new JLabel();
    JLabel OrderStat = new JLabel();
    JTextField custId = new JTextField();
    JTextField bQty = new JTextField();
    JTextField NetTotValue = new JTextField();
    AddOrder(){
        setTitle("Burger Shop");
        setSize(600,400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);


        JLabel label1 = new JLabel("Place Order");
        label1.setFont(new Font("Time New Roman",Font.BOLD,30));
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setForeground(Color.WHITE);
        label1.setBackground(Color.RED);
        label1.setOpaque(true);
        label1.setBorder(new EmptyBorder(5,10,5,10));
        panel1.add(label1,BorderLayout.NORTH);

        // panel2.setLayout(new BoxLayout(panel2,BoxLayout.Y_AXIS));

        JLabel label2 = new JLabel("Order Id :");
        label2.setFont(new Font("Verdana",Font.PLAIN,15));
        label2.setHorizontalAlignment(JLabel.LEFT);
        label2.setForeground(Color.BLACK);
        panel2.add(label2,BorderLayout.NORTH);


        JLabel label3 = new JLabel("Customer Id :");
        label3.setFont(new Font("Verdana",Font.PLAIN,15));
        label3.setHorizontalAlignment(JLabel.LEFT);
        label3.setForeground(Color.BLACK);
        panel2.add(label3,BorderLayout.SOUTH);

        panel2.add(Box.createRigidArea(new Dimension(0, 10)), BorderLayout.CENTER);

        panel1.add(panel2,BorderLayout.WEST);
        add(panel1);

    }

}