package com.lewi0231;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class MyFrame extends JFrame implements ActionListener {
    JComboBox<String> comboBox;
    Circle circle;
    DrawingPanel panel;

    public MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(750, 750));

        Circle circle = new Circle(100, 100, 100, 100, Color.RED);
        panel = new DrawingPanel();
        panel.setShape(circle);

        this.getContentPane().add(panel);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
