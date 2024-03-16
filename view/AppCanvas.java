package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import controller.App;
import model.Marking;
import model.TicTacToeGame;

public class AppCanvas extends JPanel{
    
    public static final int WIDTH = 400;
    public static final int HEIGHT = 100;

    public AppCanvas() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        App.win.getGameState().updateCanvas(g2);

    }

}
