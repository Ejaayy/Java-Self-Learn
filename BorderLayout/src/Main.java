import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout(10,10)); // the numbers are margin
        frame.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.RED);
        panel2.setBackground(Color.GREEN);
        panel3.setBackground(Color.YELLOW);
        panel4.setBackground(Color.MAGENTA);
        panel5.setBackground(Color.BLUE);

        panel1.setPreferredSize(new Dimension(100, 75));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 50));
        panel4.setPreferredSize(new Dimension(50, 100));
        panel5.setPreferredSize(new Dimension(150, 100));

        // ------------------- Center Panel Sub panels -------------------

            panel2.setLayout(new BorderLayout());

            JPanel panel6 = new JPanel();
            JPanel panel7 = new JPanel();
            JPanel panel8 = new JPanel();
            JPanel panel9 = new JPanel();
            JPanel panel10 = new JPanel();

            panel6.setBackground(Color.black);
            panel7.setBackground(Color.darkGray);
            panel8.setBackground(Color.gray);
            panel9.setBackground(Color.lightGray);
            panel10.setBackground(Color.white);

            panel6.setPreferredSize(new Dimension(50, 50));
            panel7.setPreferredSize(new Dimension(50, 50));
            panel8.setPreferredSize(new Dimension(50, 50));
            panel9.setPreferredSize(new Dimension(50, 50));
            panel10.setPreferredSize(new Dimension(50, 50));

            panel2.add(panel6, BorderLayout.NORTH);
            panel2.add(panel7, BorderLayout.CENTER);
            panel2.add(panel8, BorderLayout.SOUTH);
            panel2.add(panel9, BorderLayout.EAST);
            panel2.add(panel10, BorderLayout.WEST);

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.CENTER);
        frame.add(panel3, BorderLayout.SOUTH);
        frame.add(panel4, BorderLayout.EAST);
        frame.add(panel5, BorderLayout.WEST);


    }
}