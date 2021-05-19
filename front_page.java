package com.company;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Front_Page implements ActionListener{
    JFrame f;
    JLabel id,l1;
    JButton b;
    Front_Page(){

        f=new JFrame("Employee Record System");
        f.setBackground(Color.black);
        f.setLayout(null);
        b = new JButton("CLICK HERE TO CONTINUE");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);



        b.setBounds(80,110,300,70);
        b.addActionListener(this);

        id=new JLabel();
        id.setBounds(0,0,1000,750);
        id.setLayout(null);
        id.setBackground(Color.yellow);



        JLabel lid=new JLabel("EMPLOYEE RECORD SYSTEM");
        lid.setBounds(80,30,1500,100);
        lid.setFont(new Font("serif",Font.PLAIN,40));
        lid.setForeground(Color.black);
        id.add(lid);

        id.add(b);
        f.add(id);


        f.getContentPane().setBackground(Color.WHITE);

        f.setVisible(true);
        f.setSize(1360,750);
        f.setLocation(200,100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b) {
            f.setVisible(false);
            login l=new login();
        }
    }


    public static void main(String[] arg){
        Front_Page f = new Front_Page();
    }
}
