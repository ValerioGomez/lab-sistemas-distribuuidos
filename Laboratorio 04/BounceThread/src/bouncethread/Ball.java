package bouncethread;

import java.awt.Graphics2D;
import java.awt.Component;
import java.awt.geom.Ellipse2D;

class Ball {
    private Component canvas;
    private static final int XSIZE = 15;
    private static final int YSIZE = 15;
    private int x = 0;
    private int y = 0;
    private int dx = 2;
    private int dy = 2;

    public Ball(Component c) {
        canvas = c;
    }

    public void draw(Graphics2D g2) {
        g2.fill(new Ellipse2D.Double(x, y, XSIZE, YSIZE));
    }

    public void move() {
        x += dx;
        y += dy;

        if (x < 0) {
            x = 0;
            dx = -dx;
        }

        if (x + XSIZE >= canvas.getWidth()) {
            x = canvas.getWidth() - XSIZE;
            dx = -dx;
        }

        if (y < 0) {
            y = 0;
            dy = -dy;
        }

        if (y + YSIZE >= canvas.getHeight()) {
            y = canvas.getHeight() - YSIZE;
            dy = -dy;
        }
    }
}
