import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextField extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;
    TextField(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("submit");
        button.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(500,100));
        textField.setFont(new Font("Consolas",Font.PLAIN,35));
        textField.setForeground(new Color(0,250,0));
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.white);
        textField.setText("username");

        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }
    public static void main(String[] args) {

        //JTextField = A GUI textbox component that can be used to add, set, or get text
        TextField frame = new TextField();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            System.out.println("Welcome "+textField.getText());
            button.setEnabled(false);
            textField.setEnabled(false);
        }
    }
}
