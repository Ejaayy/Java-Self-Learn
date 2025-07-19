import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame() {

        this.setTitle("JFrame title lets go");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false); //cant edit size
        this.setSize(420,420); //dimension
        this.setVisible(true);

        ImageIcon image = new ImageIcon(Main.class.getResource("/bigBike.png")); //create icon
        this.setIconImage(image.getImage()); //change icon of frame
        this.getContentPane().setBackground(Color.gray);

    }
}
