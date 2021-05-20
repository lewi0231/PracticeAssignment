package com.lewi0231;

import java.awt.*;

public class Circle extends AbstractShape {
    public Circle() {
    }

    public Circle(int x, int y, int width, int height, Color color) {
        setLocation(x, y);
        setSize(width, height);
        setColor(color);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(getColor());
        g.drawOval(getX(), getY(), getWidth(), getHeight());
    }
}
