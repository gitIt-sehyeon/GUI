import javax.swing.*;
import java.awt.*;

public class jLayeredPane {
    public static void main(String[] args) {

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.red);
        label1.setBounds(50,50,200,200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.green);
        label2.setBounds(100,100,200,200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.blue);
        label3.setBounds(150,150,200,200);

        JLayeredPane layeredpane = new JLayeredPane();
        layeredpane.setBounds(0,0,500,500);

        layeredpane.add(label1, Integer.valueOf(0)); //which one is bottom
        layeredpane.add(label2, Integer.valueOf(2)); //which one is top
        layeredpane.add(label3, Integer.valueOf(1)); //which one is middle


        JFrame frame = new JFrame("JLateredPane");
        frame.add(layeredpane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
