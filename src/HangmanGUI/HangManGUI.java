/*
 * Created by JFormDesigner on Mon Feb 28 10:36:13 EST 2022
 */

package HangmanGUI;

import org.junit.jupiter.api.parallel.Resources;

import java.awt.*;
import java.awt.event.*;
import java.util.Objects;
import java.util.ResourceBundle;
import javax.swing.*;

/**
 * @author unknown
 */
public class HangManGUI extends JFrame {
    public HangManGUI() {
        initComponents();
    }
    public Communicator communicator;
    private void submitGuess(ActionEvent e) {
        // TODO add your code here
        System.out.println("Clicked");
        System.out.println("Text in GuessTextBox is " + GuessTextBox.getText());
        communicator.communicate(GuessTextBox.getText());
    }
    public void setCommunicator(Communicator communicator){
        this.communicator = communicator;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Stephen Osei-Owusu
        label1 = new JLabel();
        nametextfield = new JTextField();
        currentwordTextField = new JTextField();
        label2 = new JLabel();
        GuessTextBox = new JTextField();
        label3 = new JLabel();
        submitGuessButton = new JButton();
        ResultLabel = new JLabel();
        hangManImagePanel = new JLabel();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Name");
        contentPane.add(label1);
        label1.setBounds(20, 25, 120, 35);
        contentPane.add(nametextfield);
        nametextfield.setBounds(165, 25, 205, 30);

        //---- currentwordTextField ----
        currentwordTextField.setEditable(false);
        contentPane.add(currentwordTextField);
        currentwordTextField.setBounds(185, 375, 205, currentwordTextField.getPreferredSize().height);

        //---- label2 ----
        label2.setText("Current Word");
        contentPane.add(label2);
        label2.setBounds(30, 380, 105, label2.getPreferredSize().height);

        //---- GuessTextBox ----
        GuessTextBox.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        contentPane.add(GuessTextBox);
        GuessTextBox.setBounds(185, 420, 205, GuessTextBox.getPreferredSize().height);

        //---- label3 ----
        label3.setText("Enter Guess");
        contentPane.add(label3);
        label3.setBounds(30, 420, 90, label3.getPreferredSize().height);

        //---- submitGuessButton ----
        submitGuessButton.setText("Submit");
        submitGuessButton.addActionListener(e -> submitGuess(e));
        contentPane.add(submitGuessButton);
        submitGuessButton.setBounds(25, 455, 150, submitGuessButton.getPreferredSize().height);
        contentPane.add(ResultLabel);
        ResultLabel.setBounds(185, 335, 195, 30);
        contentPane.add(hangManImagePanel);
        hangManImagePanel.setBounds(30, 80, 405, 290);
        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }

        pack();
        GuessTextBox.setText("Enter text here:");
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    public static void main(String []args){
        Communicator communicator;
        HangManGUI hangManGUI = new HangManGUI();
        hangManGUI.setVisible(true);


        System.out.println("Testing");
        HangMan hangMan = new HangMan();
        hangManGUI.setImage(hangMan.wrongs);
        communicator = new Communicator() {
            @Override
            public void communicate(String s) {
              System.out.println("S is " + s);
              hangMan.guess((char) s.charAt(0));
              hangManGUI.setImage(hangMan.wrongs);
            }
        };
        hangManGUI.setCommunicator(communicator);
        //hangManGUI.hangManImagePanel.setIcon(new ImageIcon(get));





    }
    public void setImage(int imageS){
        imageS += 4;
        String imageF = "/" + imageS + ".jpg";
        try {
            hangManImagePanel.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource(imageF))));
        }catch(Exception e){

        }

    }
    public void startGame(){


    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Stephen Osei-Owusu
    private JLabel label1;
    private JTextField nametextfield;
    private JTextField currentwordTextField;
    private JLabel label2;
    private JTextField GuessTextBox;
    private JLabel label3;
    private JButton submitGuessButton;
    private JLabel ResultLabel;
    private JLabel hangManImagePanel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
