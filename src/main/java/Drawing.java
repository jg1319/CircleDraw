import Shapes.Square;
import Shapes.Circle;
import Shapes.Rect;
import Shapes.Shape;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Drawing extends Canvas {
    // A private field called f of AWT class Frame..
    private Frame f;
    private Circle circ;
    private Rect rect;
    private Square square;
    private ArrayList<Shape> shapes=new ArrayList<>();

    // The constructor
    public Drawing(){
        Point p= new Point(200,200);
        Point p2= new Point(100, 100);
        Point p3= new Point(300, 100);
        Color c= new Color(0x992266);// The RGB number comprises three bytes: red, green and blue
        Color c2= new Color(0x592266);
        Color c3= new Color(0x995696);
        circ = new Circle(p,c,50);
        rect = new Rect(p2,c2,60,40);
        square = new Square(p3,c3,50);


        for (int i=0;i<100;i=i+10){
            //Point p4 = new Point(i,i);
            //Circle temp = new Circle(p4, c3, 30);
            //shapes.add(temp);

            shapes.add(circ);
            shapes.add(rect);
            shapes.add(square);
        }

        setupFrame();
        setupCanvas();
    }

    private void setupCanvas() {
        setBackground(Color.WHITE); 	// Sets the Canvas background
        setSize(400, 400);		// Sets the Canvas size to be the same as the frame
    }

    private void setupFrame() {
        f = new Frame("My window"); 	// Instantiates the Frame
        f.add(this);			// Adds the Canvas (ie this object) to the Frame
        f.setLayout(null);		// Stops the frame from trying to layout contents
        f.setSize(400, 400);		// Sets the dimensions of the frame
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {	// Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }


    public void paint(Graphics g){

        for (Shape s: shapes){
            s.draw(g);
        }

    }

}
