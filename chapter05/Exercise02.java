import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JFrame;

/**
 * Exercise 5.2
 *
 * Draw a stack diagram that shows the state of
 * the program the second time ping is invoked.
 *
 * @author Eli Heuer
 */

public class Exercise02 extends Canvas {

    public Font mainFont;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Exercise 2");
        Canvas canvas = new Exercise02();
        canvas.setSize(512, 512);
        canvas.setBackground(Color.lightGray);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);

    }

    public void paint(Graphics g) {
        Rectangle box = new Rectangle(64, 64, 128, 64);
        // Rectangle boxBg = new Rectangle(64, 64, 384, 384);
        sBox(g, box);
        // sBox(g, boxBg)
    }
    
    public void boxRect(Graphics g, Rectangle box) {
        g.setColor(Color.GRAY);
        g.fillRect(box.x, box.y, box.width, box.height);
    }

    public void sBox(Graphics g, Rectangle box) {
        // boxBg(g, boxBg);
        boxRect(g, box);
        box.translate(256,256);
        boxRect(g, box);

        //int dx = box.width / 2;
        //int dy = box.height / 2;
        //Rectangle stackBox = new Rectangle(box.x, box.y, dx, dy);

        //stackBox.translate(-dx / 2, -dy / 2);
        //boxRect(g, stackBox);

        //stackBox.translate(dx * 2, 0);
        //boxRect(g, stackBox);
    }

}
