package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;

public class GameMap extends JPanel {
    private int fieldSizeX;
    private int fieldSizeY;
    private int winLength;
    private int[][] field;
    private boolean isGameOver;
//    !!!!!!!!!!!!!!!

    public GameMap(){
        addMouseListener(new MouseAdapter() {
//          !!!!!!!!!!!!!!
        });
    }

    public void startNewGame(int gameMode, int feildSize, int winLength){
        this.fieldSizeX = feildSize;
        this.fieldSizeY = feildSize;
        this.winLength = winLength;
        field = new int[fieldSizeY][fieldSizeX];

        isGameOver = false;
        //      !!!!!!!
    }
}
