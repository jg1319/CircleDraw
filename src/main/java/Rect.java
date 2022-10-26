import java.awt.*;

public class Rect extends Shape {
    private int w;	// Fields
    private int h;

    public Rect(Point initPos, Color col, int width, int height){
        super(initPos, col); // The constructor
        w=width;	// Initialize the fields of the object
        h=height;
    }

    @Override
    public void draw(Graphics g) {  // A method that draws the object in c
        g.setColor(col);
        g.fillRect(pos.x, pos.y, w, h);
    }
}
