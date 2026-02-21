package ATMSimpublic;

import  javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignUp2 extends JFrame implements ActionListener{
    JTextField aadhar,pan;
    JButton next;
    JRadioButton yes,no;
    JComboBox religion,category,inccat,education,occupation;
    String formno;

    SignUp2(String formno)
    {
        this.formno=formno;
        setLayout(null);
        setTitle("New Account Application Form- Page 2");

        JLabel addDet= new JLabel("Page 2: Additional Details ");
        addDet.setFont(new Font("Raleway",Font.BOLD,22));
        addDet.setBounds(290,80,400,30);
        add(addDet);

        JLabel name= new JLabel("Religion ");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);

        String valrel[]= {"Hindu","Muslim","Sikh","Christian","Other"};
        religion =new JComboBox(valrel);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);

        JLabel fname= new JLabel("Category ");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);

        String valcat[]={"General","EWS","OBC","SC","ST"};
        category=new JComboBox(valcat);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);

        JLabel annualIncome= new JLabel("Annual Income ");
        annualIncome.setFont(new Font("Raleway",Font.BOLD,20));
        annualIncome.setBounds(100,240,200,30);
        add(annualIncome);

        String incomecat[]={"NULL","<1,50,000","<5,00,000","<10,00,000",">10,00,000"};
        inccat=new JComboBox(incomecat);
        inccat.setBounds(300,240,400,30);
        inccat.setBackground(Color.WHITE);
        add(inccat);

        JLabel edu= new JLabel("Educational");
        edu.setFont(new Font("Raleway",Font.BOLD,20));
        edu.setBounds(100,300,200,30);
        add(edu);

        JLabel qualification= new JLabel("Qualification ");
        qualification.setFont(new Font("Raleway",Font.BOLD,20));
        qualification.setBounds(100,335,200,30);
        add(qualification);

        String educval[]={"None","Upto 8th","SSC","HSC","Diploma/ITI","Graduate"};
        education=new JComboBox(educval);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE);
        add(education);

        JLabel occu= new JLabel("Occupation ");
        occu.setFont(new Font("Raleway",Font.BOLD,20));
        occu.setBounds(100,390,200,30);
        add(occu);

        String occupationval[]={"Student","Salaried","Self-Employed","Business","Retired"};
        occupation=new JComboBox(occupationval);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);

        JLabel city= new JLabel("Aadhar number ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,440,200,30);
        add(city);

        aadhar= new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD,18));
        aadhar.setBounds(300,440,400,30);
        add(aadhar);

        JLabel state= new JLabel("Pan number ");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,490,200,30);
        add(state);

        pan= new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,18));
        pan.setBounds(300,490,400,30);
        add(pan);

        JLabel pin= new JLabel("Do you already have an account in our bank?");
        pin.setFont(new Font("Raleway",Font.BOLD,20));
        pin.setBounds(100,540,500,25);
        add(pin);

        yes= new JRadioButton("Yes");
        yes.setBounds(550,540,80,30);
        yes.setBackground(Color.WHITE);
        add(yes);

        no= new JRadioButton("No");
        no.setBounds(650,540,80,30);
        no.setBackground(Color.WHITE);
        add(no);

        ButtonGroup gendergrp= new ButtonGroup();
        gendergrp.add(yes);
        gendergrp.add(no);

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
        String srelig=(String) religion.getSelectedItem();
        String scat=(String) category.getSelectedItem();
        String sinc=(String) inccat.getSelectedItem();
        String sedu=(String) education.getSelectedItem();
        String socc=(String) occupation.getSelectedItem();
        String existingacc=null;
        if(yes.isSelected())
            existingacc="Yes";
        else if (no.isSelected())
            existingacc="No";
        String span=pan.getText();
        String saadhar=aadhar.getText();

        String aadharPattern = "^\\d{12}$"; // 12 digits
        String panPattern = "[A-Z]{5}[0-9]{4}[A-Z]{1}"; // Standard PAN format

        try{
            if(!span.matches(panPattern)) {
                JOptionPane.showMessageDialog(null, "Enter a valid PAN Number (e.g., ABCDE1234F)");
            } else if (!saadhar.matches(aadharPattern)) {
                JOptionPane.showMessageDialog(null, "Enter a valid 12-digit Aadhar Number!");
            } else {
                connection c = new connection();
                String query = "insert into signuptwo values('" + formno + "','" + srelig + "','" + scat + "','" + sinc + "','" + sedu + "','" + socc + "','" + saadhar + "','" + span + "','" + existingacc + "')";
                c.s.executeUpdate(query);

                setVisible(false);
                new Signup3(formno).setVisible(true);
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        new SignUp2("");
    }
}
