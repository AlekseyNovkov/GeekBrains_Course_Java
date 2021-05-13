package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sample {
    public static void main(String[] args) {
        new SampleWindow();
    }


    static class SampleWindow extends JFrame {
        int count = 0;
        SampleWindow(){
            setSize(800,600);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocation(700,400);
            setTitle("Our Sample");

            JButton btn1 = new JButton("Button_1");
            JButton btn2 = new JButton("Button_2");
            JButton btn3 = new JButton("Button_3");
            JPanel jpanel = new JPanel();
            jpanel.setLayout(new FlowLayout());
            add(jpanel, BorderLayout.SOUTH);

//            jpanel.setLayout(new BoxLayout(jpanel,1));

//            setLayout(new BoxLayout(this, 0));
//            setPreferredSize(new Dimension(0, 150));
            add(btn1, BorderLayout.NORTH);
            add(btn2, BorderLayout.SOUTH);
            add(btn3, BorderLayout.CENTER);

            jpanel.add(btn2);
            jpanel.add(btn3);
            jpanel.add(btn1);

            btn3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    count++;
//                    btn3.setC
                }
            });
        }
    }
}
