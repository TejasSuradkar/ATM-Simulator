package ATMSimpublic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transactions extends Selection implements ActionListener {
JButton deposit,withdraw,fastcash,minist,pinchange,balinq,exit;
String cardno;
    Transactions(String cardno){
        this.cardno=cardno;
        setLayout(null);

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2= i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        JLabel txt= new JLabel("Please select your Transaction:");
        txt.setBounds(225,320,700,45);
        txt.setForeground(Color.WHITE);
        txt.setFont(new Font("System",Font.BOLD,16));
        image.add(txt);

        deposit=new JButton("Deposit");
        deposit.setBounds(170,415,150,30);
        deposit.addActionListener(this);
        image.add(deposit);

        withdraw=new JButton("Cash Withdrawal");
        withdraw.setBounds(350,415,150,30);
        withdraw.addActionListener(this);
        image.add(withdraw);

        fastcash=new JButton("Fast Cash");
        fastcash.setBounds(170,450,150,30);
        fastcash.addActionListener(this);
        image.add(fastcash);

        minist=new JButton("Mini Statement");
        minist.setBounds(350,450,150,30);
        minist.addActionListener(this);
        image.add(minist);

        pinchange=new JButton("Pin Change");
        pinchange.setBounds(170,485,150,30);
        pinchange.addActionListener(this);
        image.add(pinchange);

        balinq=new JButton("Balance Enquiry");
        balinq.setBounds(350,485,150,30);
        balinq.addActionListener(this);
        image.add(balinq);

        exit=new JButton("Exit");
        exit.setBounds(350,520,150,30);
        exit.addActionListener(this);
        image.add(exit);

        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==exit){
            System.exit(0);

        } else if (ae.getSource()==deposit) {
            setVisible(false);
            new Selection().Deposit(cardno);

        } else if (ae.getSource()==withdraw) {
            setVisible(false);
            new Selection().withdrawl(cardno);

        } else if (ae.getSource()==fastcash) {
            setVisible(false);
            new Selection().fastcash(cardno);

        } else if (ae.getSource()==minist) {
            new Selection().ministatement(cardno);

        } else if (ae.getSource()==pinchange) {
            setVisible(false);
            new Selection().pinchange(cardno);

        } else if (ae.getSource()==balinq) {
            setVisible(false);
            new Selection().balanceinq(cardno);
        }
    }

    public static void main(String[] args) {
        new Transactions("");
    }
}
