import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args){

        ImageIcon originalIcon = new ImageIcon(Main.class.getResource("/bigBike.png"));
        Border border = BorderFactory.createLineBorder(Color.lightGray, 3);

        Image scaledImage = originalIcon.getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH); // width, height
        ImageIcon image = new ImageIcon(scaledImage);

        JLabel label = new JLabel(); //creates new label object
        label.setText("Vroom Vroom"); //set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text left, center, or right of image icon
        label.setVerticalTextPosition(JLabel.TOP);// set text top, center or bottom of image icon
        label.setForeground(Color.lightGray);
        label.setFont(new Font("Robotica", Font.BOLD, 35));
        label.setIconTextGap(-5); // gap of text to image
        label.setBackground(Color.black);
        label.setOpaque(true); // display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position to center
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position to center
        //label.setBounds(250, 100, 400, 300); // set x,y positions

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(800, 500);
        //frame.setLayout(null); //layout of whole to be movable
        frame.add(label);
        frame.pack(); //size of frame will adjust based on whats inside
    }
}
