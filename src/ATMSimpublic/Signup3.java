package ATMSimpublic;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5;
    JButton submit,cancel;
    ButtonGroup grpacc;
    String formno;

    Signup3(String formno)
    {
        this.formno=formno;
        setLayout(null);

        JLabel i1=new JLabel("Page 3: Account Details");
        i1.setFont(new Font("Raleway",Font.BOLD,22));
        i1.setBounds(280,40,400,40);
        add(i1);

        JLabel type=new JLabel("Account type");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100,140,200,30);
        add(type);

        r1= new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,180,150,20);
        add(r1);

        r2= new JRadioButton("FD Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,180,150,20);
        add(r2);

        r3= new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,220,150,20);
        add(r3);

        r4= new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,220,250,20);
        add(r4);

        grpacc= new ButtonGroup();
        grpacc.add(r1);
        grpacc.add(r2);
        grpacc.add(r3);
        grpacc.add(r4);

        JLabel card=new JLabel("Card Number");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100,300,200,30);
        add(card);

        JLabel num=new JLabel("xxxx-xxxx-xxxx-1460");
        num.setFont(new Font("Raleway",Font.BOLD,22));
        num.setBounds(330,300,300,30);
        add(num);

        JLabel pin=new JLabel("Pin Number");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        add(pin);

        JLabel pinnum=new JLabel("xxxx");
        pinnum.setFont(new Font("Raleway",Font.BOLD,22));
        pinnum.setBounds(330,370,200,30);
        add(pinnum);

        JLabel pindet=new JLabel("Your 4 digit password");
        pindet.setFont(new Font("Raleway",Font.BOLD,12));
        pindet.setBounds(100,400,300,20);
        add(pindet);

        JLabel services=new JLabel("Services Required:");
        services.setFont(new Font("Raleway",Font.BOLD,22));
        services.setBounds(100,450,300,30);
        add(services);

        c1 =new JCheckBox("ATM Card");
        c1.setBackground(Color.white);
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);

        c2 =new JCheckBox("Internet Banking");
        c2.setBackground(Color.white);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);

        c3 =new JCheckBox("Mobile Banking");
        c3.setBackground(Color.white);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);

        c4 =new JCheckBox("Email/SMS Alerts");
        c4.setBackground(Color.white);
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        add(c4);

        c5 =new JCheckBox("I here by declare that the above entered details are correct.");
        c5.setBackground(Color.white);
        c5.setFont(new Font("Raleway",Font.BOLD,12));
        c5.setBounds(100,600,600,20);
        add(c5);

        submit=new JButton("Submit");
        submit.setBackground(Color.blue);
        submit.setForeground(Color.white);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(280,650,100,30);
        submit.addActionListener(this);
        add(submit);

        cancel=new JButton("Clear");
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBounds(430,650,100,30);
        cancel.addActionListener(this);
        add(cancel);

        setSize(850,820);
        setLocation(350,0);
        setVisible(true);
    }
public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == submit) {
        String acctype = "";
        if (r1.isSelected()) {
            acctype = "Saving Account";
        } else if (r2.isSelected()) {
            acctype = "FD Account";
        } else if (r3.isSelected()) {
            acctype = "Current Account";
        } else if (r4.isSelected()) {
            acctype = "Recurring Deposit Account";
        }
        Random random = new Random();
        String cardno = "" + Math.abs((random.nextLong() % 9000000L) + 5040936000000000L);
        String pinno = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
        String facility = "";
        if (c1.isSelected()) {
            facility = facility + "ATM Card";
        }
        if (c2.isSelected()) {
            facility = facility + " Internet Banking";
        }
        if (c3.isSelected()) {
            facility = facility + " Mobile Banking";
        }
        if (c4.isSelected()) {
            facility = facility + " Email/SMS Alerts";
        }
        if (!c5.isSelected()) {
            JOptionPane.showMessageDialog(null, "Declaration is required!");
        }else{
        try {
            if (acctype.equals("")) {
                JOptionPane.showMessageDialog(null, "Account type is required!");
            } else {
                connection conn = new connection();
                String query = "insert into signup3 values('" + formno + "','" + acctype + "','" + cardno + "','" + pinno + "','" + facility + "')";
                String query2 = "insert into login values('" + formno + "','" + cardno + "','" + pinno + "')";
                conn.s.executeUpdate(query);
                conn.s.executeUpdate(query2);

                JOptionPane.showMessageDialog(null, "Card Number: " + cardno + "\n Pin: " + pinno);
                setVisible(false);
                new Login().setVisible(true);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        }
    } else if (ae.getSource() == cancel) {
        // 1. Clear the Radio Button Selection
        grpacc.clearSelection();

        // 2. Uncheck all Checkboxes
        c1.setSelected(false);
        c2.setSelected(false);
        c3.setSelected(false);
        c4.setSelected(false);
        c5.setSelected(false);
    }
}
    public static void main(String[] args) {
        new Signup3("");
    }
}
