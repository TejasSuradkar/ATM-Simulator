package ATMSimpublic;
import  javax.swing.*;
import java.awt.*;
import java.util.Random;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignUpOne extends JFrame implements ActionListener{

    long random;
    JTextField nametxtfld,fnametxtfld,emailtxtfld,addtxtfld,citytxtfld,statetxtfld, pinctxtfield;
    JButton next;
    JRadioButton male,female;
    JDateChooser dateChooser;

    SignUpOne(){
        setLayout(null);

        Random ran= new Random();
        random=Math.abs((ran.nextLong()%9000L+1000L));

        JLabel formno= new JLabel("Application Form Number: "+random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);

        JLabel perData= new JLabel("Page 1: Personal Details ");
        perData.setFont(new Font("Raleway",Font.BOLD,22));
        perData.setBounds(290,80,400,30);
        add(perData);

        JLabel name= new JLabel("Name: ");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);

        nametxtfld= new JTextField();
        nametxtfld.setFont(new Font("Raleway",Font.BOLD,18));
        nametxtfld.setBounds(300,140,400,30);
        add(nametxtfld);

        JLabel fname= new JLabel("Father's name: ");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);

        fnametxtfld= new JTextField();
        fnametxtfld.setFont(new Font("Raleway",Font.BOLD,18));
        fnametxtfld.setBounds(300,190,400,30);
        add(fnametxtfld);

        JLabel dob= new JLabel("Date of Birth ");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);

        dateChooser=new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);

        JLabel Gender= new JLabel("Gender: ");
        Gender.setFont(new Font("Raleway",Font.BOLD,20));
        Gender.setBounds(100,290,200,30);
        add(Gender);

        male= new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE );
        add(male);

        female= new JRadioButton("Female");
        female.setBounds(450,290,90,30);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup gendergrp= new ButtonGroup();
        gendergrp.add(male);
        gendergrp.add(female);

        JLabel email= new JLabel("Email Address: ");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);

        emailtxtfld= new JTextField();
        emailtxtfld.setFont(new Font("Raleway",Font.BOLD,18));
        emailtxtfld.setBounds(300,340,400,30);
        add(emailtxtfld);

        JLabel address= new JLabel("Address: ");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,390,200,30);
        add(address);

        addtxtfld= new JTextField();
        addtxtfld.setFont(new Font("Raleway",Font.BOLD,18));
        addtxtfld.setBounds(300,390,400,30);
        add(addtxtfld);

        JLabel city= new JLabel("City: ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,440,200,30);
        add(city);

        citytxtfld= new JTextField();
        citytxtfld.setFont(new Font("Raleway",Font.BOLD,18));
        citytxtfld.setBounds(300,440,400,30);
        add(citytxtfld);

        JLabel state= new JLabel("State: ");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,490,200,30);
        add(state);

        statetxtfld= new JTextField();
        statetxtfld.setFont(new Font("Raleway",Font.BOLD,18));
        statetxtfld.setBounds(300,490,400,30);
        add(statetxtfld);

        JLabel pinc= new JLabel("Pin code: ");
        pinc.setFont(new Font("Raleway",Font.BOLD,20));
        pinc.setBounds(100,540,200,30);
        add(pinc);

        pinctxtfield = new JTextField();
        pinctxtfield.setFont(new Font("Raleway",Font.BOLD,18));
        pinctxtfield.setBounds(300,540,400,30);
        add(pinctxtfield);

        next= new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(400,660,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.white);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        String formno=""+ random;
        String name= nametxtfld.getText();
        String fname= fnametxtfld.getText();
        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gend=null;
        if(male.isSelected())
            gend="male";
        else if (female.isSelected())
            gend="female";
        String email=emailtxtfld.getText();
        String add=addtxtfld.getText();
        String city=citytxtfld.getText();
        String state=statetxtfld.getText();
        String pinc= pinctxtfield.getText();

        String namePattern = "^[a-zA-Z\\s]{3,30}$";
        String emailPattern = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

        try{
            if (name.isEmpty() || !name.matches(namePattern)) {
                JOptionPane.showMessageDialog(null, "Please enter a valid Name!");
            }else if (email.isEmpty() || !email.matches(emailPattern))
                JOptionPane.showMessageDialog(null,"Please enter a valid Email address!");
            else if (add.isEmpty())
                JOptionPane.showMessageDialog(null,"Address is required!");
            else if (city.isEmpty() || !name.matches(namePattern))
                JOptionPane.showMessageDialog(null,"Please enter a valid City name!");
            else if (state.isEmpty() || !name.matches(namePattern))
                JOptionPane.showMessageDialog(null,"Please enter a valid State name!");
            else if (pinc.isEmpty())
                JOptionPane.showMessageDialog(null,"Pin is required!");

            else {
                connection c=new connection();
                String query="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gend+"','"+email+"','"+add+"','"+city+"','"+state+"','"+pinc+"')";
                c.s.executeUpdate(query);

                setVisible(false);
                new SignUp2(formno).setVisible(true);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new SignUpOne();

    }
}
