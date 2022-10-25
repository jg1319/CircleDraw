import java.awt.*;

public class Rect {
    private int w;	// Fields
    private int h;
    private Point pos;	// AWT class Point
    private Color col;     // AWT class Color

    public Rect(Point initPos, Color col, int width, int height){ // The constructor
        w=width;	// Initialize the fields of the object
        h=height;
        pos=initPos;
        this.col=col;
    }

    public void draw(Graphics g) {  // A method that draws the object in c
        g.setColor(col);
        g.fillRect(pos.x, pos.y, w, h);
    }
}
