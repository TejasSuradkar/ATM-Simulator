package ATMSimpublic;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JButton login,sup,clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    Login() {
        JLabel text=new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);

        JLabel cardno=new JLabel("Card NO:");
        cardno.setFont(new Font("Raleway", Font.BOLD,28));
        cardno.setBounds(120,150,150,30);
        add(cardno);

        cardTextField = new JTextField();
        cardTextField.setBounds(300,150,250,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,18));
        add(cardTextField);

        JLabel pin=new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD,28));
        pin.setBounds(120,220,400,30);
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(300,220,250,30);
        add(pinTextField);

//Buttons Creation
        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.green);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);

        clear = new JButton("CLEAR");
        clear.setBounds(450, 300, 100, 30);
        clear.setBackground(Color.red);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);

        sup = new JButton("SIGN UP");
        sup.setBounds(300, 350, 250, 30);
        sup.setBackground(Color.BLUE);
        sup.setForeground(Color.white);
        sup.addActionListener(this);
        add(sup);

        setTitle("Automated Teller Machine");
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label =new JLabel(i3);
        label.setBounds(80,10,100,100);
        add(label);

        getContentPane().setBackground(Color.white);
        setSize(800,480);
        setVisible(true);
        setLocation(380,200);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==clear){
            cardTextField.setText("");
            pinTextField.setText("");

        } else if (ae.getSource()==login) {
            connection conn=new connection();
            String cardno=cardTextField.getText();
            String pinno=pinTextField.getText();
            String query="select * from login where cardNumber ='"+cardno+"' and pin='"+pinno+"'";
            try{
               ResultSet rs= conn.s.executeQuery(query);
               if(rs.next()) {
                   setVisible(false);
                   new Transactions(cardno).setVisible(true);
               }else {
                   JOptionPane.showMessageDialog(null,"Incorrect card number or Pin");
               }
            }
            catch (Exception e){
                System.out.println(e);
            }

        } else if (ae.getSource()==sup) {
            setVisible(false);
            new SignUpOne().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
