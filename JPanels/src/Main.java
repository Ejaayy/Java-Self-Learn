import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        ImageIcon originalIcon = new ImageIcon(Main.class.getResource("/imagesgorilla.jpg"));
        Border border = BorderFactory.createLineBorder(Color.lightGray, 3);

        Image scaledImage = originalIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(scaledImage);

        JLabel label = new JLabel();
        label.setText("Hello World");
        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.RIGHT);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setBounds(100, 150, 120, 120);  // now this will take effect

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(0, 0, 250, 250);
        bluePanel.setLayout(null);  // allow custom placement

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(250, 0, 250, 250);
        redPanel.setLayout(null);  // <<< THIS lets you control label manually
        redPanel.add(label);      // manual layout now works

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(null); // optional if you want control here too

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);  // so you can use setBounds on panels
        frame.setSize(750, 750);
        frame.setVisible(true);

        frame.add(bluePanel);
        frame.add(redPanel);
        frame.add(greenPanel);
    }
}
