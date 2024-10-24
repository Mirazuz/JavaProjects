package com.task5;

import javax.swing.*;

public class Third extends JFrame{

    public Third(String imagePath) {
        
        setTitle("Image Display");

       
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Загружаем изображение
        ImageIcon imageIcon = new ImageIcon(imagePath);
        

        JLabel label = new JLabel(imageIcon);

        add(label);

    
        pack();

        setVisible(true);
    }

    public void close() {
        dispose();
    }
    
    
    
}
