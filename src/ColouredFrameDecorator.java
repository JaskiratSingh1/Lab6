import java.awt.*;

public class ColouredFrameDecorator extends  Decorator {
    private final int thickness;

    public ColouredFrameDecorator(Component component, int x, int y, int width, int height, int thickness) {
        super(component, x, y, width, height);
        this.thickness = thickness;
    }

    @Override
    public void draw(Graphics g) {
        super.draw(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.RED);
        g2d.setStroke(new BasicStroke(thickness));
        g2d.drawRect(x, y, width, height);
    }
}
