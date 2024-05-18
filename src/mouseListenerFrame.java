import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class mouseListenerFrame extends JFrame implements MouseListener {

    JLabel label;
    ImageIcon smile;
    ImageIcon laugh;
    ImageIcon opps;
    ImageIcon poo;
    ImageIcon frozen;
    mouseListenerFrame(){
        /*this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        this.addMouseListener(this);

        this.add(label);
        this.setVisible(true);*/

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        label = new JLabel();
        label.addMouseListener(this);

        smile = new ImageIcon("smile2.png");
        laugh = new ImageIcon("laugh.png");
        opps = new ImageIcon("opps.png");
        poo = new ImageIcon("poo.png");
        frozen = new ImageIcon("frozen.png");

        label.setIcon(smile);

        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null); //set frame in the middle of screen
        this.setVisible(true);
    }
    public static void main(String[] args) {
        mouseListenerFrame frame = new mouseListenerFrame();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //System.out.println("You clicked the mouse");
        label.setIcon(frozen);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //System.out.println("You pressed the mouse");
        //label.setBackground(Color.yellow);
        label.setIcon(opps);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //System.out.println("You released the mouse");
        //label.setBackground(Color.GREEN);
        label.setIcon(poo);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //System.out.println("You entered the component");
        //label.setBackground(Color.blue);
        label.setIcon(laugh);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //System.out.println("You exited the component");
        //label.setBackground(Color.red);
        label.setIcon(opps);
    }
}
