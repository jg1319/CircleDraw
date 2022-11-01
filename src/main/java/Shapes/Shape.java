package Shapes;

import java.awt.*;

public abstract class Shape implements Drawable {
    protected Point pos;    // AWT class Point
    protected Color col;     // AWT class Color

    public Shape(Point initPos, Color col) {
        pos = initPos;
        this.col = col;
    }

}
