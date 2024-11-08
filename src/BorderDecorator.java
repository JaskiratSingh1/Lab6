import java.awt.Stroke;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * The Border decorator.
 */
public class BorderDecorator extends Decorator {

    /**
     * Instantiate a new Border decorator
     *
     * @param component the component
     * @param x         the x
     * @param y         the y
     * @param width     the width
     * @param height    the height
     */
    public BorderDecorator(Component component, int x, int y, int width, int height) {
        super(component, x, y, width, height);
    }

    /**
     * Draw border graphics
     *
     * @param g the Graphics input parameter
     */
    @Override
    public void draw(Graphics g) {
        super.draw(g);

        // Cast Graphics to Graphics2D to use advanced features
        Graphics2D g2d = (Graphics2D) g;

        // Create and set a dashed stroke
        Stroke dashed = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
        g2d.setStroke(dashed);

        // Set the color for the border
        g2d.setColor(Color.BLACK);

        // Draw the dashed rectangle border
        g2d.drawRect(x, y, width, height);
    }
}
