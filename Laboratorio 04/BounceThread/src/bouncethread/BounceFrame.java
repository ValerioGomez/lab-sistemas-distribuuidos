package bouncethread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class BounceFrame extends JFrame {
    private BallCanvas canvas;
    public static final int WIDTH = 450;
    public static final int HEIGHT = 350;

    public BounceFrame() {
        setSize(WIDTH, HEIGHT);
        setTitle("BounceThread");
        Container contentPane = getContentPane();
        canvas = new BallCanvas();

        contentPane.add(canvas, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();

        addButton(buttonPanel, "Start", new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addBall();
            }
        });

        addButton(buttonPanel, "Close", new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                System.exit(0);
            }
        });

        contentPane.add(buttonPanel, BorderLayout.SOUTH);
    }

    public void addButton(Container c, String title, ActionListener listener) {
        JButton button = new JButton(title);
        c.add(button);
        button.addActionListener(listener);
    }

    public void addBall() {
        Ball b = new Ball(canvas);
        canvas.add(b);
        BallThread thread = new BallThread(b);
        thread.start();
    }

    class BallThread extends Thread {
        private Ball b;

        public BallThread(Ball aBall) {
            b = aBall;
        }

        public void run() {
            try {
                for (int i = 1; i <= 10000; i++) {
                    b.move();
                    canvas.repaint();  // <-- REPINTAR para animar correctamente
                    sleep(5);
                }
            } catch (InterruptedException exception) {
                // Sin manejo explícito
            }
        }
    }
}
