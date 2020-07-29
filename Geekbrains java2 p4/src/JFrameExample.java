import javax.swing.*;
import java.awt.*;

public class JFrameExample {
    static GraphicsConfiguration gc;

    public static void main(String[] args) {
        JFrame frame = new JFrame(gc);
        frame.setTitle("Welcome to Java");
        frame.setSize(600,400);
        frame.setVisible(true);
    }
}
