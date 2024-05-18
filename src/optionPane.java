import javax.swing.*;

public class optionPane {
    public static void main(String[] args) {
        // JOptionPane = pop up a standard dialog box that prompts users for a value
        //               or informs them of something

        //JOptionPane.showMessageDialog(null, "this is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "this is more useless info :D", "title", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "really", "title", JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "You're computer has A VIRUS!!!", "title", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Call tech support NOW OR ELSE!!!", "title", JOptionPane.ERROR_MESSAGE);

        /*int answer = JOptionPane.showConfirmDialog(null, "bro, do you even code?", "this is my title", JOptionPane.YES_NO_CANCEL_OPTION);
        System.out.println(answer); //return 0 when yes, 1 when no, 2 when cancel
        String name = JOptionPane.showInputDialog("What is your name? : ");
        System.out.println(name);*/

        String[] responses = {"No, you're awesome!", "thank you!", "*blush*"};
        ImageIcon icon = new ImageIcon("smile.png");
        JOptionPane.showOptionDialog(null,
                "You are awesome!",
                "secret message",
                JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.
                        INFORMATION_MESSAGE,
                icon,
                responses,
                0);
    }
}
