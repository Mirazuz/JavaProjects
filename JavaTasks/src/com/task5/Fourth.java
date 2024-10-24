package com.task5;

import javax.swing.*;

public class Fourth extends JFrame{

    private JLabel imgLabel;
    private int imgNum = 1;

    public Fourth()
    {
        this.setSize(1200, 1200);
        imgLabel = new JLabel("", new ImageIcon(getClass().getResource("1.jpeg")), SwingConstants.CENTER);

        getContentPane().add(imgLabel);

        Timer timer = new Timer(2000, e -> nextImg());
        timer.start();
    }

    public void nextImg()
    {
        imgLabel.setIcon(new ImageIcon(getClass().getResource((++imgNum)+".jpeg")));
        if(imgNum == 3) imgNum = 0;
    }

    public void close() {
        dispose();
    }

}
