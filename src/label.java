import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class label {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("jordon.png");
        Border border = BorderFactory.createLineBorder(new Color(150,200,255), 3);

        JLabel label = new JLabel(); //create a label
        label.setText("Bro, do you even code?"); //set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);//set text left, center, right of imageicon
        label.setVerticalTextPosition(JLabel.TOP);//set text top,center, bottom of imageicon
        label.setForeground(new Color(150,200,255)); //set font color of text
        label.setFont(new Font("MV Boli", Font.PLAIN, 25)); //set font of text
        label.setIconTextGap(25);//set gap of text to image
        label.setBackground(Color.BLACK);//set background color
        label.setOpaque(true); //display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
        //label.setBounds(100,100,350,350); //set x,y position within frame as well as dimensions

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(1000,1000);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}
