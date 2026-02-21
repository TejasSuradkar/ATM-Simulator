package ATMSimpublic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Selection extends JFrame implements ActionListener {
    JLabel img,txt,txt2,pintxt,repintxt;
    JTextField amt;
    JPasswordField pin,repin;
    JButton deposit,withdraw,back,amt1,amt2,amt3,amt4,change;
    String cardnum;

    public void Deposit(String cardno){
        this.cardnum=cardno;

        ImageIcon im1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image im2= im1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon im3=new ImageIcon(im2);
        img= new JLabel(im3);
        img.setBounds(0,0,900,900);
        add(img);

        txt=new JLabel("Enter the amount you want to deposit:");
        txt.setForeground(Color.WHITE);
        txt.setFont(new Font("System",Font.BOLD,16));
        txt.setBounds(175,300,400,20);
        img.add(txt);

        amt=new JTextField();
        amt.setFont(new Font("Raleway",Font.BOLD,22));
        amt.setBounds(175,350,320,25);
        img.add(amt);

        deposit=new JButton("Deposit");
        deposit.setBounds(355,485,150,30);
        deposit.addActionListener(this);
        img.add(deposit);

        back=new JButton("Back");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        img.add(back);

        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }

    public void withdrawl(String cardno){
        this.cardnum=cardno;
        ImageIcon im1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image im2= im1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon im3=new ImageIcon(im2);
        img= new JLabel(im3);
        img.setBounds(0,0,900,900);
        add(img);

        txt=new JLabel("Enter the amount you want to withdraw:");
        txt.setForeground(Color.WHITE);
        txt.setFont(new Font("System",Font.BOLD,16));
        txt.setBounds(175,300,400,20);
        img.add(txt);

        amt=new JTextField();
        amt.setFont(new Font("Raleway",Font.BOLD,22));
        amt.setBounds(175,350,320,25);
        img.add(amt);

        withdraw=new JButton("Withdraw");
        withdraw.setBounds(355,485,150,30);
        withdraw.addActionListener(this);
        img.add(withdraw);

        back=new JButton("Back");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        img.add(back);

        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }

    public void fastcash(String cardno){
        this.cardnum=cardno;
        setLayout(null);

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2= i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        img= new JLabel(i3);
        img.setBounds(0,0,900,900);
        add(img);

        txt= new JLabel("Select Withdrawal Amount:");
        txt.setBounds(225,320,700,45);
        txt.setForeground(Color.WHITE);
        txt.setFont(new Font("System",Font.BOLD,16));
        img.add(txt);

        amt1=new JButton("Rs.100");
        amt1.setBounds(170,415,150,30);
        amt1.addActionListener(this);
        img.add(amt1);

        amt2=new JButton("Rs.500");
        amt2.setBounds(350,415,150,30);
        amt2.addActionListener(this);
        img.add(amt2);

        amt3=new JButton("Rs.1000");
        amt3.setBounds(170,450,150,30);
        amt3.addActionListener(this);
        img.add(amt3);

        amt4=new JButton("Rs.2000");
        amt4.setBounds(350,450,150,30);
        amt4.addActionListener(this);
        img.add(amt4);

        back=new JButton("Back");
        back.setBounds(350,520,150,30);
        back.addActionListener(this);
        img.add(back);

        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }

    public void pinchange(String cardno){
        this.cardnum=cardno;
        setLayout(null);

        ImageIcon im1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image im2= im1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon im3=new ImageIcon(im2);
        img= new JLabel(im3);
        img.setBounds(0,0,900,900);
        add(img);

        txt= new JLabel("CHANGE YOUR PIN :");
        txt.setBounds(250,300,500,35);
        txt.setForeground(Color.WHITE);
        txt.setFont(new Font("System",Font.BOLD,16));
        img.add(txt);

        pintxt= new JLabel("New PIN:");
        pintxt.setBounds(165,340,150,25);
        pintxt.setForeground(Color.WHITE);
        pintxt.setFont(new Font("System",Font.BOLD,14));
        img.add(pintxt);

        pin=new JPasswordField();
        pin.setFont(new Font("Raleway",Font.BOLD,20));
        pin.setBounds(360,340,150,25);
        img.add(pin);

        repintxt= new JLabel("Re-Enter your new PIN:");
        repintxt.setBounds(165,380,180,25);
        repintxt.setForeground(Color.WHITE);
        repintxt.setFont(new Font("System",Font.BOLD,14));
        img.add(repintxt);

        repin=new JPasswordField();
        repin.setFont(new Font("Raleway",Font.BOLD,20));
        repin.setBounds(360,380,150,25);
        img.add(repin);

        change=new JButton("CHANGE");
        change.setBounds(355,485,150,30);
        change.addActionListener(this);
        img.add(change);

        back=new JButton("BACK");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        img.add(back);

        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }

    public void balanceinq(String cardno){
        this.cardnum=cardno;
        setLayout(null);

        ImageIcon im1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image im2= im1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon im3=new ImageIcon(im2);
        img= new JLabel(im3);
        img.setBounds(0,0,900,900);
        add(img);

        connection c=new connection();
        int bal=0;
        try{
            ResultSet rs= c.s.executeQuery("select * from bank where cardNumber='"+cardnum+"'");
            while(rs.next()){
                if(rs.getString("type").equals("Deposit"))
                    bal+=Integer.parseInt(rs.getString("amount"));
                else
                    bal-= Integer.parseInt(rs.getString("amount"));
            }
        } catch(Exception e2){System.out.println(e2);}

        txt= new JLabel("Your current account balance is ");
        txt.setBounds(190,300,400,40);
        txt.setForeground(Color.WHITE);
        txt.setFont(new Font("System",Font.BOLD,18));
        img.add(txt);

        txt2= new JLabel("Rs."+bal);
        txt2.setBounds(290,325,400,40);
        txt2.setForeground(Color.WHITE);
        txt2.setFont(new Font("System",Font.BOLD,20));
        img.add(txt2);

        back=new JButton("BACK");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        img.add(back);

        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }

    public void ministatement(String cardno){

        setTitle("Mini Statement");
        this.cardnum=cardno;
        setLayout(null);

        JLabel mini=new JLabel();
        mini.setBounds(20,70,400,200);
        add(mini);

        JLabel bank=new JLabel("Indian National Bank");
        bank.setFont(new Font("System",Font.BOLD,20));
        bank.setBounds(105,20,250,20);
        add(bank);

        JLabel card=new JLabel();
        card.setBounds(20,80,300,20);
        card.setText("Card number: "+cardnum.substring(0,4)+"xxxxxxxx"+cardnum.substring(12));
        add(card);

        JLabel bal=new JLabel();
        bal.setBounds(20,400,300,20);
        add(bal);

        try{
            connection conn=new connection();
            int balance=0;
            ResultSet rs= conn.s.executeQuery("select * from bank where cardNumber='"+cardnum+"'");
            while(rs.next()){
                mini.setText(mini.getText() + "<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount")+"<br><br><html>");
                if(rs.getString("type").equals("Deposit"))
                    balance+=Integer.parseInt(rs.getString("amount"));
                else
                    balance-= Integer.parseInt(rs.getString("amount"));
            }
            bal.setText("Your current account balance is Rs."+balance);
        } catch (Exception e) { System.out.println(e);}

        setSize(400,600);
        setLocation(20,20);
        getContentPane().setBackground(Color.white);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==deposit){
            String num=amt.getText();
            String value= "^[1-9]\\d*$";
            Date date=new Date();
            if(num.isEmpty() || !num.matches(value))
                JOptionPane.showMessageDialog(null,"Please enter a valid amount you want to deposit!");
            else {
                try{
                connection conn=new connection();
                String qry="insert into bank values('"+cardnum+"','"+date+"','Deposit','"+num+"')";
                conn.s.executeUpdate(qry);
                JOptionPane.showMessageDialog(null,"Rs."+num+" Deposited Successfully.");
                setVisible(false);
                new Transactions(cardnum).setVisible(true);
            }catch (Exception ex){
                    System.out.println(ex);
                }}

        } else if (e.getSource()==withdraw) {
            String num=amt.getText();
            String value= "^[1-9]\\d*$";
            Date date=new Date();
            if(num.isEmpty() || !num.matches(value))
                JOptionPane.showMessageDialog(null,"Please enter a valid amount you want to withdraw!");
            else{
                try{
                    connection conn=new connection();
                    ResultSet rs= conn.s.executeQuery("select * from bank where cardNumber='"+cardnum+"'");
                    int bal=0;
                    while(rs.next()){
                        if(rs.getString("type").equals("Deposit"))
                            bal+=Integer.parseInt(rs.getString("amount"));
                        else
                            bal-= Integer.parseInt(rs.getString("amount"));
                    }
                    if(e.getSource()!=back && bal<Integer.parseInt(num)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    } else {
                        String qry = "insert into bank values('" + cardnum + "','" + date + "','Withdrawal','" + num + "')";
                        conn.s.executeUpdate(qry);
                        JOptionPane.showMessageDialog(null, "Rs." + num + " withdrawn Successfully.");
                    }
                    setVisible(false);
                    new Transactions(cardnum).setVisible(true);
                }catch (Exception ex){
                    System.out.println(ex);
                }}

        } else if (e.getSource()==amt1 || e.getSource()==amt2 || e.getSource()==amt3 || e.getSource()==amt4) //Fast Cash Action listener
            {
            String amount=((JButton)e.getSource()).getText().substring(3);
            connection c=new connection();
            try{
                ResultSet rs= c.s.executeQuery("select * from bank where cardNumber='"+cardnum+"'");
                int bal=0;
                while(rs.next()){
                    if(rs.getString("type").equals("Deposit"))
                        bal+=Integer.parseInt(rs.getString("amount"));
                    else
                        bal-= Integer.parseInt(rs.getString("amount"));
                }
                if(e.getSource()!=back && bal<Integer.parseInt(amount)) {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }
                Date date=new Date();
                String query="insert into bank values('"+cardnum+"','"+date+"','Withdrawal','"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs."+amount+" debited successfully.");

                setVisible(false);
                new Transactions(cardnum).setVisible(true);
            }catch (Exception e1){
                System.out.println(e1);
            }

        } else if (e.getSource()==change) {
            try{
                String npin=pin.getText();
                String rpin=repin.getText();

                if(npin.length()>4 || rpin.length()>4){
                    JOptionPane.showMessageDialog(null,"PIN should be of 4 Digit only!");
                    return;
                }
                if(!npin.equals(rpin)){
                    JOptionPane.showMessageDialog(null,"Entered PIN is not matching.");
                    return;
                }
                if(npin.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please Enter your new PIN.");
                    return;
                }
                if(rpin.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please Re-Enter new PIN.");
                    return;
                }
                connection conn=new connection();
                String q1="update login set pin='"+rpin+"'where cardNumber='"+cardnum+"'";
                String q2="update signup3 set pin='"+rpin+"'where cardno='"+cardnum+"'";

                conn.s.executeUpdate(q1);
                conn.s.executeUpdate(q2);
                JOptionPane.showMessageDialog(null,"PIN changed successfully.");

                setVisible(false);
                new Transactions(cardnum).setVisible(true);
            }catch (Exception e1) {
                System.out.println(e1);
            }

        } else{//action listener for back button
            setVisible(false);
            new Transactions(cardnum).setVisible(true);
        }
    }
}
