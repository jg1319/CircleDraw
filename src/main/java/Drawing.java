import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Drawing extends Canvas {
    // A private field called f of AWT class Frame..
    private Frame f;
    private Circle circ;

    // The constructor
    public Drawing(){
        Point p= new Point(200,200);
        Color c= new Color(0x992266);// The RGB number comprises three bytes: red, green and blue
        circ = new Circle(p,c,50);

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
        setBackground(Color.WHITE); 	// Sets the Canvas background
        setSize(400, 400);		// Sets the Canvas size to be the same as the frame
    }


    public void paint(Graphics g){
        circ.draw(g);
    }

}
