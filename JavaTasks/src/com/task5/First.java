package com.task5;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.*;

public class First extends JFrame{
    
    private int AC_score = 0;
    private int Real_M_score = 0;
    private JLabel result;
    private JLabel last_score;
    private JLabel winner;

    public First() {
        // Создадим общий фрейм
        JFrame frame = new JFrame("First test");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500, 500);
        //

        //Добавим основные текста и кнопки
        JPanel panel = new JPanel();

        JButton Button_Real_M = new JButton("Real Madrid");
        JButton Button_AC = new JButton("AC Milan");

        panel.setPreferredSize(new Dimension(250, 250));
        panel.add(Button_AC);
        panel.add(Button_Real_M);

        //Добавим текст который будет изменяться
        result = new JLabel("Result: 0 X 0");
        last_score = new JLabel("Last Scorer: N/A");
        winner = new JLabel("Winner: DRAW");

        panel.add(result);
        panel.add(last_score);
        panel.add(winner);
        //

        //Действия
        Button_AC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AC_score++;
                updateResult("AC Milan");
            }
        });

        Button_Real_M.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Real_M_score++;
                updateResult("Real Madrid");
            }
        });
        //

        //Итог
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public void close() {
        dispose();
    }

    public void updateResult(String lastScorer) {
        result.setText("Result: " + AC_score + " X " + Real_M_score);
        last_score.setText("Last Scorer: " + lastScorer);

        if (AC_score > Real_M_score) {
            winner.setText("Winner: AC Milan");
        } else if (Real_M_score > AC_score) {
            winner.setText("Winner: Real Madrid");
        } else {
            winner.setText("Winner: DRAW");
        }
    }
}