package com.lewi0231;

import javax.swing.*;
import java.awt.*;

public interface Shape {
    public void setLocation(int x, int y);
    public void setSize(int width, int height);

    public void setColor(Color color);

    public int getX();
    public int getY();

    public int getWidth();
    public int getHeight();

    public Color getColor();

    public void paint(Graphics g);

}
