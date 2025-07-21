import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    private final JButton button;

    public MyFrame() {

        ImageIcon originalIcon = new ImageIcon(Main.class.getResource("/bigBike.png"));
        Image scaledImage = originalIcon.getImage().getScaledInstance(150, 100, Image.SCALE_SMOOTH); // width, height
        ImageIcon image = new ImageIcon(scaledImage);

        button = new JButton("Hello");
        button.setBounds(200, 100, 300, 200);
        button.addActionListener(this);
        button.setText("Vroom Vroom");
        button.setFocusable(false);
        button.setIcon(image);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Robotica", Font.BOLD, 30));
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());

        //e ->  System.out.println("Hello")

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            System.out.println("Vroom!");
        }
    }

}
