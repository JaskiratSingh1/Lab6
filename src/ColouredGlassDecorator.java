import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.AlphaComposite;

/**
 * The Coloured glass decorator for exercise B
 */
public class ColouredGlassDecorator extends Decorator {
    private int thickness;

    /**
     * Instantiates a new Coloured glass decorator.
     *
     * @param component the component
     * @param x         the x
     * @param y         the y
     * @param width     the width
     * @param height    the height
     */
    public ColouredGlassDecorator(Component component, int x, int y, int width, int height) {
        super(component, x, y, width, height);
        this.thickness = thickness;
    }

    /**
     * Draw transparent "glass" layer
     *
     * @param g the Graphics input parameter
     */
    @Override
    public void draw(Graphics g) {
        super.draw(g);
        Graphics2D g2d = (Graphics2D) g;

        // Set transparency level for the glass effect
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1 * 0.1f));

        // Set color to green for the glass frame
        g2d.setColor(Color.yellow);

        // Draw the filled rectangle with transparency
        g2d.fillRect(25, 25, 110, 110);
    }
}