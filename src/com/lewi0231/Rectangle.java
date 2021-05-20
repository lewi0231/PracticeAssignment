package com.lewi0231;

import java.awt.*;

public class Rectangle extends AbstractShape {

    public Rectangle() {
    }

    public Rectangle(int x, int y, int width, int height, Color color) {
        setLocation(x, y);
        setSize(width, height);
        setColor(color);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(getColor());
        g.drawRect(getX(), getY(), getWidth(), getHeight());
    }
}
