import java.awt.Color;
import java.awt.Graphics;

public class Text implements Component {
    private int x;
    private int y;
    private String text;

    public Text(String inputText, int xInput, int yInput) {
        this.x = xInput;
        this.y = yInput;
        this.text = inputText;
    }

    /**
     * Draw graphics
     *
     * @param g the Graphics input parameter
     */
    @Override
    public void draw(Graphics g) {
        // Exercise specified text color as green
        g.setColor(Color.GREEN);
        g.drawString(text, x, y);
    }
}
