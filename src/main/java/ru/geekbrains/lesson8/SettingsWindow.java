package ru.geekbrains.lesson8;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsWindow extends JFrame {
    private static final int WINDOW_WIDTH = 350;
    private static final int WINDOW_HEIGHT = 300;
    private static final int MIN_WIN_LENGTH = 3;
    private static final int MIN_FIELD_SIZE = 3;
    private static final int MAX_FIELD_SIZE = 10;
    private static final String FIELD_SIZE_PREF = "Field size: ";
    private static final String WIN_LENGTH_PREF = "Field size: ";

    private GameWindow gameWindow;
    private JSlider sliderWinLength;
    private JSlider sliderFieldSize;
    private JRadioButton humanVsAI;
    private JRadioButton humanVsHuman;

    SettingsWindow(GameWindow gameWindow){
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocationRelativeTo(gameWindow);
        setResizable(false);
        setTitle("Create new Game");
        setLayout(new GridLayout(10,1));

        addGameMod();

        addFieldSize();
        JButton buttonStartGame = new JButton("Start New Game");
        buttonStartGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveSettings();
            }
        });
        add(buttonStartGame);
    }

    private void saveSettings() {
        int gameMode;
        if(humanVsAI.isSelected()){
            gameMode = 0;
        } else if (humanVsHuman.isSelected()){
            gameMode = 1;
        } else {
            throw new RuntimeException("INVALID GAME MADE!");
        }

        int fieldSize = MIN_FIELD_SIZE;
        int fieldLength = MIN_WIN_LENGTH;
//        !!!!!!!!!!!!!!!!!!!!!!!!!
    }

    private void addFieldSize() {
        JLabel lableFieldSize = new JLabel(FIELD_SIZE_PREF + MIN_FIELD_SIZE);
        JLabel lableWinLength = new JLabel(WIN_LENGTH_PREF + MIN_WIN_LENGTH);

        sliderFieldSize = new JSlider(MIN_FIELD_SIZE, MAX_FIELD_SIZE, MIN_FIELD_SIZE);
        sliderWinLength = new JSlider(MIN_WIN_LENGTH, MAX_FIELD_SIZE, MIN_FIELD_SIZE);

        sliderFieldSize.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int currentValue = sliderFieldSize.getValue();
                lableFieldSize.setText(FIELD_SIZE_PREF + currentValue);
                sliderWinLength.setMaximum(currentValue);
            }
        });

        sliderWinLength.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lableWinLength.setText(WIN_LENGTH_PREF + sliderWinLength.getValue());
            }
        });

        add(new JLabel("Choose field size: "));
        add(lableFieldSize);
//      !!!!!!!!!!!!!
        add(new JLabel("Choose win length: "));
        add(lableWinLength);
//      !!!!!!!!!!!!!
    }

    private void addGameMod() {
        add(new JLabel("Choose game mod:"));
        humanVsAI = new JRadioButton("Human versus AI", true);
        humanVsHuman = new JRadioButton("Human versus Human");
        ButtonGroup buttonMode = new ButtonGroup();
        buttonMode.add(humanVsAI);
        buttonMode.add(humanVsHuman);
        add(humanVsAI);
        add(humanVsHuman);
    }

}
