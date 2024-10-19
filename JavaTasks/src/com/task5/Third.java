package com.task5;

import javax.swing.*;

public class Third extends JFrame{

    public Third(String imagePath) {
        
        setTitle("Image Display");

       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Загружаем изображение
        ImageIcon imageIcon = new ImageIcon(imagePath);


        JLabel label = new JLabel(imageIcon);

        add(label);

    
        pack();

        setVisible(true);
    }
    
    
    
}
