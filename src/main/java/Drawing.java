import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Drawing extends Canvas {
    // A private field called f of AWT class Frame..
    private Frame f;
    private Circle circ;
    private Rect rect;
    private Square square;

    // The constructor
    public Drawing(){
        Point p= new Point(200,200);
        Point p2= new Point(100, 100);
        Color c= new Color(0x992266);// The RGB number comprises three bytes: red, green and blue
        Color c2= new Color(0x592266);
        circ = new Circle(p,c,50);
        rect = new Rect(p2,c2,60,40);
        square = new Square(p2,c2,50);

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
        circ.draw(g);
        //rect.draw(g);
        square.draw(g);
    }

}
