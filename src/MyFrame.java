import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    MyFrame(){
        ImageIcon icon = new ImageIcon("jordon.png");
        ImageIcon icon2 = new ImageIcon("smile.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(200,500,250,250);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(200,100,250,250);
        button.addActionListener(this);
        //button.addActionListener(e -> System.out.println("poo"));
        //using this instead of implements ActionListener
        button.setText("i'm a button");
        button.setFocusable(false); //can't receive keyboard input
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic sans",Font.BOLD,25));
        button.setIconTextGap(-15);
        button.setForeground(Color.cyan); //set font color
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder()); //kinda 3D effect
        //button.setEnabled(false);

        this.setTitle("Jthis title goes here"); //sets title of this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        this.setResizable(false); //prevent this from being resized
        this.setSize(1000, 1000); //sets the x-dimension, and y-dimension of this
        this.setVisible(true); //make this visible
        this.setLayout(null);
        this.add(button);
        this.add(label);

        ImageIcon image = new ImageIcon("jordon.png"); //create an ImageIcon
        this.setIconImage(image.getImage()); //change icon of this
        this.getContentPane().setBackground(new Color(200,200,255)); //change color of background
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            //System.out.println("poo");
            //button.setEnabled(false); //set button enabled
            //can click button only once
            label.setVisible(true);
        }
    }
}
