package com.practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyWindow extends JFrame {

    private JLabel heading;
    private JLabel clockLabel;
    private Font font = new Font("",Font.BOLD,35);
    MyWindow()
    {
        super.setTitle("my clock");
        super.setSize(400,400);
        super.setLocation(300,50);
        super.setVisible(true);

        this.createGUI();
        this.startClock();

    }

    public void createGUI(){
        heading=new JLabel("my clock");
        clockLabel=new JLabel("cock");
        heading.setFont(font);
        clockLabel.setFont(font);

        this.setLayout(new GridLayout(2,1));
        this.add(heading);
        this.add(clockLabel);

    }

    public void startClock(){
        Timer timer=new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//               String dateTime=new Date().toString() ;
//                String dateTime=new Date().toLocaleString();
               Date d=new Date();
                SimpleDateFormat sfd =new SimpleDateFormat("hh:mm:ss aa");

                String dateTime=sfd.format(d);
                clockLabel.setText(dateTime);



            }
        });

        timer.start();

    }
}
