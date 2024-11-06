import java.awt.Graphics;

/**
 * The Decorator abstract class
 */
public abstract class Decorator implements Component {
    protected Component component;
    protected int x, y, width, height;

    /**
     * Instantiate a new Decorator
     *
     * @param component the component
     * @param x         the x
     * @param y         the y
     * @param width     the width
     * @param height    the height
     */
    public Decorator(Component component, int x, int y, int width, int height) {
        this.component = component;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    /**
     * Draw graphics default method
     *
     * @param g the Graphics input parameter
     */
    @Override
    public void draw(Graphics g) {
        component.draw(g);
    }
}