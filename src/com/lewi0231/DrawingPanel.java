package com.lewi0231;

import javax.swing.*;
import java.awt.*;

public class DrawingPanel extends JPanel {
    private Shape shape;

    public DrawingPanel(){
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(400, 400));
    }

    public void setShape(Shape shape){
        this.shape = shape;
    }

    public Shape getShape() {
        return shape;
    }

    public void paintComponent(Graphics page) {
        super.paintComponent(page);

        Shape shape = getShape();
        if (shape != null) {
            shape.paint(page);
        }
    }


}
