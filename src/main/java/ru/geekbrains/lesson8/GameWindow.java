package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {
    private static final int WINDOW_WIDTH = 600;
    private static final int WINDOW_HEIGHT = 640;
    private static final int WINDOW_POS_X = 640;
    private static final int WINDOW_POS_Y = 230;

    private GameMap map;

    GameWindow(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
//        setLocation(WINDOW_POS_X, WINDOW_POS_Y);
        setLocation(700,400);
        setTitle("Tic Tac Toe");
        setResizable(false);

        JButton btnStart = new JButton("<html><body><b>Start</b></body></html>");
        JButton btnExit = new JButton("<html><body><b>EXIT</b></body></html>");

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1,2));
        buttonPanel.add(btnStart);
        buttonPanel.add(btnExit);

        GameMap gameMap = new GameMap();
        SettingsWindow settingsWindow = new SettingsWindow(this);

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingsWindow.setVisible(true);
            }
        });

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        add(gameMap);
        add(buttonPanel, BorderLayout.SOUTH);
        setVisible(true);
    }

}
