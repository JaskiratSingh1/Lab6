import java.awt.Color;
import java.awt.Graphics;

/**
 * The Text component
 */
public class Text implements Component {
    private int x;
    private int y;
    private String text;

    /**
     * Instantiate a new Text
     *
     * @param inputText the input text
     * @param xInput    the x input
     * @param yInput    the y input
     */
    public Text(String inputText, int xInput, int yInput) {
        this.x = xInput;
        this.y = yInput;
        this.text = inputText;
    }

    /**
     * Draw the text on the screen
     *
     * @param g the Graphics input parameter
     */
    @Override
    public void draw(Graphics g) {
        // Exercise specified text color as green
        g.setColor(Color.BLACK);
        g.drawString(text, x, y);
    }
}
