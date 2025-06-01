package bouncethread;

import javax.swing.JFrame;

public class BounceThread {
    public static void main(String[] args) {
        JFrame frame = new BounceFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);  // Cambiado de show() a setVisible(true)
    }
}
