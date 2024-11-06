import java.awt.*;

/**
 * The Coloured frame decorator
 */
public class ColouredFrameDecorator extends  Decorator {
    private final int thickness;

    /**
     * Instantiate a new Coloured frame decorator
     *
     * @param component the component
     * @param x         the x
     * @param y         the y
     * @param width     the width
     * @param height    the height
     * @param thickness the thickness
     */
    public ColouredFrameDecorator(Component component, int x, int y, int width, int height, int thickness) {
        super(component, x, y, width, height);
        this.thickness = thickness;
    }

    /**
     * Draw a colored frame
     *
     * @param g the Graphics input parameter
     */
    @Override
    public void draw(Graphics g) {
        component.draw(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.RED);
        g2d.setStroke(new BasicStroke(thickness));
        g2d.drawRect(x, y, width, height);
    }
}
